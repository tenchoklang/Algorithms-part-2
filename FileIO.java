import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	protected int count = 0;//count used by insertion, merge, heap and quick
	

	public void FileWriter(String SortType, int FileNumber, int[] Array){
		
		String FullFileName = SortType + "Output" + FileNumber + ".txt";//name of file
		try{
			PrintWriter outputStream = new PrintWriter(FullFileName);

			outputStream.println("Count " + count);
			
			for(int i =0; i<Array.length; i++){//write to text file
				outputStream.println(Array[i]);
			}
			System.out.println(FullFileName + " count: "+ count);
			count = 0;//reset the count
			outputStream.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public int[] FileReader(String FileName, int FileNumber){//reads from the file
		
		
	
		Scanner x = null;
		int A[] = new int[FileNumber];
		
		try{x = new Scanner(new File(FileName));}
		catch(Exception e){System.out.println("file not found");}
		int i = 0;
		while(x.hasNext()){
			int a = x.nextInt();
			A[i] = a;//stores what was read from file into array
			i++;	
		}
		return A;	
	}
}
