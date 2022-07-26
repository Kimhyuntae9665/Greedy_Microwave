import java.util.Scanner;

public class Greedy_Reference {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int cnta,cntb,cntc;
		
		if(t%10!=0) { // 10초로도 나누어 떨어지지 않는 것 있으면 먼저 -1 출력하는게 효율성이 훨씬 좋다.
			System.out.println("-1");
		}
		
		// if else 구문도 효율성 굳 나는 if 문 여러개 썻는데
		
		
		else {
			cnta = t/300;
			t = t%300;
			
			
			cntb = t/60;
			t = t%60;
			
			
			cntc = t/10;
			
			System.out.println(cnta+""+cntb+""+cntc);
		}
		
		in.close();

	}

}
