import java.lang.Character;
import java.lang.String;
import java.util.Scanner;
import java.util.Stack;

class Zarojel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()) {
            String asd = in.nextLine();

            System.out.println(isCorrect(asd) ? "HELYES" : "HELYTELEN");
        }
        in.close();
    }

    public static boolean isCorrect(String a) {
        Stack<Character> ch = new Stack<Character>();

        for (int i = 0; i < a.length(); i++) {
            Character c = a.charAt(i);

            if (c == '(' || c == '{' || c == '[' ) {
                ch.push(c);
            }

            if (c == '}' || c == ')' || c == ']' ) {
                if(ch.isEmpty()) {
                    return false;
                }

                Character s = ch.pop();
                if ( !(c == '}' && s == '{' ||c == ']' && s == '[' ||c == ')' && s == '(' )) {
                    return false;
                }
            }
        }

        return ch.isEmpty();
    }
}

