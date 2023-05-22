import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Bully {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of processes : ");
    int np = sc.nextInt();
    System.out.println(np + " is the coordinator and it has failed");
	
	int co = np;
	System.out.println("Enter initiator : ");
	int ini = sc.nextInt();
	
	for (int i = ini; i < co; i++)
    {
       System.out.println("Election initialed by " + i);
        // sending election msg to higher processes
        for (int j = i + 1; j <= co; j++)
        {
            System.out.println(i + " -> election -> " + j);
        }
        // getting response from higher processes
        for (int j = co - 1; j > i; j--)
        {
            System.out.println( i + " <- OK <- " + j);
        }
    }
	int newco = co - 1;
	System.out.println("Process " + newco + " is elected as new coordinator");
    for (int i = np - 2; i > 0; i--)
    {
        System.out.println(np-1 + " -> cooredinator msg -> " + i);
    }
	}
}