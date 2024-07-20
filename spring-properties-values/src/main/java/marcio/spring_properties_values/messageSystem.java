package marcio.spring_properties_values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class messageSystem implements CommandLineRunner {
    @Value("${name}")
    private String name;
    @Value("${email}")
    private String email;


    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        System.out.println(name+" "+email);
        
    }
    
}
