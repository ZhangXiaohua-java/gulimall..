package cloud.huel.mall.order.service.impl;

import cloud.huel.mall.order.entity.Order;
import cloud.huel.mall.order.mapper.OrderMapper;
import cloud.huel.mall.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
