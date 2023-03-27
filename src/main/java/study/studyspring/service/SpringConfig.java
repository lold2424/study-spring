package study.studyspring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.studyspring.repository.MemberRepository;
import study.studyspring.repository.MemoryMemberRepository;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}