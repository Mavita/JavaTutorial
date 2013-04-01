import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cDataSet {
	
	double[][] DataSet;
	int rows,cols;
	String[] ColumnNames;
	File fDataFile;
	
	// Two constructors
	public cDataSet(){
		System.out.println("Please send a filename.");
	}
	public cDataSet(String fileName) throws FileNotFoundException{
	
	fDataFile = new File (fileName);
		if (fDataFile.exists()){
		Scanner inFile = new Scanner(fDataFile);
		String line;
		String[] tokens;
		int c, r=0;
		//Storing the columns
		line = inFile.nextLine();
		tokens = line.split(",");
		cols = tokens.length;
		
		ColumnNames = new String[tokens.length];
		for (c=0; c<cols; c++){
			ColumnNames[c] = tokens[c];
		}
		//Storing the data
		DataSet = new double[500][cols];
		while (inFile.hasNext()){
			line = inFile.nextLine();
			tokens = line.split(",");
			for (c=0; c<tokens.length; c++){
				DataSet[r][c] = Double.parseDouble(tokens[c]);
			}
			r++;
			rows = r;
			
		}
		
	}
			
	}
	
	// Display options
	public void display(){
		int r,c;
		
		System.out.println();
		for(c=0; c<cols; c++){
			System.out.print(ColumnNames[c] + " ");
		}
		System.out.println();
		for (r=0; r<rows; r++){
			for(c=0; c<cols; c++){
				System.out.print(DataSet[r][c] + " ");
			}
			System.out.println();
		}
	}
	public void display(int week){
		int r,c;
		r = week-1;
		
		System.out.println();
		if(r>0 && r<rows){
			for(c=0; c<cols; c++){
				System.out.print(ColumnNames[c] + " ");
			}
			System.out.println();
				for(c=0; c<cols; c++){
					System.out.print(DataSet[r][c] + " ");
				}
				System.out.println();
		} else {
			System.out.println("Error in the specified row");
		}
		
	}
	public void display(int ini_week, int last_week){
		int r,c;
		if ((ini_week-1)<(last_week-1) && ini_week>=1 && (last_week)<rows){
			for(c=0; c<cols; c++){
				System.out.print(ColumnNames[c] + " ");
			}
			System.out.println();
			for (r=(ini_week-1); r<last_week; r++){
				for(c=0; c<cols; c++){
					System.out.print(DataSet[r][c] + " ");
				}
				System.out.println();
			}
		}
		else if (ini_week==last_week && ini_week>=1 && last_week<rows){
			display(ini_week);
		} else {
			System.out.println("Error in defining range values");
		}
	}	
	public void display(String name_col){
		String str2 = name_col;
		int temp=0;
		int c,i;
		for(c=0; c<cols; c++){
			String str1 = ColumnNames[c];
			int result = str1.compareTo(str2);
				if(result==0){
					System.out.println(ColumnNames[c]);
					for (i=0; i<rows; i++){
						System.out.println(DataSet[i][c]);
					}
					temp=1;
				}
		}
		if (temp==0){
			System.out.println("Error in column name specification");
		}	
	}

} // End class cDataSet