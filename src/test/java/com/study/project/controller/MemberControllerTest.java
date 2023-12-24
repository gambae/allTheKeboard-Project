package com.study.project.controller;

import com.study.project.dto.MemberFormDto;
import com.study.project.entity.Member;
import com.study.project.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
class MemberControllerTest {

    @Autowired
    private MemberService memberService;

    // 테스트에 필요한 기능만 가지는 가짜 객체
    // MockMvc 객체를 이용하면 웹 브라우저에서 요청을 하는 것처럼 테스트 할 수 있음
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Member createMember(String id, String password){

        MemberFormDto memberFormDto = new MemberFormDto();
        memberFormDto.setId(id);
        memberFormDto.setEmail("kk@naver.com");
        memberFormDto.setPhone_number("010-82");
        memberFormDto.setName("홍길동");
        memberFormDto.setAddress("서울시 마포구 합정동");
        memberFormDto.setPassword(password);
        Member member = Member.createMember(memberFormDto, passwordEncoder);

        return memberService.saveMember(member);
    }

    @Test
    @DisplayName("로그인 성공 테스트")
    public void loginSuccessTest() throws Exception{
        String id = "jsd5844";
        String password = "1234";
        this.createMember(id, password);
        mockMvc.perform(formLogin().userParameter("id")
                        .loginProcessingUrl("/members/login")
                        .user(id).password(password))
                .andExpect(SecurityMockMvcResultMatchers.authenticated());
    }

    @Test
    @DisplayName("로그인 실패 테스트")
    public void loginFailTest() throws Exception{
        String id = "jsd5844";
        String password = "1234";
        this.createMember(id, password);
        mockMvc.perform(formLogin().userParameter("id")
                        .loginProcessingUrl("/members/login")
                        .user(id).password("12345"))
                .andExpect(SecurityMockMvcResultMatchers.unauthenticated());
    }

}
