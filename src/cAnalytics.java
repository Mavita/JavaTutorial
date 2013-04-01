import java.io.FileNotFoundException;

public class cAnalytics extends cDataSet {

	public cAnalytics(String fileName) throws FileNotFoundException  {
		super(fileName);
	}
	
	// Round method
	public double Round(double number, int decimalPlaces)
    {
	double modifier = Math.pow(10.0, decimalPlaces);
	return Math.round(number * modifier) / modifier;
    }

	// Min methods	
	public double Min(){
		int r,c;
		double temp;
		temp = DataSet[0][4];
		
		for (r=0; r<rows; r++){
			for(c=4; c<cols; c++){
				if (temp>DataSet[r][c]){
					temp=DataSet[r][c];
				}
			}
		}
		return temp;	
	}
	public double Min(int week){
		int c;
		double temp=0;
		
		if(week>0 && week<=500){
			
			temp = DataSet[week-1][4];
			
				for(c=4; c<cols; c++){
					if (temp>DataSet[week-1][c]){
						temp=DataSet[week-1][c];
					}
				}	
		}
		else{
			temp=-1;
		}
		return temp;	
	}
	public double Min(int first_week, int last_week){
		int r,c;
		double temp=0;
		
		if(first_week<last_week && first_week>0 && last_week<=500){
			temp = DataSet[first_week-1][4];
			for (r=first_week-1; r<last_week; r++){
				for(c=4; c<cols; c++){
					if (temp>DataSet[r][c]){
						temp=DataSet[r][c];
					}
				}
			}	
		
		}
		else if(first_week==last_week && first_week>0 && last_week<=500){
			temp = DataSet[first_week-1][4];
			
			for(c=4; c<cols; c++){
				if (temp>DataSet[first_week-1][c]){
					temp=DataSet[first_week-1][c];
				}
			}
			
		}
		else {
			temp=-1;
		}
	
		return temp;
	}
	public double Min(String region){
		int r,c;
		double temp=0;
		double temp1=1;
		String str2 = region;
		
		for(c=4; c<cols; c++){
			String str1 = ColumnNames[c];
			int result = str1.compareTo(str2);
				if(result==0){
					temp = DataSet[0][c];
					for (r=0; r<rows; r++){
						if (temp>DataSet[r][c]){
							temp=DataSet[r][c];
						}
					}
				temp1=0;
				}
		}
		if (temp1==1){
			temp=-1;
		}
		return temp;	
	}

	// Max methods
	public double Max(){
		int r,c;
		double temp;
		temp = DataSet[0][4];
		
		for (r=0; r<rows; r++){
			for(c=4; c<cols; c++){
				if (temp<DataSet[r][c]){
					temp=DataSet[r][c];
				}
			}
		}
		return temp;	
	}
	public double Max(int week){
		int c;
		double temp=0;
		
		if(week>0 && week<=500){
			
			temp = DataSet[week-1][4];
			
				for(c=4; c<cols; c++){
					if (temp<DataSet[week-1][c]){
						temp=DataSet[week-1][c];
					}
				}	
		}
		else{
			temp=-1;
		}
		return temp;	
	}
	public double Max(int first_week, int last_week){
		int r,c;
		double temp=0;
		
		if(first_week<last_week && first_week>0 && last_week<=500){
			temp = DataSet[first_week-1][4];
			for (r=first_week-1; r<last_week; r++){
				for(c=4; c<cols; c++){
					if (temp<DataSet[r][c]){
						temp=DataSet[r][c];
					}
				}
			}	
		
		}
		else if(first_week==last_week && first_week>0 && last_week<=500){
			temp = DataSet[first_week-1][4];
			
			for(c=4; c<cols; c++){
				if (temp<DataSet[first_week-1][c]){
					temp=DataSet[first_week-1][c];
				}
			}
			
		}
		else {
			temp=-1;
		}
	
		return temp;
	}
	public double Max(String region){
		int r,c;
		double temp=0;
		double temp1=1;
		String str2 = region;
		
		for(c=4; c<cols; c++){
			String str1 = ColumnNames[c];
			int result = str1.compareTo(str2);
				if(result==0){
					temp = DataSet[0][c];
					for (r=0; r<rows; r++){
						if (temp<DataSet[r][c]){
							temp=DataSet[r][c];
						}
					}
				temp1=0;
				}
		}
		if (temp1==1){
			temp=-1;
		}
		return temp;	
	}

	// Mean methods	
	public double Mean(){
		int r,c;
		double temp=0;
		
		for (r=0; r<rows; r++){
			for(c=4; c<cols; c++){
				temp=temp+DataSet[r][c];
			}
		}
		temp = temp/(rows*(cols-4));
		double temp2 = Round(temp, 2);
		temp = temp2;
		return temp;	
	}
	public double Mean(int week){
		int c;
		double temp=0;
		
		if(week>0 && week<=500){						
				for(c=4; c<cols; c++){
					temp = temp + DataSet[week-1][c];
				}	
		temp = temp/(cols-4);
		}
		else{
			temp=-1;
		}
		double temp2 = Round(temp, 2);
		temp = temp2;
		return temp;	
	}
	public double Mean(int first_week, int last_week){
		int r,c;
		double temp=0;
		
		if(first_week<last_week && first_week>0 && last_week<=500){
			for (r=first_week-1; r<last_week; r++){
				for(c=4; c<cols; c++){
					temp = temp + DataSet[r][c];
				}
			}
		temp = temp/((last_week-first_week+1)*(cols-4));	
		
		}
		else if(first_week==last_week && first_week>0 && last_week<=500){		
			double temp3 = Mean(first_week);
			temp = temp3;
		}
		else {
			temp=-1;
		}
		double temp2 = Round(temp, 2);
		temp = temp2;
		return temp;
	}
	public double Mean(String region){
		int r,c;
		double temp=0;
		double temp1=1;
		String str2 = region;
		
		for(c=4; c<cols; c++){
			String str1 = ColumnNames[c];
			int result = str1.compareTo(str2);
				if(result==0){
					for (r=0; r<rows; r++){
						temp =temp+ DataSet[r][c];
					}
				temp = temp/rows;
				temp1=0;
				}
		}
		if (temp1==1){
			temp=-1;
		}
		if(temp1==0){
		double temp2 = Round(temp, 2);
		temp = temp2;
		}
		return temp;	
	}

	// Std Dev methods	
	public double StdDev(){
		int r,c;
		double temp=0;
		double temp1=0;
		double mean = Mean();
		
		
		for (r=0; r<rows; r++){
			for(c=4; c<cols; c++){
				temp1 = DataSet[r][c]-mean; 
				temp= Math.pow(temp1, 2.0) + temp;
			}
		}
		temp = temp/(rows*(cols-4)-1);
		temp = Math.pow(temp, 0.5);
		double temp2 = Round(temp, 2);
		temp = temp2;
		return temp2;	
	}
	public double StdDev(int week){
		int c;
		double temp=0;
		double temp1=0;
		double mean = Mean(week);
		
		if(week>0 && week<=500){						
				for(c=4; c<cols; c++){
					temp1 = DataSet[week-1][c]-mean; 
					temp= Math.pow(temp1, 2.0) + temp;
					}	
				temp = temp/(cols-4-1);
				temp = Math.pow(temp, 0.5);
				double temp2 = Round(temp, 2);
				temp = temp2;
		}
		else{
			temp=-1;
		}
		return temp;	
	}
	public double StdDev(int first_week, int last_week){
		int r,c;
		double temp=0;
		double temp1=0;
		double mean = Mean(first_week, last_week);
		
		if(first_week<last_week && first_week>0 && last_week<=500){
			for (r=first_week-1; r<last_week; r++){
				for(c=4; c<cols; c++){
					temp1 = DataSet[r][c]-mean; 
					temp= Math.pow(temp1, 2.0) + temp;
				}
			}
			temp = temp/((last_week-first_week+1)*(cols-4)-1);	
			temp = Math.pow(temp, 0.5);
			double temp2 = Round(temp, 2);
			temp = temp2;
		}
		else if(first_week==last_week && first_week>0 && last_week<=500){
			double temp3 = StdDev(first_week);
			temp = temp3;		
		}
		else {
			temp=-1;
		}
		return temp;
	}
	public double StdDev(String region){
		int r,c;
		double temp=0;
		double temp1=1;
		String str2 = region;
		double mean = Mean(region);
		
		for(c=4; c<cols; c++){
			String str1 = ColumnNames[c];
			int result = str1.compareTo(str2);
				if(result==0){
					for (r=0; r<rows; r++){
						temp1 = DataSet[r][c]-mean; 
						temp= Math.pow(temp1, 2.0) + temp;
					}
				temp = temp/(rows-1);
				temp = Math.pow(temp, 0.5);
				double temp2 = Round(temp, 2);
				temp = temp2;
				temp1=0;
				}
		}
		if (temp1==1){
			temp=-1;
		}
		return temp;	
	}
		
}
