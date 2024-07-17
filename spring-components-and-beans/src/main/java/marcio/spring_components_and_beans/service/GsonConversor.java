package marcio.spring_components_and_beans.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;



@Component
public class GsonConversor {
	@Autowired
	private Gson gson;

	public ViaCepResponse convert(String json){
		ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
		return response;
	}
}

