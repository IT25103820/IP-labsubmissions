 
public class Calculator{
	
	public static int add(int a, int b){
		return a+b;
		
	}
	
	public static int multiply(int a, int b){
		return a*b;
		
	}
	public static int square(int a){
		return a*a;
	}
	
	
	public static void main(String[] args){
		
		 Calculator calc = new Calculator();
		
		 int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);

        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int sum2 = calc.add(4, 7);
        int square1 = calc.square(sum2);

        int sum3 = calc.add(8, 3);
        int square2 = calc.square(sum3);

        int result2 = calc.add(square1, square2);
		
		System.out.print("Result of (4+7)^2+ (8+3)^2 =  " + result2);
	}
	
	
 }