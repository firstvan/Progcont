import java.lang.Integer;
import java.lang.System;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Rendezettseg {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer[]> list = new ArrayList<Integer[]>();
        while (in.hasNextLine()) {
            String temp = in.nextLine();
            String[] t = temp.split(" ");

            Integer[] t2 = new Integer[t.length];

            for (int i = 0; i < t.length; i++) {
                t2[i] = Integer.parseInt(t[i]);
            }

            list.add(t2);
        }

        in.close();

        for (Integer[] ij : list) {
            int rendezett = 0;
            for (int i = 0; i < ij.length; i++){
                for (int j = 0; j < ij.length; j++) {
                    if(ij[i] > ij[j] && i < j) {
                        rendezett++;
                    }
                }
            }

            System.out.println(rendezett);
        }
    }
}