import java.util.ArrayList;
import java.util.Scanner;


public class Manhattan {

    public static void main(String[] args) {
	ArrayList<String[]> array = new ArrayList<String[]>();
	
	Scanner in = new Scanner(System.in);
	
	while(in.hasNextLine()){
	    array.add(in.nextLine().split(" "));
	}
	
	in.close();
	
	int min = man_dist(array.get(0), array.get(1));
	
	for (int i = 0; i < array.size(); i++) {
	    for (int j = 0; j < array.size(); j++) {
		if(i != j){
		    int temp = man_dist(array.get(i), array.get(j));
		    if(temp < min){
			min = temp;
		    }
		}
	    }
	}
	System.out.println(min);
    }

    private static int man_dist(String[] strings, String[] strings2) {
	
	int sum = 0;
	for (int i = 0; i < strings2.length; i++) {
	    sum += Math.abs(Integer.parseInt(strings[i])-Integer.parseInt(strings2[i]));
	}
	
	return sum;
    }

}
