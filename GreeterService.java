package Maven_Demo.Aop_Aspkt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class GreeterService 
{
	@Autowired
	@Qualifier("morningGreeting")
	Greeting greeting;
	
	public GreeterService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public void printGreeting()
	{
		greeting.greet();
	}
}
