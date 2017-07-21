package activitystarter;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Retention(CLASS) @Target(FIELD)
public @interface Arg {
    String key() default "";
    boolean parceler() default false;
}