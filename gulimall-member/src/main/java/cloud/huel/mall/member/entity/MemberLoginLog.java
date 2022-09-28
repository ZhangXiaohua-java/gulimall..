package cloud.huel.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员登录记录
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ums_member_login_log")
public class MemberLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * ip
     */
    private String ip;

    /**
     * city
     */
    private String city;

    /**
     * 登录类型[1-web，2-app]
     */
    private Boolean loginType;


}
