package cloud.huel.mall.coupon.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠券与产品关联
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsCouponSpuRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;


}
