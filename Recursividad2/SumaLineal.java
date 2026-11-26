//TecNm ITESS-TICS
//Estructura y Organizacion de DATOS
//Periodo: Agosto - Diciembre
//Recursividad
//Programadora: Zamora Montero Ana Karen
// 24 DE NOVIEMBRE DEL 2026



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class SumaLineal {
    // FastReader class for efficient input
    int numero; //CANTIDAD DE ELEMENTOS QUE VA A CONTENER EL ARREGLO
    int [] data; //GUARDA LOS ELEMENTOS QUE CONTIENE EL ARREGLO
    int n; //CUANTOS ELEMENTOS SE VAN A SUMAR
    FastReader reader = new FastReader();

    static class FastReader {
        // BufferedReader to read input
        BufferedReader b;
        // StringTokenizer to tokenize input
        StringTokenizer s; 

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() { 
                return Integer.parseInt(next()); 
        }

        // Method to read Char
        char nextChar() {
            return next().charAt(0);
        }

        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }

        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return str;
        }
    }

    public static int linearSum(int[] data, int n){
        if (n == 0){
            return 0;
        }else{
            return linearSum(data, n - 1) + data [n - 1];
        }
    }

    public void leerDatos() {
        numero = reader.nextInt();
        data = new int[numero];
        for (int i = 0; i < numero; i++){
            data[i] = reader.nextInt();
        }
        n = reader.nextInt();
    }

    public void resuelve() {
        int resultado = linearSum(data, n);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        SumaLineal id  = new SumaLineal();

        id.leerDatos();
        id.resuelve();
    }   
}
