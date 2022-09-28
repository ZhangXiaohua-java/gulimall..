package cloud.huel.mall.order.service.impl;

import cloud.huel.mall.order.entity.OrderSetting;
import cloud.huel.mall.order.mapper.OrderSettingMapper;
import cloud.huel.mall.order.service.IOrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单配置信息 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements IOrderSettingService {

}
