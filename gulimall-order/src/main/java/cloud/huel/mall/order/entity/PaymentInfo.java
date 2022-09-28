package cloud.huel.mall.order.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 支付信息表
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("oms_payment_info")
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号（对外业务号）
     */
    private String orderSn;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 支付宝交易流水号
     */
    private String alipayTradeNo;

    /**
     * 支付总金额
     */
    private BigDecimal totalAmount;

    /**
     * 交易内容
     */
    private String subject;

    /**
     * 支付状态
     */
    private String paymentStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 确认时间
     */
    private LocalDateTime confirmTime;

    /**
     * 回调内容
     */
    private String callbackContent;

    /**
     * 回调时间
     */
    private LocalDateTime callbackTime;


}
