import java.util.Scanner;


public class Hang {

    public static int tavolsag(String a, String b){
	int tav = 0;
	
	int meret = (a.length() < b.length()) ? a.length() : b.length();
	
	String maganh = "aeiou";
	
	for (int i = 0; i < meret; i++) {
	    if(a.charAt(i) != b.charAt(i)){
		if(maganh.contains(String.valueOf(a.charAt(i))) && maganh.contains(String.valueOf(b.charAt(i))))
		{
		    tav++;
		}
		else
		if(!maganh.contains(String.valueOf(a.charAt(i))) && !maganh.contains(String.valueOf(b.charAt(i))))
		{
		    tav += 5;
		}
		else
		{
		    tav += 10;
		}
	    }
	}
	
	tav += Math.abs(a.length()-b.length());
	
	return tav;
    }
    
    
    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	
	int szam = in.nextInt();
	in.nextLine();
	
	String[] szavak = new String[szam];
	
	for (int i = 0; i < szam; i++) {
	    szavak[i] = in.nextLine();
	}
	
	in.close();
	
	int max = tavolsag(szavak[0], szavak[1]);
	
	for (int i = 0; i < szavak.length; i++) {
	    for (int j = 0; j < szavak.length; j++) {
		if(i != j){
		    int temp = tavolsag(szavak[i], szavak[j]);
		    if(temp > max){
			max = temp;
		    }
		    
		}
	    }
	}
	
	System.out.println(max);
    }

}
