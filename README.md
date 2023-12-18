﻿# SpringSetting

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
