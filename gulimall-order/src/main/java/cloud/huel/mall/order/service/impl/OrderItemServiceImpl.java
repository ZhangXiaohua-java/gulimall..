package cloud.huel.mall.order.service.impl;

import cloud.huel.mall.order.entity.OrderItem;
import cloud.huel.mall.order.mapper.OrderItemMapper;
import cloud.huel.mall.order.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
