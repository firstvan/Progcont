import java.util.Scanner;

class Workers{
    
    
    public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	
	int sum1 = 0, sum2 = 0;
	
	while(in.hasNextLine()){
	    String lin = in.nextLine();
	    
	    String[] array = lin.split(",");
	    
	    int szam1 = 0, szam2 = 0;
	    
	    szam1 = Integer.parseInt(array[2]);
	    
	    if(!array[3].isEmpty())
	    {
		szam2 = Integer.parseInt(array[3]);
		szam2 = (int)(szam1 * (double) szam2 / (double)100);
	    }
	    
	    sum1 += szam1 * 12;
	    sum2 += szam2 * 12;
	}
	
	System.out.println(String.valueOf(sum1) + " + " + String.valueOf(sum2) + " = "+String.valueOf(sum1+sum2));
    }
}