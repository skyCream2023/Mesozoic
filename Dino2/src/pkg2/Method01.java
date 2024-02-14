package pkg2;

public class Method01 {
	public static int performCalc(int x, int y, String operation) {
		int result = switch(operation) {
		case "+" -> x + y;
		case "-" -> x - y;
		case "*" -> x * y;
		case "/" -> x / y;
		case "%" -> x % y;
		default -> {
			System.out.println("Unknown operation" + operation);
			yield -1;
		}
		};
		return result;
	}

	public static void main(String[] args) {
		int result = performCalc(10, 2, "+");
		System.out.println(result);
		System.out.println(performCalc(10,2, "-"));
		System.out.println(performCalc(10,2, "*"));
		System.out.println(performCalc(10,2, "/"));
		System.out.println(performCalc(10, 2, "%"));
		System.out.println(performCalc(10, 2, "&"));
	}
	
//	public static void some Method() {}
	public static void sumeMethod(int x) {}
	public static void SomeMethod(double x) {}
	public static void someMethod(String x) {}

}

