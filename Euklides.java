import java.util.ArrayList;
import java.util.Scanner;


public class Euklides {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	ArrayList<String[]> lines = new ArrayList<>();
	while(in.hasNextLine()){
	    lines.add(in.nextLine().split(" "));
	}
	
	in.close();
	
	int max = euklides_dist(lines.get(0), lines.get(1));
	
	for (int i = 0; i < lines.size(); i++) {
	    for (int j = 0; j < lines.size(); j++) {
		if(i != j){
		    int temp = euklides_dist(lines.get(i), lines.get(j));
		    if(max < temp) max = temp;  
		}
	    }
	}
	
	System.out.println(max);
    }

    private static int euklides_dist(String[] strings, String[] strings2) {
	int tav = 0;
	
	for (int i = 0; i < strings2.length; i++) {
	    tav += Math.pow(Math.abs(Integer.parseInt(strings[i]) - Integer.parseInt(strings2[i])), 2);
	}
	
	return tav;
    }

}
