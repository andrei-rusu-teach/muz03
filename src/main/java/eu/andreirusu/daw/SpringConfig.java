package eu.andreirusu.daw;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("eu.andreirusu.daw")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
