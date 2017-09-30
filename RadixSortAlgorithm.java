
public class RadixSortAlgorithm extends FileIO{

	public int[] Sort(int arr[], int arrayLength, int maxNumber){
		
		int maxNumberLength = Integer.valueOf(maxNumber).toString().length();//gets the number of digits in the maxNumber ones, tenths..etc

		int placeValue =1;//initial place value
		for(int i =0;i<maxNumberLength;i++){//loops each time for each digit of max
			modifiedCountSort(arr,arrayLength, placeValue);
			placeValue=placeValue*10;//next place Value
		}
		return arr;
	}
	
	private void modifiedCountSort(int arr[], int arrayLength, int placeValue){
		int sorted[] = new int[arrayLength];
		int digitCount[] = new int[10];//digits 0-9
		
		for(int i =0; i<10;i++){//fills everthing with zero's
			digitCount[i] = 0;
		}
		
		for(int i=0; i<arrayLength;i++){//stores the count of the specified placeValue/ place value count
			digitCount[(arr[i]/placeValue)%10]=digitCount[(arr[i]/placeValue)%10]+1;
		}

		for(int i=1;i<10;i++){
			digitCount[i] = digitCount[i]+digitCount[i-1];//sum the counts of previous counts
		}

		for(int i = arrayLength-1;i>=0;i--){//gets everything in sorted place based on the place value
			count++;
			sorted[digitCount[(arr[i]/placeValue)%10]-1] = arr[i];
			digitCount[(arr[i]/placeValue)%10]--;//decrease the count, SAME AS digitCount[(int)Math.ceil((arr[i]/placeValue)%10)]--;
		}

		for(int i =0;i<arrayLength;i++){//stores values back so it can sort the next place value
			arr[i]=sorted[i];
		}
		
	}
}


//RADIX SORT WITH VISUAL OUTPUT

/*
private void modifiedCountSort(int arr[], int arrayLength, int placeValue){
		int sorted[] = new int[arrayLength];
		int digitCount[] = new int[10];//digits 0-9
		
		for(int i =0; i<10;i++){//fills everthing with zero's
			digitCount[i] = 0;
			
		}
		
		for(int i=0; i<arrayLength;i++){//stores the count of the specified placeValue/ place value count
//			C[array[j]-1] = C[array[j]-1]+1;
			digitCount[(arr[i]/placeValue)%10]=digitCount[(arr[i]/placeValue)%10]+1;
		}
		
		System.out.println("|||||||||||||||||||||||||||||||||||");//not part of the algorithm, just to see visually
		System.out.println("PLACE VALUE COUNT");
		for(int i =0;i<10;i++){//just to check count DELETE LATER!
			System.out.println("count["+i+"]: = "+digitCount[i] );
		}
		System.out.println("|||||||||||||||||||||||||||||||||||");
		
		for(int i=1;i<10;i++){//a+=b --- a=a+b
			digitCount[i] = digitCount[i]+digitCount[i-1];//sum the counts of previous counts
		}
		
		System.out.println("|||||||||||||||||||||||||||||||");//not part of the algorithm, just to see visually
		System.out.println("SUM COUNT");
		for(int i =0;i<10;i++){//just to check count DELETE LATER!
			System.out.println("count["+i+"]: = "+digitCount[i] );
		}
		System.out.println("|||||||||||||||||||||||||||||||||||");
		
		for(int i = arrayLength-1;i>=0;i--){//gets everything in sorted place based on the place value
			count++;
			sorted[digitCount[(arr[i]/placeValue)%10]-1] = arr[i];
			digitCount[(arr[i]/placeValue)%10]--;//decrease the count, SAME AS digitCount[(int)Math.ceil((arr[i]/placeValue)%10)]--;
		}
		
		System.out.println("|||||||||||||||||||||||||||||||||||");//not part of the algorithm, just to see visually
		System.out.println("SORTED FOR THAT PLACE VALUE");
		for(int i =0;i<sorted.length;i++){
			System.out.println("sorted["+i+"]: = "+sorted[i] );
		}
		System.out.println("|||||||||||||||||||||||||||||||||||");
		
		for(int i =0;i<arrayLength;i++){//stores values back so it can sort the next place value
			arr[i]=sorted[i];
		}
		
	}
*/