package com.demo01ssm.dao;

/*
 *@Date: 15:15 2019/12/30
 *@Description:
 */

import com.demo01ssm.mapper.MemberMapper;
import com.demo01ssm.pojo.Member;
import com.demo01ssm.pojo.MemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDao {

    @Autowired
    private MemberMapper memberMapper;

    public Integer add(Member member){
        return  memberMapper.insert(member);
    }

    public Integer delete(Integer id){
        return memberMapper.deleteByPrimaryKey(id);
    }
    public Integer update(Member member){
        return memberMapper.updateByPrimaryKey(member);
    }
    public Member getById(Integer id){
        return memberMapper.selectByPrimaryKey(id);
    }
    public List<Member> findByName(String name){
//        String sql = "SELECT * FROM t_member LIKE '%"+name+"%'";
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andNickNameLike("%"+name+"%");
        return memberMapper.selectByExample(memberExample);

    }


}
