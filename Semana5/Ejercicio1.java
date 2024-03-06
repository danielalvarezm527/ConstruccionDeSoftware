package semana5;
import java.util.Scanner;

public class Semana5 {

    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numero;
        
        int indice = 0;
        int indice_par = 0;        
        int indice_impar = 0;
        
        System.out.println("Ingresa un tamaño para el vector");
        int tamaño_vector = scanner.nextInt();

        int numeros_pares[] = new int[tamaño_vector];        
        int numeros_impares[] = new int[tamaño_vector];

        do{
            System.out.println("Ingresa un numero del 1 al 10");
            numero = scanner.nextInt();
        
            if(numero < 1 || numero > 10){
                System.out.println("Numero no valido");
                indice--;
            }
            
            if(numero%2 == 0){
                numeros_pares[indice_par] = numero;
                indice_par++;
            }
            else{
                numeros_impares[indice_impar] = numero;
                indice_impar++;
            }
            
            indice++;
        }
        while(indice < tamaño_vector);
        
        for(int i = 0; i < numeros_pares.length; i++){
            System.out.println("Numero par en la posicion "+i+": "+numeros_pares[i]);
        }
        
        for(int f = 0; f < numeros_pares.length; f++){
            System.out.println("Numero impar en la posicion "+f+": "+numeros_impares[f]);
        }
    }
}
