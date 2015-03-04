import java.lang.Integer;
import java.lang.System;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Erdos {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine()) {
                int loop = in.nextInt();
                in.nextLine();
                List<Integer[]> array = new ArrayList<Integer[]>();

                for (int i = 0; i < loop; i++) {
                    String be = in.nextLine();
                    String[] temp2 = be.split(" ");
                    Integer[] temp = new Integer[temp2.length];

                    for (int j = 0; j < temp2.length; j++) {
                       temp[j] = Integer.parseInt(temp2[j]);
                    }

                    array.add(temp);

                }

                System.out.println(biggestErdos(array));
            }
        }
    }

    public static void doit(HashMap<Integer,Integer> a1, List<Integer[]> a) {
        for (Integer[] asd : a) {
            if (!java.util.Arrays.asList(asd).contains(1)) {
                boolean volt = false;
                int szama = 0;
                for (int i = 0; i < asd.length; i++) {
                    if (a1.containsKey(asd[i])) {
                        volt = true;
                        if (szama < asd[i]) {
                            szama = a1.get(asd[i]);
                        }
                    }
                }

                if (volt == true) {
                    for (int i = 0; i < asd.length; i++) {
                        if (!a1.containsKey(asd[i])) {
                            a1.put(asd[i], szama + 1);
                            doit(a1, a);
                        }
                    }
                }
            }
        }
    }
    public static int biggestErdos(List<Integer[]> a) {
        HashMap<Integer, Integer> erdosszamok = new HashMap<Integer, Integer>();

        for (Integer[] asd : a) {
            if (java.util.Arrays.asList(asd).contains(1)) {
                for (int i = 0; i < asd.length; i++) {
                    if (asd[i] != 1) {
                        erdosszamok.put(asd[i], 1);
                    }
                }
            }
        }

        for (Integer[] asd : a) {
            if (!java.util.Arrays.asList(asd).contains(1)) {
                boolean volt = false;
                int szama = 0;
                for (int i = 0; i < asd.length; i++) {
                    if (erdosszamok.containsKey(asd[i])) {
                        volt = true;
                        if (szama < asd[i]) {
                            szama = erdosszamok.get(asd[i]);
                        }
                    }
                }

                if (volt == true) {
                    for (int i = 0; i < asd.length; i++) {
                        if (!erdosszamok.containsKey(asd[i])) {
                            erdosszamok.put(asd[i], szama+1);
                            doit(erdosszamok, a);
                        }
                    }
                }
            }
        }

        int legnagyobb = 0;

        for (int szam : erdosszamok.values()) {
            if(legnagyobb < szam) {
                legnagyobb = szam;
            }
        }

        return legnagyobb;
    }
}