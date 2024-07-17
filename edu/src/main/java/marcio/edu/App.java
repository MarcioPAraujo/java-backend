package marcio.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class App implements CommandLineRunner {
	@Autowired
	public Calculator calculus; 
	// all classes which are @Components can't be instantiated with 'new' the @Autowired annotation must follow them
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int result = calculus.sum(13, 13);
		System.out.println(result);
		
	}

}
