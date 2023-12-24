package com.study.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final UserDetailsService userService;

    public SecurityConfig(UserDetailsService userService) {
        this.userService = userService;
    }

    // http 요청에 대한 보안설정
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/members/**").permitAll()
                        .requestMatchers("/error/**").permitAll()
                        .requestMatchers("/item/**").permitAll()
                        .requestMatchers("/img/**").permitAll()

                        .requestMatchers("/css/**").permitAll()
                        .requestMatchers("/fonts/**").permitAll()
                        .requestMatchers("/images/**").permitAll()
                        .requestMatchers("/js/**").permitAll()
                        .requestMatchers("/vendor/**").permitAll()

                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().authenticated())

                .formLogin((formLogin) -> formLogin
                        .loginPage("/members/login")
                        .failureUrl("/members/login/error")
                        .usernameParameter("id")
                        .defaultSuccessUrl("/"));
        http
                .logout((logout) -> logout.logoutRequestMatcher(new AntPathRequestMatcher("/members/logout"))
                        .logoutSuccessUrl("/")
                        .invalidateHttpSession(true));

        http.exceptionHandling((exception)-> exception.authenticationEntryPoint(new CustomAuthenticationEntryPoint()));

        return http.build();
    }

    // 비밀번호 암호화
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    AuthenticationManager authenticationManager() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userService);
        provider.setPasswordEncoder(passwordEncoder());
        return new ProviderManager(provider);
    }



}
