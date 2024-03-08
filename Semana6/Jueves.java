package jueves;

import java.util.Scanner;
import java.util.ArrayList;

public class Jueves {

    /* Colecciones de listas */
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<String>();
        int index = 0;
        
        System.out.print("Cuantos nombres quieres agregar? Ingresa un numero:");
        int num = scanner.nextInt();
        
        do{
            System.out.println("Ingresa un nombre para el indice "+index);
            String nombre = scanner.next();
            
            nombres.add(nombre);
            index++;
        }
        while(index < num);
        
        scanner.close();
        
        for(int i=0; i < nombres.size(); i++){
            System.out.println("Nombres en el indice "+i+": "+nombres.get(i));
        }
        
        System.out.println("Ahora vamos a eliminar al segundo dato");
        nombres.remove(1);
        
        for(int i=0; i < nombres.size(); i++){
            System.out.println("Nombres en el indice "+i+": "+nombres.get(i));
        }
        
        System.out.println("Ahora vamos a buscar a santiago y lo vamos a eliminar");
        nombres.remove("Santiago");
        
        for(int i=0; i < nombres.size(); i++){
            System.out.println("Nombres en el indice "+i+": "+nombres.get(i));
        }
        
        System.out.println("Ahora vamos reemplazar el primer valor por el nombre DANIEL");
        nombres.set(0, "DANIEL");
        
        for(int i=0; i < nombres.size(); i++){
            System.out.println("Nombres en el indice "+i+": "+nombres.get(i));
        }
        
        System.out.println("Ahora vamos a agregar varios nombres mas, como Juan, Pedro, Pablo y vamos a verificar en que indice quedo Pedro");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Pablo");
        
        for(int i=0; i < nombres.size(); i++){
            System.out.println("Nombres en el indice "+i+": "+nombres.get(i));
        }
        
        System.out.println("Pedro quedo en el indice: "+nombres.indexOf("Pedro"));

        /*FOREACH*/
        /*for(String my_name : nombres){
            System.out.println(my_name);
        }*/
        
        
    }
}
