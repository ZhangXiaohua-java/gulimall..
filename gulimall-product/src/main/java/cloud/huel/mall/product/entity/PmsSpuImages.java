package cloud.huel.mall.product.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * spu图片
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsSpuImages implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 图片名
     */
    private String imgName;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 顺序
     */
    private Integer imgSort;

    /**
     * 是否默认图
     */
    private Integer defaultImg;


}
