package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Aykut on 30.01.2016.
 */
@EnableWebMvc
@Configuration
@ComponentScan({"/controller"})
public class AppConfig {
}
