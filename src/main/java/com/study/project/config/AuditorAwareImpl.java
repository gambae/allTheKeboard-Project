package com.study.project.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

// 엔티티의 생성과 수정을 감시하는 인터페이스
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userId = "";
        if(authentication != null) {
            // 현재 로그인 한 사용자의 정보를 조회하여 사용자의 이름을 등록자와 수정자로 지정
            userId = authentication.getName();
        }
        return Optional.of(userId);
    }
}
