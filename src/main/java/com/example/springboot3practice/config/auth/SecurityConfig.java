//package com.example.springboot3practice.config.auth;
//
//import com.example.springboot3practice.domain.user.Role;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@RequiredArgsConstructor
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private final CustomOAuth2UserService customOAuth2UserService;
//
//    private static final String[] WHITE_LIST = {
//            "/", "/css/**", "/images/**",
//            "/js/**", "/h2-console/**"
//    };
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http
//                .csrf(c -> c.disable())
//                .cors(c -> c.disable())
//                .headers(c -> c.frameOptions(f -> f.disable()).disable())
//                .authorizeHttpRequests(auth -> {
//                    try{
//                        auth
//                                .requestMatchers(WHITE_LIST).permitAll()
//                                .requestMatchers(PathRequest.toH2Console()).permitAll()
//                                .requestMatchers("/api/v1/**").hasRole(Role.USER.name())
//                                .anyRequest().authenticated()
//
//                        ;
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                });
//        return http.build();
//    }
//}
