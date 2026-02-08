public class IT25103820Q4{
	public static void main(String[] args){
		
		int i=1;
		int j=1;
		
		while(i<=5){
			
			while(j<=5){
				
				System.out.print("*");
				j++;
			}
			
			System.out.println("");
			i++;
		}
		
		
		for(int i= 1; i <=5; i++){
			
			for(int j=1; j<=5-i; j++ ){
				
				System.out.print(" ");
			}
			for (int j =1; j<=i; j++){
				System.out.print("*");
				
			}
			
			System.out.println(" ");
			
		}
		
		
		
}
}