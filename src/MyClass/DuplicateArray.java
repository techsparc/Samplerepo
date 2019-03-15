package MyClass;

public class DuplicateArray {

	public static void main(String[] args) {

		/*
		 * for (int i =0; i < 5; i++) {
		 * 
		 * System.out.println(i); //5 //0
		 * 
		 * for(int j=0; j < 5; j++) { //5 System.out.println(i+" -- "+j); //0 -- 0 //0
		 * -- 1 //0 -- 2 //0 -- 3 //0 -- 4
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		/*int a[] = {2, 8, 6, 5, 8, 6, 3};
				//0					 6
				//	  1				 6
		
		for (int i = 0; i <= 6; i++) {		
			
			//System.out.println(i);    //7
			for (int j = i+1; j <6; j++) {	//7
				
				//System.out.println(i +" -- "+j); //5
				if((a[i] == a[j])&&(i !=j)) {	//i =0, j=1, i =1 j =2
					
					System.out.println(a[j]);
					
				}
			
			}

		}

	}*/
		int number[] = {104, 31, 69, 13, 12, 22, 9};
		
		for (int i = 0; i < number.length-1; i++) {
			boolean isPrime = true;
                // check to see if the numbers are prime
                for (int j = 2; j <= number[i] /2; j++) {
                    if (number[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
    				System.out.println(number[i]+" is a prime number");
    			}    
		}
		}
	}
			
		
	

