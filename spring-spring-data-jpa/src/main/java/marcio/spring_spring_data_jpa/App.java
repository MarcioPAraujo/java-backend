package marcio.spring_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import marcio.spring_spring_data_jpa.model.User;
import marcio.spring_spring_data_jpa.repository.UserRepository;
@Component
public class App implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        User user = new User();
        user.setEmail("useremail@email.com");
        user.setPassword("abcd123");
        user.setUsername("nouser");

        userRepository.save(user);

        for(User u : userRepository.findAll()){
            System.out.println(u.toString());
        }
    }
    
}
