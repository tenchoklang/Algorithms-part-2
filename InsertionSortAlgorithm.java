public class InsertionSortAlgorithm extends FileIO{//extends so we dont have to rewrite method for everyclass
	
	
	public int[] Sort(int[] A){
		
		for(int j=0; j <A.length; j++){//loops array forwards
			
			int temp = A[j];
			int i = j-1;
			
			while(i>=0 &&A[i]>temp){//loops array backwards
				count++;
				A[i+1] = A[i];//place the larger value in 
				i = i-1;//move i back
			}
			A[i+1] = temp;//once while loop finished place temp in i+1
		}		
		return A;
	}	
}