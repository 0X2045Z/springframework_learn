package src.model.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"src.model"}) //开启组件扫描
public class SpringConfig {
}
