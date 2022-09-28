package cloud.huel.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("mq_message")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private String messageId;

    private String content;

    private String toExchane;

    private String routingKey;

    private String classType;

    /**
     * 0-新建 1-已发送 2-错误抵达 3-已抵达
     */
    private Integer messageStatus;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
