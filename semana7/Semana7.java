package semana7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Semana7 {

    public static Random rand = new Random();
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Ingresa el tamaño del vector:");
        int num = scanner.nextInt();
        printList(setUnique(createVector(num)));
    }
    
    public static int[] createVector(int num){
        int[] numeros = new int[num];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(10);
        }
        
        return numeros;
    }
    
    public static List<Integer> setUnique(int[] vector){
        List<Integer> unique_numbers = new ArrayList<Integer>();
        
        for(int i = 0; i < vector.length; i++){
            boolean is_unique = true;
            for(int t = 0; t < i; t++){
                if(vector[i] == vector[t]){
                    is_unique = false;
                    break;
                }
            }
            
            if(is_unique){
                unique_numbers.add(vector[i]);
            }
        }
        
        return unique_numbers;
    }
    
    public static void printVector(int[] vector){
        for(int i = 0; i < vector.length; i++){
            System.out.print("Index "+i+" ["+vector[i]+"] - ");
        }
    }
    
    public static void printList(List<Integer> list){
        for(int i : list){
            System.out.print("["+i+"]");
        }
    }
}
