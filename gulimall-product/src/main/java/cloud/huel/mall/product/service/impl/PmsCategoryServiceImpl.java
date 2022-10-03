package cloud.huel.mall.product.service.impl;

import cloud.huel.mall.product.entity.PmsCategory;
import cloud.huel.mall.product.mapper.PmsCategoryMapper;
import cloud.huel.mall.product.service.IPmsCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryMapper, PmsCategory> implements IPmsCategoryService {


	/**
	 * 查询所有目录信息
	 *
	 * @return List<PmsCategory>
	 */
	@Override
	public List<PmsCategory> getAllCategories() {
		PmsCategoryMapper mapper = this.getBaseMapper();
		List<PmsCategory> categoryList = mapper.selectList(null);
		return categoryList;
	}


	/**
	 * 删除导航栏及其子节点
	 *
	 * @param ids
	 * @return
	 */
	@Override
	public boolean deleteCategoryWithChildCategories(long[] ids) {
		PmsCategoryMapper mapper = this.baseMapper;
		// TODO 以后再做
		int count = 0;
		for (int i = 0; i < ids.length; i++) {
			mapper.deleteById(ids[i]);
			count++;
		}
		if (count > 0) {
			return true;
		}
		return false;
	}


}
