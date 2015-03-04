import java.util.ArrayList;
import java.util.Scanner;


public class Leghsor {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int legh = 0;
	ArrayList<String> lines = new ArrayList<>();
	while(in.hasNextLine()){
	    String line = in.nextLine();
	    lines.add(line);
	    if(line.length() > legh){
		legh = line.length();
	    }
	}
	
	in.close();

	for (int i = 0; i != lines.size(); i++) {
	    if(lines.get(i).length() == legh){
		String[] temp = lines.get(i).split(" ");
		System.out.println(String.valueOf(i+1)+": "+String.valueOf(temp.length)+" "+String.valueOf(lines.get(i).length()));
	    }
	}
	
    }

}
