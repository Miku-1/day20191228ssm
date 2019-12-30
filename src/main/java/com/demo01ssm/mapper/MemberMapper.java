package com.demo01ssm.mapper;

import com.demo01ssm.pojo.Member;
import com.demo01ssm.pojo.MemberExample;
import java.util.List;


import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Member record);

    int updateByExample(@Param("record") Member record);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}