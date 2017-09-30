
public class BucketSortAlgorithm extends FileIO{

	public int[] Sort(int[] A, int maxValue) 
    {
        
        int[] Bucket = new int[maxValue+1];//amount of buckets
        int[] Sorted = new int[A.length];
        
        for (int i = 0; i < A.length; i++){//the count
        	Bucket[A[i]]= Bucket[A[i]]+1;
        }
        
        int outPos = 0;//position in the sorted array
        for (int i = 0; i < Bucket.length; i++){//goes through each bucket
            for (int j = 0; j < Bucket[i]; j++){//checks the count for that bucket
            	count++;
                Sorted[outPos++] = i;//if it enters this loop then the value of i is set
            }
    	}
        return Sorted;
    }
}

/*BUCKET SORT USING LINKED LISTS
 * 
 * private int sortedIndex=0;
	
	public int[] Sort(int A[], double max){
		int buckets = 10;
		int divider = (int) Math.ceil((max+1)/buckets);//2
		int sorted [] = new int[A.length];
		InsertionSortAlgorithm SortInsertion = new InsertionSortAlgorithm();
		
		LinkedList<LinkedList<Integer>> bigBucket = new LinkedList<>();
		
		for(int i =0;i<10;i++){//initialize everything to 0
			LinkedList<Integer> smallBucket = new LinkedList<>();
			bigBucket.add(i, smallBucket);
		}
		
		for(int i=0; i<A.length;i++){//adds value to their assigned bucket
			int bucketIndex = (int) Math.floor(A[i]/divider);
			//System.out.println("BUCKET INDEX:" + bucketIndex);
			bigBucket.get(bucketIndex).add(A[i]);
		}
		
		for(int i=0; i<10;i++){//go through each bucket
			int miniSorted[] = new int[bigBucket.get(i).size()];
			for(int j=0;j<bigBucket.get(i).size();j++){//gets values inside LL into array
				miniSorted[j] = bigBucket.get(i).get(j);
			}
			SortInsertion.Sort(miniSorted);//use insertion sort on bucket
			copy(sorted,miniSorted);
		}
		
		count = SortInsertion.count;//get the count from insertion Sort
		sortedIndex =0;//reset
		return sorted;

	}
	
	private void copy(int sorted[], int miniSorted[]){
		for(int i=0;i<miniSorted.length;i++){
			sorted[sortedIndex++]=miniSorted[i];
		}
	}	
	
*/
