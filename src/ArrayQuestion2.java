import java.util.Arrays;
public class ArrayQuestion2 {

	
	//
	void assignment2(int inputArray[]){
		
		Arrays.sort(inputArray);
		
		for(int i = 0; i < inputArray.length; i++){
			
			for(int j = i + 1; j < inputArray.length; j++){
				
				if (inputArray[j] == inputArray[i]){
					
					System.out.print(inputArray[i] + " has a duplicate\n");
					
				}	
			}
			
			
		}
		
		System.out.print("Done\n");
	}
	
	
	public static void main(String[] args) {
		//We don't have particularly useful information of the values in the arrays
		//The values could be anything, so I think we'd need two for loops...
		//Here's an array of 10 elements I guess
		
		int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		ArrayQuestion2 test = new ArrayQuestion2();
		test.assignment2(array);
		
	}
	
	

}
