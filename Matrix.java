
import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int n,m;
	n = in.nextInt();
	m = in.nextInt();
	
	int[][] matrix = new int[n][m];
	
	for (int i = 0; i < n; i++) {
	   for (int j = 0; j < m; j++) {
	       matrix[i][j] = in.nextInt();
	   } 
	}
	in.close();
	
	int lk;
	int temp = 0;
	for (int i = 0; i < n; i++) {
	    if(matrix[i][0] > 0) {
		temp++;
	    }
	}
	lk = temp;
	
	for (int i = 0; i < m; i++) {
	    temp = 0;
	    for (int j = 0; j < n; j++) {
		if(matrix[j][i] > 0)
		    temp++;
	    }
	    if(lk > temp){
		lk = temp;
	    }
	}
	
	ArrayList<Integer> asd = new ArrayList<Integer>();
	
	for (int i = 0; i < m; i++) {
	    temp = 0;
	    for (int j = 0; j < n; j++) {
		if(matrix[j][i] > 0)
		    temp++;
	    }
	    if(lk == temp)
	    {
		asd.add(i+1);
	    }
	}
	
	for (int i = 0; i < asd.size(); i++) {
	    if(i == asd.size()-1){
		System.out.println(asd.get(i));
	    }
	    else
	    {
		System.out.print(String.valueOf(asd.get(i))+" ");
	    }
	}
	
    }

}
