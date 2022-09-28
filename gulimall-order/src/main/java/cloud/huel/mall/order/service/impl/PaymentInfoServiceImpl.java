package cloud.huel.mall.order.service.impl;

import cloud.huel.mall.order.entity.PaymentInfo;
import cloud.huel.mall.order.mapper.PaymentInfoMapper;
import cloud.huel.mall.order.service.IPaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付信息表 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements IPaymentInfoService {

}
