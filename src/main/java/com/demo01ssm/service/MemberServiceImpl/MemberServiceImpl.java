package com.demo01ssm.service.MemberServiceImpl;

import com.demo01ssm.dao.MemberDao;
import com.demo01ssm.pojo.Member;
import com.demo01ssm.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *@Date: 15:24 2019/12/30
 *@Description:
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;

    @Override
    public Integer addMember(Member member) {
        return memberDao.add(member);
    }

    @Override
    public Integer updateMember(Member member) {
        return memberDao.update(member);
    }

    @Override
    public Integer deleteMember(Integer id) {
        return memberDao.delete(id);
    }

    @Override
    public Member selectById(Integer id) {
        return memberDao.getById(id);
    }

    @Override
    public List<Member> findByName(String name) {
        return memberDao.findByName(name);
    }
}
