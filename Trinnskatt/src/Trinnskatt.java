import java.util.*;  
public class Trinnskatt {
public static void main(String[] args)  {  
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Skriv inn bruttoinntekt");  
	double a= sc.nextInt();
	sc.close();
	
	if (a < 164101) {
		System.out.print("Du betaler ikke skatt med denne inntekten");  
	}
	else if (a <230951) {
		double b=0.93;
		double c= a*b/100;
		System.out.print("Du betaler "+ b +"% skatt. Din trinnskatt blir da: " + c);
	}
	else if (a <580651) {
		double b=2.41;
		double c= a*b/100;
		System.out.print("Du betaler "+ b +"% skatt. Din trinnskatt blir da: " + c);
	}
	else if (a <934051) {
		double b=11.52;
		double c= a*b/100;
		System.out.print("Du betaler "+ b +"% skatt. Din trinnskatt blir da: " + c);
	}
	else if (a >934050) {
		double b=14.52;
		double c= a*b/100;
		System.out.print("Du betaler "+ b +"% skatt. Din trinnskatt blir da: " + c);
	}
	
}}
