import java.util.*;  
public class Karakterpoeng {
public static void main(String[] args)  {  
	
		Scanner sc= new Scanner(System.in);
		
		for (int i = 1; i<11; i++) {
		System.out.print("Skriv inn antall poeng: "); 
		int k= sc.nextInt();
		System.out.print("Student " +i+ ": ");
		
		if (k < 0) {
			System.out.print("Poengsummen må være mellom 0 og 100, skriv inn ny poengsum");
			System.out.println();
			i=i-1;
			
		}
		else if (k > 100) {
			System.out.print("Poengsummen må være mellom 0 og 100, skriv inn ny poengsum");
			System.out.println();
			i=i-1;
		}
		else if (k > 89){
			System.out.print("Karakter A");
			System.out.println();
		}
		else if (k > 79){
			System.out.print("Karakter B");
			System.out.println();
		}
		else if (k > 59){
			System.out.print("Karakter C");
			System.out.println();
		}
		else if (k > 49){
			System.out.print("Karakter D");
			System.out.println();
		}
		else if (k > 39){
			System.out.print("Karakter E");
			System.out.println();
		}
		else if (k < 40){
			System.out.print("Karakter F");	
			System.out.println();
		}
		}
		sc.close();

}}
