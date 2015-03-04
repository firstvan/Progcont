
import java.lang.StringBuffer;
import java.util.Scanner;

class Matrix5 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            while (in.hasNextLine()) {
                int n, m;
                n = in.nextInt();
                m = in.nextInt();
                in.nextLine();
                int[][] array = new int[n][m];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        array[i][j] = in.nextInt();
                    }
                }

                in.nextLine();

                int[][] array2 = new int[m][n];

                array2 = transponate(array, n, m);

                int[][] array3 = new int[n][n];

                array3 = szoroz(n, m, array, array2);

                StringBuffer sb = new StringBuffer();

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        sb.append(array3[i][j] + " ");
                    }
                }

                System.out.println(sb.toString().trim());
            }
        }
    }

    public static int[][] transponate(int[][] a, int n, int m) {

        int[][] temp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = a[j][i];
            }
        }


        return temp;
    }

    public static int[][] szoroz(int n, int m, int[][] a1, int[][] a2) {
        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    temp[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        return temp;
    }
}


