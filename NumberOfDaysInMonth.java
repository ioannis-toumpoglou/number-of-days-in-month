import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		String month;
		int year;
		int numberOfDays;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Let's find out the number of days in a month");
		System.out.print("Enter the month: ");
		month = scan.nextLine();
		System.out.print("Enter the year: ");
		year = scan.nextInt();
		
		numberOfDays = getDaysInMonth(month, year);
		System.out.println(numberOfDays);
		
		scan.close();
	}
	
	// Check if the year is a leap year
	public static boolean isLeapYear(int year) {
        
        while (year>=1 && year<=9999) {
            if ((year%4 == 0) && (year%100 !=0) || (year%400 ==0)){
            	return true;
            	}
            else
            	return false;
        }
        return false;
    }
	
	// Return the number of days of a month in a specific year
	public static int getDaysInMonth(String month, int year) {
		switch (month) {
		case "January":case "March":case "May":case "July":case "August":case "October":case "December":
			return 31;
		case "February":
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		case "April":case "June":case "September":case "November":
			return 30;
		default:
			return -1;
		}
	}

}
