import java.util.Scanner;

public class Ring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] act_list = new int[20];
		System.out.println("Enter no of processes : ");
		int no_pr = sc.nextInt();
    
    for(int k=0;k<20;k++)
    {
        act_list[k]=-1;
    }
	int init,curr_p=0;
    System.out.println("Enter the Initiator for election : ");
	init = sc.nextInt();
    i=init;

    do{
        if((i%no_pr)!=no_pr-1){
            System.out.println("Election msg from " + i%no_pr + " to " + (i+1)%no_pr);
            act_list[curr_p]=i%no_pr;
        }
        else{
            System.out.println("Election msg from " + i%no_pr + " to " + (i+2)%no_pr);
            act_list[curr_p]=i%no_pr;
            i++;
        }
        int j=0;
        System.out.print("Active list = [");
        while(act_list[j]!=-1){
            System.out.print(act_list[j]);
            j++;
        }
        System.out.println(" ] ");
        i++;
        curr_p++;

    }while((i%no_pr)!=init);
	
	int newco = no_pr-1;
    System.out.println("New coordinator is " + newco); 
	
	}

}
