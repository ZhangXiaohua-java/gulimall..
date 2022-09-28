package cloud.huel.mall.member.service.impl;

import cloud.huel.mall.member.entity.MemberLoginLog;
import cloud.huel.mall.member.mapper.MemberLoginLogMapper;
import cloud.huel.mall.member.service.IMemberLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogMapper, MemberLoginLog> implements IMemberLoginLogService {

}
