package module_13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question_5 {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.of(2019, 8, 5, 9, 00,22);
		LocalDateTime d2 = LocalDateTime.of(2019, 8, 5, 19, 30,32);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss a");  
		System.out.println("Post Date and Time = " +d1.format(format));
		System.out.println("Current Time = " +d2.format(format));
		
		
		Duration duration = Duration.between(d1, d2);
		
		long seconds = Math.abs(duration.getSeconds());
		long hours = seconds / 3600;
		seconds -= (hours * 3600);
		long minutes = seconds / 60;
		seconds -= (minutes * 60);
		
		StringBuilder sb = new StringBuilder();
		
		if(minutes == 0 && hours ==0)
		{
			sb.append("Few Seconds Ago");
		}
		else if(hours ==0)
		{
			sb.append(minutes+" Minutes Ago");
		}
		else 
		{
			sb.append(hours+" Hours Ago");
		}
		
		System.out.println("Duration display in post = "+sb.toString());
	}

}
