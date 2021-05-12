
public class Division {

	public static void main(String[] args) {
		
		int First, Second, Result = 0;
		Integer one = 0;
		one.longValue();
		try {
			First = Integer.parseInt(args[0]); 
			Second = Integer.parseInt(args[1]);
			Result = First/Second;
			} 
		catch(ArithmeticException A) {
			System.out.println("You cannot divide anything by zero");
			A.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException A) {
			
		}
		System.out.println(Result);
		System.out.println("end of application");
		
	}

	public static void test() throws ArithmeticException {
		throw new ArithmeticException();
	}
}
