import Config.DiConfig;
import Service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bing on 9/19/16.
 */
public class Main {
    public static void main(String[] args) {
        // 获取Spring容器，接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        // 获取 UseFunctionService 的 Bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("World"));

        context.close();
    }
}
