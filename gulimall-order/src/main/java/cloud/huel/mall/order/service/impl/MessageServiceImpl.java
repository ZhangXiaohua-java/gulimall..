package cloud.huel.mall.order.service.impl;

import cloud.huel.mall.order.entity.Message;
import cloud.huel.mall.order.mapper.MessageMapper;
import cloud.huel.mall.order.service.IMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
