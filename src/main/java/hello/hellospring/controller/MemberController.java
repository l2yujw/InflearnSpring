package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //memberService를 스프링이 스프링컨테이너에 있는 memberService와 연결을 시켜줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
