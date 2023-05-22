import java.rmi.*;
import java.util.Scanner;


public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			String serverUrl = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverUrl);
			
			System.out.println("Enter First Number: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter Second Number: ");
			double num2 = sc.nextDouble();
			
			System.out.println("Addition is: " + serverIntf.Addition(num1,num2));
		}
		catch(Exception e){
			System.out.println("Exception occured at client" + e.getMessage());
		}
	}
}