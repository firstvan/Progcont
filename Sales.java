import java.util.ArrayList;
import java.util.Scanner;


public class Sales {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String beosztas = in.nextLine();

	ArrayList<String[]> lines = new ArrayList<>(); 
	
	while(in.hasNextLine()){
	    lines.add(in.nextLine().split(","));
	}
	
	in.close();

	int ossz = 0;
	
	for (String[] strings : lines) {
	   if(strings[4].contains(beosztas)){
	       if(!strings[3].isEmpty()){
		   ossz += Integer.parseInt(strings[2]) * ((Integer.parseInt(strings[3])+100) /(double)100);
	       } else {
		   ossz += Integer.parseInt(strings[2]);
	       }
	   }
	}
	
	
	System.out.println(ossz);
    }

}
