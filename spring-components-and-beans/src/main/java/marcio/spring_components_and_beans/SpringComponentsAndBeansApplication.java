package marcio.spring_components_and_beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import marcio.spring_components_and_beans.service.GsonConversor;
import marcio.spring_components_and_beans.service.ViaCepResponse;

@SpringBootApplication
public class SpringComponentsAndBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComponentsAndBeansApplication.class, args);
	}
	@Bean
	public CommandLineRunner run (GsonConversor conversor) throws Exception{
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";

			ViaCepResponse response = conversor.convert(json);

			System.out.println(response.getCep()+"\n"+response.getLocalidade()+"\n"+response.getLogradouro());
		};
	}

}
