package ejercicio;

import java.util.Scanner;

public class Ejercicio {

    public static String operacion = "No existen operaciones\n";
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int valor_menu;
        do{
            System.out.print("Menu.\n1.Realizar operacion\n2.Mostrar ultima operacion\n3.Salir.\nElige una opcion:");
            valor_menu = scanner.nextInt();
            
            switch(valor_menu){
                case 1:
                    operacion();
                    break;
                case 2:
                    mostrarUltimaOperacion();
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.print("Opcion no valida!\n");
                    break;
            }
        }
        while(valor_menu != 3);
        
        scanner.close();
    }
    
    public static void operacion(){
        
        System.out.print("Ingresa el primer numero:");
        float n1 = scanner.nextFloat();
        
        System.out.print("Ingresa el operador:");
        String operador = scanner.next();
        
        System.out.print("Ingresa el segundo numero:");
        float n2 = scanner.nextFloat();
                
        switch(operador){
            case "+":
                System.out.print("El resultado de la suma es: "+(n1+n2)+"\n");
                operacion = n1+"+"+n2+"="+(n1+n2);
                break;
                
            case "-":
                System.out.print("El resultado de la resta es: "+(n1-n2)+"\n");
                operacion = n1+"-"+n2+"="+(n1-n2);
                break;
                
            default:
                System.out.print("Operador no valido\n");
                operacion();
                break;
        }
    }
    
    public static void mostrarUltimaOperacion(){
        System.out.print("La ultima operacion fue: "+operacion+"\n");
    }
}
