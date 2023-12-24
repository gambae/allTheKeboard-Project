package com.study.project.entity;

import com.study.project.constant.Role;
import com.study.project.dto.MemberFormDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@Getter
@Setter
@ToString
@Table(name = "member")
public class Member extends BaseEntity{
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long member_id;

    @Column(unique = true)
    private String id;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private String phone_number;

    // 자바의 enum타입을 엔티티의 속성으로 지정 , 순서 문제가 생기지 않기위해 문자열로 저장
    @Enumerated(EnumType.STRING)
    private Role role;

    // member 엔티티를 생성하는 메소드
    public static Member createMember(MemberFormDto memberFormDto, PasswordEncoder passwordEncoder) {
        Member member = new Member();
        member.setId(memberFormDto.getId());
        String password = passwordEncoder.encode(memberFormDto.getPassword()); // 비밀번호 암호화
        member.setPassword(password);
        member.setName(memberFormDto.getName());
        member.setAddress(memberFormDto.getAddress());
        member.setEmail(memberFormDto.getEmail());
        member.setPhone_number(memberFormDto.getPhone_number());
        member.setRole(Role.ADMIN);
        return member;
    }

}
