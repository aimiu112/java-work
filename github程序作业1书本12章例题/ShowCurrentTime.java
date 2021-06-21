import java.util.Scanner;//Scanner is in the java.util.package

public class ShowCurrentTime {
	public static void main(String[] args) {
		//Obtain the total milliseconds 
		long totalMilliseconds  = System.currentTimeMillis();
		
		//Compute the total seconds 
		long totalSeconds = totalMilliseconds / 1000;
		
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minutes in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;
		
		//Display results
		System.out.println("Current time is " + currentHour +":"
				+ currentMinute + ":" + currentSecond +" GMT");
	}
}
