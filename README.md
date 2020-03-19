# annotation_processor
**Java插入式注解处理器**

这个项目主要是Java插入式注解处理器的一个练手项目,
通过引入依赖,并使用其中的一个@TakeTime注解,在方法上添加@TakeTime注解,可以打印出该方法执行时长

添加依赖：

maven
```xml
<!-- https://mvnrepository.com/artifact/io.github.chenwuwen/annotation_processor -->
<dependency>
    <groupId>io.github.chenwuwen</groupId>
    <artifactId>annotation_processor</artifactId>
    <version>1.0.0</version>
</dependency>

```

gradle

```groovy

// https://mvnrepository.com/artifact/io.github.chenwuwen/annotation_processor
compile group: 'io.github.chenwuwen', name: 'annotation_processor', version: '1.0.0'

```

[JAVA 插入注解处理器](https://www.cnblogs.com/kanyun/p/11541826.html)


> 注： 仅在JDK8下测试通过,未使用其他版本JDK测试