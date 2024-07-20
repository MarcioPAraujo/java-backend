package marcio.spring_properties_values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class messageSystem implements CommandLineRunner {
    @Autowired
    private Sender sender;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        sender.setEmail("heyJude");
        System.out.println(sender.getName()+" "+sender.getEmail());
        
    }
    
}
