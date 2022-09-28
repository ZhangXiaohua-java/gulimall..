package cloud.huel.mall.order.service.impl;

import cloud.huel.mall.order.entity.OrderReturnReason;
import cloud.huel.mall.order.mapper.OrderReturnReasonMapper;
import cloud.huel.mall.order.service.IOrderReturnReasonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 退货原因 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReason> implements IOrderReturnReasonService {

}
