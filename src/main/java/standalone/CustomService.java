package standalone;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

	@ServiceActivator
	public String checkService(String payload) {
		String response=payload.substring(0,50);
		System.out.println("##########################" + payload.substring(0,50));
		return response;
		
	}
	
}
