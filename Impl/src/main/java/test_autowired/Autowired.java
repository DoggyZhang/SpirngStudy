package test_autowired;

import java.lang.annotation.*;

/**
 * 自实现 @Autowired
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@Documented
public @interface Autowired {

}
