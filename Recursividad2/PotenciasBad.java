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



public class PotenciasBad {
    // FastReader class for efficient input
    double base;
    int exponente;
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
    public static double powerBad(double x, int n){
        if (n == 0){
            return 1;
        }else{
            return x * powerBad(x, n - 1);
        }
    }

    public void leerDatos() {
        base = reader.nextDouble();
        exponente = reader.nextInt();
    }

    public void resuelve() {
        long inicio = System.nanoTime();
        double resultado = powerBad(base, exponente);
        long fin = System.nanoTime();

        double tiempoMs = (fin - inicio) / 1_000_000.0; //truco para que de decimales :p

        System.out.println("Base: " + base + " | Exponente N:" + exponente );
        System.out.println("Resultado: " + resultado);
        System.out.printf("Tiempo bad (ms): %.4f%n", tiempoMs);
    }

    public static void main(String[] args) {
        PotenciasBad id = new PotenciasBad();
        id.leerDatos();
        id.resuelve();
    }   
}
