package hello.core.scan.filter;

import java.lang.annotation.*;

/**
 *  어노테이션 학습 필요
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
