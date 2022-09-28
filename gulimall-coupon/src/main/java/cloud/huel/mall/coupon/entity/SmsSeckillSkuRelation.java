package cloud.huel.mall.coupon.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 秒杀活动商品关联
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSeckillSkuRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动id
     */
    private Long promotionId;

    /**
     * 活动场次id
     */
    private Long promotionSessionId;

    /**
     * 商品id
     */
    private Long skuId;

    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;

    /**
     * 秒杀总量
     */
    private Integer seckillCount;

    /**
     * 每人限购数量
     */
    private Integer seckillLimit;

    /**
     * 排序
     */
    private Integer seckillSort;


}
