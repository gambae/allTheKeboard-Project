package com.study.project.service;

import com.study.project.dto.MemberFormDto;
import com.study.project.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    PasswordEncoder passwordEncoder;

    public Member createMember() {
        MemberFormDto memberFormDto  = new MemberFormDto();
        memberFormDto .setId("jsd5844");
        memberFormDto .setPassword("1234");
        memberFormDto .setName("김동현");
        memberFormDto .setAddress("광주");
        memberFormDto .setEmail("kkk12@naver.com");
        memberFormDto .setPhone_number("8260-5844");

        return Member.createMember(memberFormDto ,passwordEncoder);
    }

    @Test
    @DisplayName("회원가입 테스트")
    public void saveMemberTest() {
        Member member = createMember();
        Member savedMember = memberService.saveMember(member);

        // 저장하려고 요청했던 값과 실제 저장된 데이터를 비교
        // 첫 번째 파라미터에는 기대 값, 두 번째 파라미터에는 실제로 저장된 값
        assertEquals(member.getId(),savedMember.getId());
        assertEquals(member.getPassword(),savedMember.getPassword());
        assertEquals(member.getName(),savedMember.getName());
        assertEquals(member.getAddress(),savedMember.getAddress());
        assertEquals(member.getEmail(),savedMember.getEmail());
        assertEquals(member.getPhone_number(),savedMember.getPhone_number());
    }

    @Test
    @DisplayName("중복 회원가입 테스트")
    public void saveDuplicateMemberTest() {
        Member member1 = createMember();
        Member member2 = createMember();
        memberService.saveMember(member1);

        // 예외처리 테스트, 첫 번째 파라미터에는 발생할 예외 타입
        Throwable e = assertThrows(IllegalStateException.class,()-> {
            memberService.saveMember(member2);
        });

        // 발생한 예외 메세지가 예상 결과와 맞는지 검증
        assertEquals("이미 가입된 회원입니다",e.getMessage());
    }
}
