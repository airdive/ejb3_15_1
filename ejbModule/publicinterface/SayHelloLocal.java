package publicinterface;

import javax.ejb.Local;

@Local
public interface SayHelloLocal {
	public void sayHelloMethod();
}
