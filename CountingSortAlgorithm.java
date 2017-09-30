
public class CountingSortAlgorithm extends FileIO{

	
	public int[] Sort(int array[], int sortedArray[], int max){
		
		
		int C[] = new int[max];
		
		for(int i =0;i<max;i++){//sets everything in C to 0
			
			C[i]=0;
		}
		
		for(int j=0;j<array.length;j++){//stores the count
			C[array[j]-1] = C[array[j]-1]+1;
		}
		
		
		for(int i=1;i<max;i++){//sum of the count
//			if(i!=0){
				C[i]=C[i]+C[i-1];
//			}
			
//			if(i==0){
//				C[i]=C[i];//do nothing
//			}
//			else{
//			C[i]=C[i]+C[i-1];
//			}
		}

		for(int j = array.length-1;j>=0;j--){//sorts its based on index
			count++;
			sortedArray[C[array[j]-1]-1] = array[j];
			C[array[j]-1] = C[array[j]-1] - 1;
		}
		
		return sortedArray;
	}
}
