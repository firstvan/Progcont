import java.lang.Integer;
import java.lang.StringBuffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Lista {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String[]> array = new ArrayList<String[]>();

        while (!in.hasNext("\\[\\]")) {
            String temp = in.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i < temp.length()-1; i++) {
                sb.append(temp.charAt(i));
            }
            array.add(sb.toString().split(", "));

        }

        in.close();
        List<Integer> out = new ArrayList<Integer>();

        for (String[] sarray: array) {
            int max = 1;
            int temp = 1;
            for (int i = 1; i < sarray.length; i++) {
                if (sarray[i - 1].compareTo(sarray[i]) < 0) {
                    temp++;

                    if (temp > max) {
                        max = temp;
                    }

                } else {
                    temp = 1;
                }
            }

            System.out.println(max);
        }

    }

}