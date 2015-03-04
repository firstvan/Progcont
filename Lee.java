import java.util.Scanner;

public class Lee {

	private static int leeDist(int q, int a, int b){
		
		if(Math.abs(a-b) < (q-Math.abs(a-b)))
			return Math.abs(a-b);
		else
			return q-Math.abs(a-b);
		
	}
	
	private static int leeDistCalc(int q, String a, String b)
	{
	    
	    int dist = 0;
	    
	    for (int i = 0; i < a.length(); i++) {
		dist += leeDist(q, a.charAt(i)-'0', b.charAt(i)-'0');
	    }
	    
	    return dist;	    
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int q = in.nextInt();
		int count = in.nextInt();
		
		String[] szamok = new String[count];
		
		for (int i = 0; i < count; i++) {
			szamok[i] = in.next();
		}
		
		in.close();
		
		int minLeeDist = leeDistCalc(q, szamok[0], szamok[1]);
		
		for (int i = 0; i < count; i++) {
		    for (int j = 0; j < count; j++) {
			if(i != j){
			    int temp = leeDistCalc(q, szamok[i], szamok[j]);
			    if(temp < minLeeDist) {
				minLeeDist = temp;
			    }
			}
		    }
		}
		
		System.out.println(minLeeDist);
		
		
	}

}
