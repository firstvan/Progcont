import java.util.*;

/**
 * Created by firstvan on 15/03/15.
 */


class Csomopont {
    private String neve;
    private ArrayList<Csomopont> childs;
    public int melyseg;

    public Csomopont(String s, int m) {
        neve = s;
        childs = new ArrayList<Csomopont>();
        melyseg = m;
    }


    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public ArrayList<Csomopont> getChilds() {
        return childs;
    }

    public void setChilds(ArrayList<Csomopont> childs) {
        this.childs = childs;
    }
}

class Fa2 {
    private Csomopont gyoker;
    public int m = 0;

    public Csomopont getGyoker() {
        return gyoker;
    }

    public void setGyoker(Csomopont gyoker) {
        this.gyoker = gyoker;
    }

    public Fa2(String s) {
        gyoker = new Csomopont(s, 0);
    }

    public String add(String sb) {
        Csomopont temp = searchNode(sb.charAt(0));
        if (temp != null) {
            temp.getChilds().add(new Csomopont(String.valueOf(sb.charAt(1)), temp.melyseg + 1));
            if (m < temp.melyseg + 1) {
                m = temp.melyseg + 1;
            }


        } else {
            temp = searchNode(sb.charAt(1));
            if (temp != null) {
                temp.getChilds().add(new Csomopont(String.valueOf(sb.charAt(0)), temp.melyseg + 1));
                if (m < temp.melyseg + 1) {
                    m = temp.melyseg + 1;
                }
            }
        }

        if (temp == null) {
            return sb;
        } else
            return null;
    }


    public Csomopont searchNode(char s) {
        Csomopont returnValue = null;
        if (gyoker.getNeve().equals(String.valueOf(s))) {
            return gyoker;
        }

        returnValue = searchRekursive(gyoker.getChilds(), s);

        return returnValue;
    }

    public Csomopont searchRekursive(ArrayList<Csomopont> aktual, char s) {
        Csomopont t = null;
        if (aktual != null) {
            for (Csomopont cs : aktual) {
                if (cs.getNeve().equals(String.valueOf(s))) {
                    return cs;
                } else {
                    t = searchRekursive(cs.getChilds(), s);
                    if (t != null) {
                        return t;
                    }
                }

            }
        }
        return t;
    }

    public void kiir(Csomopont actual) {

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (Csomopont a : actual.getChilds()) {
            sj.add(a.getNeve());
        }

        System.out.println(actual.getNeve() + ": " + sj.toString());

        for (Csomopont cs : actual.getChilds()) {
            kiir(cs);
        }
    }
}


public class Fa {

    private static Fa2 f;


    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine()) {
                String s = in.nextLine();

                f = new Fa2(s);

                String[] s2 = in.nextLine().split(" ");

                ArrayList<String> kimarad = new ArrayList<String>();
                for (String string : s2) {
                    String temp = f.add(string);
                    if (temp != null) {
                        kimarad.add(temp);
                    }
                }

                rec(kimarad);

                System.out.println(f.m);
            }
        }
    }

    public static void rec(ArrayList<String> s) {
        if (!s.isEmpty()) {
            ArrayList<String> kimarad = new ArrayList<String>();
            for (String string : s) {
                String temp = f.add(string);
                if (temp != null) {
                    kimarad.add(temp);
                }
            }

            if (!s.equals(kimarad)) {
                rec(kimarad);
            }
        }
    }
}
