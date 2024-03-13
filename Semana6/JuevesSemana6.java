package juevessemana6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class JuevesSemana6 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        /*// Vectores: necesitan un tamaño, no pueden cambiar de tamaño, se iteran por indices
        int[] numeros = new int[5];
        numeros[0] = 13;
        numeros[1] = 1;
        numeros[2] = 65;
        numeros[3] = 06;
        numeros[4] = 42;

        for(int numero : numeros){
            System.out.println(numero);
        }
        
        // Listas: no necesitan un tamaño, pueden cambiar de tamaño
        ArrayList<String> nombres = new ArrayList<String>();
                
        nombres.add("Daniel");        
        nombres.add("Santiago");        
        nombres.add("Laura");
        nombres.add("Valeria");
        
        for(String nombre : nombres){
            System.out.println(nombre);
        }*/
        
        //Matrices
        int[][] num = {
            {1,2,4,6},
            {2,3,5,6},
            {1,2,4,6},
            {0,1,2,3},
        };
        
        //Imprimir normal
        /*for(int filas = 0; filas < 4; filas++){
            for(int columnas = 0; columnas < 4; columnas++){
                System.out.print(num[filas][columnas]);
                if(columnas == 3){
                    System.out.println("");
                }
            }
        }*/
        
        //Imprimir en diagonal
        /*int columnas = -1;
        for(int filas = 0; filas < 4; filas++){
            columnas ++;
            System.out.print(num[filas][columnas]);
            if(columnas == 3){
                System.out.println("");
                columnas = -1;
            }
        }*/
        
        //Imprimir fila 2 y 4
        /*for(int filas = 0; filas < 4; filas++){
            for(int columnas = 0; columnas < 4; columnas++){
                if(filas == 1 || filas == 3)
                    System.out.print(num[filas][columnas]);
                
                if(columnas == 3)
                    System.out.println("");
            }
        }*/
        
        //Imprimir la diagonal principal
        /*int columnas = -1;
        for(int filas = 0; filas < 4; filas++){
            columnas ++;
            System.out.print(num[filas][columnas]);
            if(columnas == 3){
                System.out.println("");
                columnas = -1;
            }
        }*/
        
        //Imprimir la diagonal secundaria
        /*int columnas = num.length;
        for(int filas = 0; filas < num.length; filas++){
            columnas --;
            System.out.print(num[filas][columnas]);
            if(columnas == 0){
                System.out.println("");
                columnas = -1;
            }
        }*/
    }
}
