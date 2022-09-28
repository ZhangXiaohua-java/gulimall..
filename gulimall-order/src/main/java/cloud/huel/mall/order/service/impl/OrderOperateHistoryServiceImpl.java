package cloud.huel.mall.order.service.impl;

import cloud.huel.mall.order.entity.OrderOperateHistory;
import cloud.huel.mall.order.mapper.OrderOperateHistoryMapper;
import cloud.huel.mall.order.service.IOrderOperateHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements IOrderOperateHistoryService {

}
