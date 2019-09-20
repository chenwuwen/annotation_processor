package cn.kanyun.annotation_processor.taketime;

import java.lang.annotation.*;

/**
 *
 * Print 注解作用在方法/类上
 * 生命周期为：源码期 需要强调的是,在这里,这个周期可以是任意周期
 * 因为本身,这个注解是有注解处理器的,所以编译的时候就会生效,如果这个时候
 * 你想让该注解编译后,去掉注解,那么就设置对应周期就可以了,总之注解处理器是肯定会
 * 处理该注解的,如果你对这个处理还有其他处理,那么就需要考虑对应生命周期,比如还想再运行期
 * 对标注的该注解的元素进行操作,那么对应的生存周期就需要设置为RUNTIME
 * @author Kanyun
 * @see cn.kanyun.annotation_processor.taketime.TakeTimeProcessor
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface TakeTime {

    /**
     * 标记前缀,无实质作用,只是为了方便查找
     * @return
     */
    String tag() default "";
}
