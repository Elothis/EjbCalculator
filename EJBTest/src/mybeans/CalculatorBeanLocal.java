package mybeans;

import javax.ejb.Local;

@Local
public interface CalculatorBeanLocal {
	
	public int add(int a, int b);
	public int subtract(int a, int b);
	public int multiply(int a, int b);
	public int divide(int a, int b);

}
