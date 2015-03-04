import java.lang.StringBuffer;
import java.lang.System;
import java.util.Scanner;


class Szamjegy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (!in.hasNext("0")) {
            int loop = in.nextInt();

            int[] tomb = new int[10];
            for (int i = 0; i < loop; i++) {
                String temp = in.next();

                for (int j = 0; j < temp.length(); j++) {
                    tomb[temp.charAt(j) - '0']++;
                }
            }

            StringBuffer sb = new StringBuffer();

            for (int i : tomb) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString().trim());
        }

        in.close();
    }
}