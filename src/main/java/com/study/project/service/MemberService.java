package com.study.project.service;

import com.study.project.entity.Member;
import com.study.project.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    // 데이터베이스에 회원정보를 저장하는 insert
    public Member saveMember(Member Member) {
        validateDuplicateMember(Member);
        return memberRepository.save(Member);
    }

    // 중복 회원 검사
    private void validateDuplicateMember(Member Member) {
        Member findMember = memberRepository.findById(Member.getId());
        if(findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다");
        }
    }

    // 스프링 시큐리티에서 UserDetailService를 구현하고 있는 클래스를 통해 로그인 기능을 구현
    // UserDetailService 인터페이스의 loadUserByUsername() 메소드를 오버라이딩
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        Member member = memberRepository.findById(id);

        if(member == null) {
            throw new UsernameNotFoundException(id);
        }

        // UserDetail을 구현하고 있는 User 객체를 반환
        return User.builder()
                .username(member.getId())
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
    }

}
