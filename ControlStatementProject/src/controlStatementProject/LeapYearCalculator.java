package controlStatementProject;
import java.util.Scanner;

public class LeapYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m;
		int y;
		String nod = "Number of Days : ";
		int ly;
		System.out.print("Enter the month (1-12) : ");
		m = scan.nextInt();
		System.out.print("Enter the year : ");
		y = scan.nextInt();
		System.out.println();
		//if-else statement
		if((y%4==0 && y%100 !=0)|| y%400==0) {
			System.out.println("Leap Year");
			ly = 1;
		}
		else {
			System.out.println("Not Leap Year");
			ly = 0;
		}
		//Ternary Operator
		String eo = m % 2 == 0 ? "Even" : "Odd";
		System.out.println("The Month is "+eo);
		//switch-case
		switch(m) {
		case 1 :
			System.out.println(nod+"31 Days");
			break;
		case 2 :
			if(ly ==1) {
				System.out.println(nod+"29 Days");
			}else {
				System.out.println(nod+"28 Days");
			}
			break;
		case 3 :
			System.out.println(nod+"31 Days");
			break;
		case 4 :
			System.out.println(nod+"30 Days");
			break;
		case 5 :
			System.out.println(nod+"31 Days");
			break;
		case 6 :
			System.out.println(nod+"30 Days");
			break;
		case 7 :
			System.out.println(nod+"31 Days");
			break;
		case 8 :
			System.out.println(nod+"31 Days");
			break;
		case 9 :
			System.out.println(nod+"30 Days");
			break;
		case 10:
			System.out.println(nod+"31 Days");
			break;
		case 11 :
			System.out.println(nod+"30 Days");
			break;
		case 12 :
			System.out.println(nod+"31 Days");
			break;
		default :
			System.out.println("Invalid Input!");
		}
		scan.close();
	}

}
