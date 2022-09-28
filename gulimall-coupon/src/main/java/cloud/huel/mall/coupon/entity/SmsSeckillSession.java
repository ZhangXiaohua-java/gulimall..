package cloud.huel.mall.coupon.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 秒杀活动场次
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSeckillSession implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场次名称
     */
    private String name;

    /**
     * 每日开始时间
     */
    private LocalDateTime startTime;

    /**
     * 每日结束时间
     */
    private LocalDateTime endTime;

    /**
     * 启用状态
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
