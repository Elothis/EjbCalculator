package mybeans;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculatorBean
 */
@Stateless
public class CalculatorBean implements CalculatorBeanLocal {

    /**
     * Default constructor. 
     */
    public CalculatorBean() {
        System.out.println("Constructor of Bean called");
    }

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return a / b;
	}

}
