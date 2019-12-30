package com.demo01ssm.service;

/*
 *@Date: 15:22 2019/12/30
 *@Description:
 */

import com.demo01ssm.pojo.Member;

import java.util.List;


public interface MemberService {

    Integer addMember(Member member);

    Integer updateMember(Member member);

    Integer deleteMember(Integer id);

    Member selectById(Integer id);

    List<Member> findByName(String name);

}
