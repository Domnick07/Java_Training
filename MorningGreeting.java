package Maven_Demo.Aop_Aspkt;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting 
{
	String greeting = "Good Morning";
	
	public String greet()
	{
		// TODO Auto-generated method stub
		return greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public MorningGreeting() {
		super();
		System.out.println(greeting);
		// TODO Auto-generated constructor stub
	}
	

}
