import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class cUserAnalyst {

	private static cAnalytics ds;
	private static cDataSet ds1;
	
	public static void main(String[] args) {	
		try {
			
			int row = 3;
			int ini_row, last_row;
			ini_row=2;
			last_row=66;
			String Row_name = "NE";
			int columanName=0;
			ds = new cAnalytics("/Users/mariavirginiarodriguez/Northwestern/Quarter 3/Big Data Analytics/Java Assignment/WeeklyTemperature.csv");
			ds1 = new cDataSet("/Users/mariavirginiarodriguez/Northwestern/Quarter 3/Big Data Analytics/Java Assignment/WeeklyTemperature.csv");
			while(columanName!=6){
			columanName = mainMenu();
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int mainMenu() throws NumberFormatException, IOException
	{
		
		Integer option, option_display, option_min, option_max, option_mean, option_devstd, option_w1, option_w2;
		
		System.out.println();
		System.out.println("Select 1 to view data display options");
		System.out.println("Select 2 to find minimums");
		System.out.println("Select 3 to find maximums");
		System.out.println("Select 4 to calculate means");
		System.out.println("Select 5 to calculate standard deviations");
		System.out.println("Select 6 to exit");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		option = new Integer(br.readLine()).intValue();
		
		if(option==1)
		{
			System.out.println();
			System.out.println("Select 1 to display all weeks");
			System.out.println("Select 2 to display certain week");
			System.out.println("Select 3 to display a range of weeks");
			System.out.println("Select 4 to display a column");
			System.out.println("Select 5 to exit");
			
			BufferedReader br_display= new BufferedReader(new InputStreamReader(System.in));
			option_display = new Integer(br_display.readLine()).intValue();
			
			if(option_display==1){
				System.out.println();
				ds.display();
			}
			else if(option_display==2){
				System.out.println();
				System.out.println("Select number of week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				ds.display(option_w1);	
			}
			else if(option_display==3){
				System.out.println();
				System.out.println("Write initial week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("Write final week:");
				BufferedReader week_fin= new BufferedReader(new InputStreamReader(System.in));
				option_w2 = new Integer(week_fin.readLine()).intValue();
				System.out.println();
				ds.display(option_w1, option_w2);
				
			}
			else if(option_display==4){
				System.out.println();
				System.out.println("Write name of the column:");
				BufferedReader col= new BufferedReader(new InputStreamReader(System.in));
				String col_name = null;
		        try {
		            col_name = col.readLine();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } 
		        System.out.println();
		        ds.display(col_name);	
						
			}
			else if(option_display==5){
				option=6;	
			}
			else{
				System.out.println();
				System.out.println("Please select again");
			}	
		}
		else if(option==2){
			System.out.println();
			System.out.println("Select 1 to display the minimum of all weeks");
			System.out.println("Select 2 to display the minimum of a week");
			System.out.println("Select 3 to display the minimum of a range of weeks");
			System.out.println("Select 4 to display the minimum of a column");
			System.out.println("Select 5 to exit");
			
			BufferedReader br_display= new BufferedReader(new InputStreamReader(System.in));
			option_display = new Integer(br_display.readLine()).intValue();
			
			if(option_display==1){
				System.out.println();
				System.out.println("The minimum temperature was "+ ds.Min());
			}
			else if(option_display==2){
				System.out.println();
				System.out.println("Select number of week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("The minimum temperature of week "+ option_w1 + " was "+ ds.Min(option_w1));
			}
			else if(option_display==3){
				System.out.println();
				System.out.println("Write initial week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("Write final week:");
				BufferedReader week_fin= new BufferedReader(new InputStreamReader(System.in));
				option_w2 = new Integer(week_fin.readLine()).intValue();
				System.out.println();
				System.out.println("The minimum temperature between week "+ option_w1 + " and week "+option_w2+" was "+ds.Min(option_w1, option_w2));
				
			}
			else if(option_display==4){
				System.out.println();
				System.out.println("Write name of the column:");
				BufferedReader col= new BufferedReader(new InputStreamReader(System.in));
				String col_name = null;
		        try {
		            col_name = col.readLine();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } 
		        System.out.println();
		        System.out.println("The minimum temperature of the " + col_name +" region was "+ ds.Min(col_name));
				
			}
			else if(option_display==5){
				option=6;
			}
			else{
				System.out.println();
				System.out.println("Please select again");
			}
		}
		else if(option==3){
			System.out.println();
			System.out.println("Select 1 to display the maximum of all weeks");
			System.out.println("Select 2 to display the maximum of a week");
			System.out.println("Select 3 to display the maximum of a range of weeks");
			System.out.println("Select 4 to display the maximum of a column");
			System.out.println("Select 5 to exit");
		
			BufferedReader br_display= new BufferedReader(new InputStreamReader(System.in));
			option_display = new Integer(br_display.readLine()).intValue();
			
			if(option_display==1){
				System.out.println();
				System.out.println("The maximum temperature was "+ ds.Max());
			}
			else if(option_display==2){
				System.out.println();
				System.out.println("Select number of week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("The maximum temperature of week "+ option_w1 + " was "+ ds.Max(option_w1));
					
			}
			else if(option_display==3){
				System.out.println();
				System.out.println("Write initial week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("Write final week:");
				BufferedReader week_fin= new BufferedReader(new InputStreamReader(System.in));
				option_w2 = new Integer(week_fin.readLine()).intValue();
				System.out.println();
				System.out.println("The maximum temperature between week "+ option_w1 + " and week "+option_w2+" was "+ds.Max(option_w1, option_w2));
				
			}
			else if(option_display==4){
				System.out.println();
				System.out.println("Write name of the column:");
				BufferedReader col= new BufferedReader(new InputStreamReader(System.in));
				String col_name = null;
		        try {
		            col_name = col.readLine();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } 
		        System.out.println();
		        System.out.println("The maximum temperature of the " + col_name +" region was "+ ds.Max(col_name));
					
			}
			else if(option_display==5){
				option=6;
			}
			else{
				System.out.println();
				System.out.println("Please select again");
			}
					
		}
		else if(option==4){
			System.out.println();
			System.out.println("Select 1 to display the mean of all weeks");
			System.out.println("Select 2 to display the mean of a week");
			System.out.println("Select 3 to display the mean of a range of weeks");
			System.out.println("Select 4 to display the mean of a column");
			System.out.println("Select 5 to exit");
			
			BufferedReader br_display= new BufferedReader(new InputStreamReader(System.in));
			option_display = new Integer(br_display.readLine()).intValue();
			
			if(option_display==1){
				System.out.println();
				System.out.println("The average temperature was "+ ds.Mean());
			}
			else if(option_display==2){
				System.out.println();
				System.out.println("Select number of week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("The average temperature of week "+ option_w1 + " was "+ ds.Mean(option_w1));
				
			}
			else if(option_display==3){
				System.out.println();
				System.out.println("Write initial week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("Write final week:");
				BufferedReader week_fin= new BufferedReader(new InputStreamReader(System.in));
				option_w2 = new Integer(week_fin.readLine()).intValue();
				System.out.println();
				System.out.println("The average temperature between week "+ option_w1 + " and week "+option_w2+" was "+ds.Mean(option_w1, option_w2));
				
			}
			else if(option_display==4){
				System.out.println();
				System.out.println("Write name of the column:");
				BufferedReader col= new BufferedReader(new InputStreamReader(System.in));
				String col_name = null;
		        try {
		            col_name = col.readLine();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } 
		        System.out.println();
		        System.out.println("The average temperature of the " + col_name +" region was "+ ds.Mean(col_name));
				
				
			}
			else if(option_display==5){
				option=6;
			}
			else{
				System.out.println("Please select again");
			}
			
		}
		else if(option==5){
			System.out.println();
			System.out.println("Select 1 to display the standard deviation of all weeks");
			System.out.println("Select 2 to display the standard deviation of a week");
			System.out.println("Select 3 to display the standard deviation of a range of weeks");
			System.out.println("Select 4 to display the standard deviation of a column");
			System.out.println("Select 5 to exit");
		
			BufferedReader br_display= new BufferedReader(new InputStreamReader(System.in));
			option_display = new Integer(br_display.readLine()).intValue();
			
			if(option_display==1){
				System.out.println();
				System.out.println("The standard deviation of the temperature was "+ ds.StdDev());
			}
			else if(option_display==2){
				System.out.println();
				System.out.println("Select number of week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("The standard deviation of the temperature of week "+ option_w1 + " was "+ ds.StdDev(option_w1));
					
			}
			else if(option_display==3){
				System.out.println();
				System.out.println("Write initial week:");
				BufferedReader week_ini= new BufferedReader(new InputStreamReader(System.in));
				option_w1 = new Integer(week_ini.readLine()).intValue();
				System.out.println();
				System.out.println("Write final week:");
				BufferedReader week_fin= new BufferedReader(new InputStreamReader(System.in));
				option_w2 = new Integer(week_fin.readLine()).intValue();
				System.out.println();
				System.out.println("The standard deviation of the temperature between week "+ option_w1 + " and week "+option_w2+" was "+ds.StdDev(option_w1, option_w2));

			}
			else if(option_display==4){
				System.out.println();
				System.out.println("Write name of the column:");
				BufferedReader col= new BufferedReader(new InputStreamReader(System.in));
				String col_name = null;
		        try {
		            col_name = col.readLine();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } 
		        System.out.println();
		        ds.StdDev(col_name);
		        System.out.println();
		        System.out.println("The standard deviation of the temperature of the " + col_name +" region was "+ ds.StdDev(col_name));						
			}
			else if(option_display==5){
				option=6;
			}
			else{
				System.out.println("Please select again");
			}
			
			
		}
		
		return option.intValue();
		
	}

	

}
