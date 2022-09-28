package cloud.huel.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 退货原因
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("oms_order_return_reason")
public class OrderReturnReason implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 退货原因名
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 启用状态
     */
    private Boolean status;

    /**
     * create_time
     */
    private LocalDateTime createTime;


}
