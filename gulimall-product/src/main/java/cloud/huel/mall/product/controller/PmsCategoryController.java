package cloud.huel.mall.product.controller;


import cloud.huel.mall.product.entity.PmsCategory;
import cloud.huel.mall.product.service.IPmsCategoryService;
import cloud.huel.mall.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@RestController
@RequestMapping("/product/category")
public class PmsCategoryController {

	@Resource
	private IPmsCategoryService categoryService;

	/**
	 * 返回树形目录信息
	 *
	 * @return Result<List < PmsCategory>>
	 */
	@GetMapping("/tree")
	public Result categoryTree() {
		Comparator<PmsCategory> comparator = (o1, o2) -> o1.getSort() == null ? 0 : o1.getSort() - o2.getSort() == 0 ? 0 : o2.getSort();
		List<PmsCategory> categoryList = categoryService.getAllCategories();
		// 收集所有的一级目录,将所有的导航以属性结构排列
		List<PmsCategory> top = categoryList.stream().filter(c -> c.getParentCid() == 0)
				.sorted(comparator)
				.map(e -> {
					return getChildCategories(categoryList, e, comparator);
				})
				.collect(Collectors.toList());
		return Result.ofSuccess().setData(top);
	}

	private PmsCategory getChildCategories(List<PmsCategory> categories, PmsCategory category, Comparator<PmsCategory> comparator) {
		List<PmsCategory> list = categories.stream()
				.filter(c -> c.getParentCid() == category.getCatId())
				.map(e -> {
					// 递归查找子节点
					return getChildCategories(categories, e, comparator);
				})
				.sorted(comparator)
				.collect(Collectors.toList());
		category.setChildCategories(list);
		return category;
	}

	@PostMapping("/delete")
	public Result deleteCategories(@RequestBody long[] ids) {
		boolean flag = categoryService.deleteCategoryWithChildCategories(ids);
		if (flag) {
			return Result.ofSuccess();
		}
		return Result.ofError();
	}


}

