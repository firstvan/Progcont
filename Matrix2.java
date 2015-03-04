import java.util.ArrayList;
import java.util.Scanner;

class Matrix2{
    
    
    public static void main(String[] argv){
	
	Scanner in = new Scanner(System.in);
	
	int n,m;
	n = in.nextInt();
	m = in.nextInt();
	
	int[][] szamok = new int[n][m];
	
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		szamok[i][j] = in.nextInt();
	    }
	}
	
	in.close();
	
	ArrayList<Integer> out = new ArrayList<Integer>();
	
	for (int i = 0; i < m; i++) {
	    int pos = 0, neg = 0;
	    for (int j = 0; j < n; j++) {
		if(szamok[j][i] > 0)
		{
		    pos++;
		}
		
		if(szamok[j][i] < 0)
		{
		    neg++;
		}
	    }
	    if(pos > neg)
	    {
		out.add(i+1);
	    }
	}
	
	StringBuffer sb = new StringBuffer();
	
	for (int i: out) {
	    sb.append(i);
	    sb.append(" ");
	}
	
	System.out.println(sb.toString().trim());
    }
    
}