package cloud.huel.mall.product.service;

import cloud.huel.mall.product.entity.PmsCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
public interface IPmsCategoryService extends IService<PmsCategory> {

	/**
	 * 查询所有目录信息
	 *
	 * @return List<PmsCategory>
	 */
	List<PmsCategory> getAllCategories();


	/**
	 * 删除导航栏及其子节点
	 *
	 * @param ids
	 * @return
	 */
	boolean deleteCategoryWithChildCategories(long[] ids);


}
