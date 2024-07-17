package marcio.spring_components_and_beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;


@Configuration
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
