package cloud.huel.mall.coupon.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 秒杀活动
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSeckillPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 开始日期
     */
    private LocalDateTime startTime;

    /**
     * 结束日期
     */
    private LocalDateTime endTime;

    /**
     * 上下线状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private Long userId;


}
