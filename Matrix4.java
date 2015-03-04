import java.util.Scanner;


public class Matrix4 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt(), m = in.nextInt();
	
	int[][] matrix = new int[n][m];
	
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		matrix[i][j] = in.nextInt();
	    }
	}
	
	in.close();
	
	StringBuilder sb = new StringBuilder();
	
	for (int i = 0; i < m; i++) {
	    int pos = 0, neg = 0;
	    for (int j = 0; j < n; j++) {
		if(matrix[j][i] > 0){
		    pos++;
		} else if(matrix[j][i] < 0){
		    neg++;
		}
	    }
	    if(pos > neg){
		sb.append(i+1);
		sb.append(" ");
	    }
	}
	
	System.out.println(sb.toString().trim());
	
    }

}
