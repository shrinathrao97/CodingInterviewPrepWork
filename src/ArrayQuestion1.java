import java.util.Arrays;
public class ArrayQuestion1 {
	
	void findMissingNoOneToOneHundred(int inputArray[]){
		
		//Basically find sum of first 100 whole numbers
		int potentialSum = 0;
		for(int i = 0; i < 100; i++){
			
			potentialSum = potentialSum + i + 1;
			
		}
		
		
		//Subract array values from potential
		for (int i = 0; i < inputArray.length; i++){
			
			potentialSum = potentialSum - inputArray[i];
			
		}
		
		
		//If its 0, we're not missing anything, if anything else print that value- we're missing it
		
		if(potentialSum == 0){
			
			System.out.print("We aren't missing anything!");
			
		}
		
		else{
			
			System.out.println("MissingNumber: " + potentialSum);
			
		}
		
		
		
		System.out.print("Done\n");
		
		
	}


	public static void main(String[] args) {

		//We're going to make an array that's missing 100 in a 1-100 array
		int[] array = new int[99];
		for (int i = 0; i < 99; i++){
			
			array[i] = i + 1; // 1-100
			
		}
		

		

		ArrayQuestion1 assignment1 = new ArrayQuestion1();
		assignment1.findMissingNoOneToOneHundred(array);
		
		
		

	}
}
