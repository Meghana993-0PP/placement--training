import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Main{
public static void main(String args[])
{
LocalDate da = LocalDate.now();
System.out.println("Current Date: " + da);
LocalTime curr = LocalTime.now();
System.out.println("Current Time: " + curr);
Scanner sc = new Scanner(System.in);
System.out.print("Enter DOB (dd-MM-yyyy HH:mm): ");
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
LocalDateTime dt = LocalDateTime.parse(sc.nextLine(),formatter);
System.out.println("Date of Birth: " + dt);
Period age = Period.between(dt.toLocalDate(),da);
System.out.println("Age: " + age.getYears() +" Years " + age.getMonths() + "Months" + age.getDays() + "Days");
int years = age.getYears();
int months = age.getMonths();
int days = age.getDays();
int totalMonths = (years * 12) + months;
int totalDays = (years * 365) + (months * 30) + days;
int totalHours = totalDays * 24;
int totalMinutes = totalHours * 60;
long totalSeconds = (long) totalMinutes * 60;
long sleepHours = totalDays * 6;
long sleepDays = sleepHours / 24;
long sleepMinutes = sleepHours * 60;
long sleepYears = sleepDays / 365;
LocalDate retirementDate = dt.toLocalDate().plusYears(60);
int yearsLeft = 60 - years;
int daysToRetire = yearsLeft * 365;
int hoursToRetire = daysToRetire * 24;
int minutesToRetire = hoursToRetire * 60;
long secondsToRetire = (long) minutes Retire * 60;
System.out.println("Retirement Date : " + retirementDate);
System.out.println("Years to Retire : " + yearsLeft);
System.out.println("Days to Retire : " + daysToRetire);
System.out.println("Hours to Retire : " + hoursToRetire);
System.out.println("Minutes to Retire : " + minutesToRetire);
System.out.println("Seconds to Retire : " + secondsToRetire);
System.out.println("Sleep Hours : " + sleepHours);
System.out.println("Sleep Days : " + sleepDays);
System.out.println("Sleep Minutes : " + sleepMinutes);
System.out.println("Sleep Years : " + sleepYears);
System.out.println("Months Lived : " + totalMonths);
System.out.println("Days Lived : " + totalDays);
System.out.println("Hours Lived : " + totalHours);
System.out.println("Minutes Lived : " + totalMinutes);
System.out.println("Seconds Lived : " + totalSeconds);

}
}