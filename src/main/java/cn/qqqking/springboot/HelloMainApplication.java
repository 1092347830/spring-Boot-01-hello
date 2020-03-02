package cn.qqqking.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author AnQi   用于标识一个引导类 说明 当前是SpringBoot项目
 *@SpringBootApplication 用于标识  一个引导类，说明 当前是一个 springboot项目
 *   @SpringBootConfiguration
 *       @Configuration  它属于spring中的一个注解，定义配置类，等价于配置文件
 *          @Component   添加到spring容器中，表示是一个组件
 *   @EnableAutoConfiguration 将引导类所在包及其所在子包下面的所有组件添加到 spring容器中
 *      @AutoConfigurationPackage
 *          @Import(AutoConfigurationImportSelector.class)
 *          1、将所有组件以全类名的方式返回，并且添加到spring容器中
 *          2、会给容器中导入非常多的自动 配置类（***autoconfiguration），导入 并配置好很多当前项目中所有需要的
 *          3、省去我们手动编写配置然后注入到组件中
 *   @ComponentScan  被该注解标记的类 ，会 被spring容器进行管理
 *
 *
 * @date 2020/2/29 20 53:29
 * @description
 */
@SpringBootApplication
public class HelloMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloMainApplication.class,args);
    }
}
