package com.demo01ssm.controller;

/*
 *@Date: 15:17 2019/12/30
 *@Description:
 */

import com.demo01ssm.pojo.Member;
import com.demo01ssm.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("index")
    public String getIndex(){
        return "index";
    }

    @PostMapping(value = "add/member",produces = "text/html;charset=utf-8")
    public String addMember(Member member){
        Integer rs = memberService.addMember(member);
        if (rs.equals(1)){
            return "添加成功";
        }
        else{
            return "操作失败";
        }
    }

    @PostMapping(value = "update/member",produces = "text/html;charset=utf-8")
    public String updateMember(Member member){
        Integer rs = memberService.updateMember(member);
        if (rs.equals(1)){
            return "修改成功";
        }
        else{
            return "操作失败";
        }

    }

    @PostMapping(value = "find/member/id",produces = "text/html;charset=utf-8")
    public String searchMember(Integer id){
        Member member = memberService.selectById(id);
        return member.toString();

    }

    @PostMapping(value = "delete/member/id",produces = "text/html;charset=utf-8")
    public String deleteMember(Integer id){
        Integer rs = memberService.deleteMember(id);
        if (rs.equals(1)){
            return "删除成功";
        }
        else{
            return "操作失败";
        }

    }
}
