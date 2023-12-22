package hello.core;

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

}
