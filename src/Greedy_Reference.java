import java.util.Scanner;

public class Greedy_Reference {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int cnta,cntb,cntc;
		
		if(t%10!=0) { // 10�ʷε� ������ �������� �ʴ� �� ������ ���� -1 ����ϴ°� ȿ������ �ξ� ����.
			System.out.println("-1");
		}
		
		// if else ������ ȿ���� �� ���� if �� ������ ���µ�
		
		
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
