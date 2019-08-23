package module_13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question_4 {

	
	public static void main(String[] args){
		   String dateStr_3="28/09/16";
		   DateTimeFormatter formatter_3=DateTimeFormatter.ofPattern("dd/MM/yy");
		   LocalDate localDate_3= LocalDate.parse(dateStr_3,formatter_3);
		   System.out.println("Input String with value: "+dateStr_3);
		   System.out.println("Converted Date in default ISO format: "+localDate_3);
	}
}
