package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	컨트롤러를 통해서 외부 요청을 받고
	서비스에서 비즈니스 로직을 만들고
	레포지토리에서 데이터 저장을 하고
	정형화된 형식임
 */
@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
