import java.util.ArrayList;
import java.util.Scanner;


public class Matrix3 {

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
	int max = 0;
	for (int i = 0; i < m; i++) {
	    int temp = 0;
	    for (int j = 0; j < n; j++) {
		if(matrix[j][i] == 0){
		    temp++;
		}
	    }
	    if (max < temp){
		max = temp;
	    }
	}
	
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < m; i++) {
	    int temp = 0;
	    for (int j = 0; j < n; j++) {
		if(matrix[j][i] == 0){
		    temp++;
		}
	    }
	    if (temp == max){
		sb.append(String.valueOf(i+1)+" ");
	    }
	}
	
	System.out.println(sb.toString().trim());
	
	
	
    }

}
