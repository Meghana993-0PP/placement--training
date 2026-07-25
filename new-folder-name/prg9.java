import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class prg9{
public static void main(String args[])
{
	LocalDate da= LocalDate.now();
	System.out.println("Current Date: " +da);
	LocalTime curr = LocalTime.now();
	System.out.println("CurrentTime:" +curr);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter DOB(dd-MM-yyyy HH:mm):");

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	LocalDateTime dt = LocalDateTime.parse(sc.nextLine(),formatter);
	System.out.println("Date Of Birth: " +dt);
	Period age = Period.between(dt.toLocalDate(),da);
	System.out.println("Age:"  + age.getYears() + "years" + age.getMonths() + "Months" + age.getDays() +"Days");
	int dayslived=(age.getYears()*365) + (age.getMonths()*12) + age.getDays();
	System.out.println("DaysLived " +dayslived);
	int hourslived=(age

}}
