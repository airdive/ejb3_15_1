package publicinterface;

import javax.ejb.Stateless;

@Stateless
public class SayHello implements SayHelloLocal {
	@Override
	public void sayHelloMethod() {
		// TODO Auto-generated method stub
		System.out.println("EJB3");
	}
}
