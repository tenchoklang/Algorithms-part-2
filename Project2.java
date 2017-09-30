/*
 * Author:Tenzin Choklang
 * Class: CSCI 323 Design and Analysis of Algorithms
 * Date: 4/9/17
 * Email: tenchoklang@gmail.com
 * Project 2: Sorting Algorithms
 */
import java.io.IOException;

public class Project2 {

	public static void main(String []args) throws IOException{

		InsertionSortAlgorithm SortInsertion = new InsertionSortAlgorithm();
		CountingSortAlgorithm SortCounting = new CountingSortAlgorithm();
		RadixSortAlgorithm SortRadix = new RadixSortAlgorithm();
		BucketSortAlgorithm SortBucket = new BucketSortAlgorithm();

		String FileName = "Num";//file name without the number
		
		for(int i=0; i<4;i++){//loop for sort type
			int FileNumber = 8;
			for(int j = 0; j<6; j++){//loop for file
				
				String Fullfilename = FileName + Integer.toString(FileNumber) + ".txt";
				int[] A = new int[FileNumber];//initialize array
				A = SortInsertion.FileReader(Fullfilename, FileNumber);//shared method filereader
				
				switch(i){
					
				case 0:
					SortInsertion.FileWriter("InsertionSort", FileNumber, SortInsertion.Sort(A));//pass file name, number and sorted array 
					break;
				case 1:
					int[] test = new int[FileNumber];
					SortCounting.FileWriter("CountingSort", FileNumber, SortCounting.Sort(A, test, FileNumber));
					break;
				case 2:
					SortRadix.FileWriter("RadixSort", FileNumber, SortRadix.Sort(A, A.length, FileNumber));
					break;
				case 3:
					SortBucket.FileWriter("BucketSort", FileNumber, SortBucket.Sort(A, FileNumber));
					break;
					
				default: System.out.println("Sorry No More Algorithms :("); 
					break;
				}
				FileNumber = FileNumber * 2;//next file number
			}
		}
	}
}
