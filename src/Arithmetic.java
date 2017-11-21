

public class Arithmetic {
	
	private int numberOne;
	private int numberTwo;
	
	public Arithmetic(int numberOne, int numberTwo) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public long calculate(String sinal) {
		Operation operation;
		
		switch (sinal) {
		case "+":
			operation = new Sum();
			break;

		default:
			System.out.println("Must inform a operator!");
			operation = new NotInformedOperation();
			break;
		}
		
		return operation.calculate(numberOne, numberTwo);
	}

	public static void main(String[] args) {
		
		long result = new Arithmetic(Integer.parseInt(args[0]), Integer.parseInt(args[2])).calculate(args[1]);
		System.out.println(result);
	}
}
