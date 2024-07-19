package macio.spring_scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente buildRemetente(){
        System.out.println("generating sender ...");
        Remetente remetente = new Remetente();

        remetente.setEmail("satandard@email.com");
        remetente.setNome("standard name");

        return remetente;
    }
}
