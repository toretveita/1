import java.util.*;  
public class fakultet {
public static void main(String[] args)  {  
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Skriv inn heltall n: ");  
		int n= sc.nextInt();
		sc.close();
		
		int x = 1;
		for (int i = 1; i <= n; i++) {
			x = x*i;
}
		System.out.print("n! = " + x);
}}
