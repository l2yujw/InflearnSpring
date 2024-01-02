package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); // 롬복이 생성해줌

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace my log=" + name); //연산이 이루어지기 때문에 메모리를 잡아먹음

        log.trace(" trace log={}", name);
        log.debug(" trace log={}", name);
        log.info(" info log={}", name);
        log.warn(" info log={}", name);
        log.error(" info log={}", name);

        //개발은 debug까지
        //배포는 infolevel
        return "ok";
    }
}
