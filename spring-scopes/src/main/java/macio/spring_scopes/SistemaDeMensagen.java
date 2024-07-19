package macio.spring_scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaDeMensagen {
    @Autowired
    private Remetente standardSender;
    @Autowired
    private Remetente ramdomSender;

    public void registerConfirmation(){
        System.out.println("\n\nregister concluded");
        System.out.println(standardSender);
    }
    public void welcomeMessage(){
        ramdomSender.setEmail("another@email.com");
        System.out.println(ramdomSender);
        System.out.println("welcome young man");
    }
}
