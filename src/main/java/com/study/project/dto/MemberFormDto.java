package com.study.project.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class MemberFormDto {

    // 유효성을 검증할 클래스의 필드에 어노테이션 선언

    @NotEmpty(message = "아이디는 필수 입력 값입니다.")
    private String id;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min = 1,max = 16,message = "비밀번호는 1자이상,16자 이하로 입력해주세요")
    private String password;

    @NotEmpty(message = "이름은 필수 입력 값입니다.")
    private String name;

    @NotEmpty(message = "주소는 필수 입력 값입니다.")
    private String address;

    @NotEmpty(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요")
    private String email;

    @NotEmpty(message = "핸드폰번호는 필수 입력 값입니다.")
    private String phone_number;
}
