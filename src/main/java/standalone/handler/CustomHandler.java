package standalone.handler;

import org.springframework.integration.core.MessageSource;
import org.springframework.integration.endpoint.MessageProducerSupport;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class CustomHandler implements MessageSource{

	@Override
	public Message receive() {
      System.out.println("$$$$$$  receive().. called");
		return null;
	}

}
