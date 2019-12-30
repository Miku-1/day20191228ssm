package com.quiz;

/*
 *@Date: 15:31 2019/12/30
 *@Description:
 */

import com.demo01ssm.pojo.Member;
import com.demo01ssm.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-mapper.xml"})
public class Test1 {

    @Autowired
    private MemberService memberService;
    @Test
    public void addMember(){
        Member member = new Member();
//        member.setId(12345);
        member.setPassword("123456");
        member.setImgUrl("http");
        member.setNickName("雪女");
        member.setSex("female");
        member.setQqNumber(97863231);
        Integer result = memberService.addMember(member);
        System.out.println(result);

    }

    @Test
    public void selectMember(){
        Member mem1;
        mem1 =  memberService.selectById(3);
        System.out.println(mem1);
    }
    @Test
    public void deleteMember(){
        Integer result = memberService.deleteMember(17);
        System.out.println(result);

    }


    @Test
    public void updateMember(){
        Member member = new Member();
        member.setId(3);
        member.setPassword("123456");
        member.setImgUrl("http");
        member.setNickName("雪初音");
        member.setSex("female");
        member.setQqNumber(289049412);
        Integer result = memberService.updateMember(member);
        System.out.println(result);

    }

    @Test
    public void findByname(){
        List<Member> members = memberService.findByName("雪");

        for (Member member : members) {
            System.out.println(member.toString());

        }

    }


}
