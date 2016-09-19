package Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bing on 9/19/16.
 */
// 声明当前是一个配置类，并自动扫描包名下所有使用注解@Service、@Component、@Repository、@Controller 的类，并注册为Bean
@Configuration
@ComponentScan("Service")
public class DiConfig {
}
