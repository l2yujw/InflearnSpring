# SpringSetting

# 사전 세팅
Java 17 이상 설치 (IntelliJ에서도 세팅 가능)

IDE: IntelliJ 또는 Eclipse 설치 <br/>

주의! 스프링 부트 3.0 이상, JDK 17 이상을 사용해야 합니다. (스프링 부트 3.2 기준 JDK 21 설정되어 있음)<br/>
스프링 부트 스타터 사이트로 이동해서 스프링 프로젝트 생성 <br/>
https://start.spring.io

# 프로젝트 선택
Project: Gradle - Groovy Project <br/>
Spring Boot: 3.x.x <br/>
Language: Java <br/>
Packaging: Jar <br/>
Java: 17 또는 21 <br/>
Project Metadata <br/>
groupId: hello <br/>
artifactId: hello-spring <br/>
Dependencies: Spring Web, Thymeleaf <br/>

# invalid source release: 21 Eroor 해결법
  Build, Execution, Deployment -> Gradle -> Gradle JVM을 환경에 맞춰서 변경

# (속도)향상 방법
  Gradle -> Build and run using / Run tests using 을 IntelliJ IDEA로 변경
  Gradle을 통해서 빌드를 할 경우 느려지는 경향이 있음

### 스프링 부트 라이브러리
    * spring-boot-starter-web
      * spring-boot-starter-tomcat: 톰캣 (웹서버)
      * spring-webmvc: 스프링 웹 MVC
    * spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
    * spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
        * spring-boot
          * spring-core
        * spring-boot-starter-logging
          * logback, slf4j

### 테스트 라이브러리
    * spring-boot-starter-test
      * junit: 테스트 프레임워크
      * mockito: 목 라이브러리
      * assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
      * spring-test: 스프링 통합 테스트 지원

### thymeleaf 템플릿 엔진
    * thymeleaf 공식 사이트: https://www.thymeleaf.org/
    * 스프링 공식 튜토리얼: https://spring.io/guides/gs/serving-web-content/
    * 스프링부트 메뉴얼: https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/
    * spring-boot-features.html#boot-features-spring-mvc-template-engines

### 콘솔로 이동
      1. ./gradlew build
      2. cd build/libs
      3. java -jar hello-spring-0.0.1-SNAPSHOT.jar
      4. 실행 확인
      
### 윈도우 사용자를 위한 팁
      콘솔로 이동 명령 프롬프트(cmd)로 이동
      ./gradlew gradlew.bat 를 실행하면 됩니다.
      명령 프롬프트에서 gradlew.bat 를 실행하려면 gradlew 하고 엔터를 치면 됩니다.
      gradlew build
      폴더 목록 확인 ls dir
      윈도우에서 Git bash 터미널 사용하기