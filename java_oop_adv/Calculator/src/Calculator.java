import java.io.Serializable;

public class Calculator implements Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() {
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void performOperation() {
		if (this.getOperation() == "+") {
			double temp = this.getOperandOne() + this.getOperandTwo();
			this.setResult(temp);
			System.out.println("Operation was Successful!");
		} else if (this.getOperation() == "-") {
			double temp = this.getOperandOne() - this.getOperandTwo();
			this.setResult(temp);
			System.out.println("Operation was Successful!");
		} else {
			System.out.println("Please set appropriate Operation");
		}
	}

}
