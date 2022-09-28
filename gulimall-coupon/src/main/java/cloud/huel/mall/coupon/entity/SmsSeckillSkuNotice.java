package cloud.huel.mall.coupon.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 秒杀商品通知订阅
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSeckillSkuNotice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 活动场次id
     */
    private Long sessionId;

    /**
     * 订阅时间
     */
    private LocalDateTime subcribeTime;

    /**
     * 发送时间
     */
    private LocalDateTime sendTime;

    /**
     * 通知方式[0-短信，1-邮件]
     */
    private Boolean noticeType;


}
