package cloud.huel.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 积分变化历史记录
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ums_integration_change_history")
public class IntegrationChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * create_time
     */
    private LocalDateTime createTime;

    /**
     * 变化的值
     */
    private Integer changeCount;

    /**
     * 备注
     */
    private String note;

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    private Integer sourceTyoe;


}
