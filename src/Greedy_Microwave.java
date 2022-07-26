import java.util.Scanner;

public class Greedy_Microwave {
	
	public static int N;
	public static int[] arr = new int[3];
	public static int  Remain_time;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		
		Remain_time = N;
		
		
		
		
		
		
		if(Remain_time/300>0) {
			
			arr[0] = Remain_time/300;
			Remain_time = Remain_time%300;
			
			
		}
		
		if(Remain_time/60>0) {
			
			arr[1] = Remain_time/60;
			Remain_time = Remain_time%60;
		}
		
		if(Remain_time/10>0) {
			arr[2] = Remain_time/10;
			Remain_time = Remain_time%10;
		}
		
		
		if(Remain_time!=0) {
			System.out.println("-1");
			System.exit(0);
		}
		
		
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
