
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator x = new Calculator();
		
		x.setOperandOne(10.5);
		x.setOperation("+");
		x.setOperandTwo(5.2);
		x.performOperation();
		System.out.println(x.getResult());
	}

}
