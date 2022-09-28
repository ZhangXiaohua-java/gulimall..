package cloud.huel.mall.member.service.impl;

import cloud.huel.mall.member.entity.Member;
import cloud.huel.mall.member.mapper.MemberMapper;
import cloud.huel.mall.member.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

}
