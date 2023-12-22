package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        /* 지정하지 않으면 hello.core 부터 탐색을 함
            //member 경로만 스캔 대상이 됌 (탐색할 패키지의 시작 위치를 지정)
            basePackages = "hello.core.member",
            basePackageClasses = AutoAppConfig.class,
        */
        //Component를 찾을 때 뺄 것들을 정함
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    /*
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }// 수동으로 작성한 빈이 우선권을 갖음
    //자동으로 등록된 빈은 수동빈으로 오버라이딩 된다.
    */
}
