package juevessemana7;

public class JuevesSemana7 {
    //POO
    
    /*
    ¿Que es un objeto?
        Una entidad del mundo real
    
    Un objeto tiene: 
        Estado -> que cambia en el tiempo, 
        Comportamiento -> Que tiene metodos o acciones
        Identidad -> Son unicos
    
    ¿Que es una clase?
        Descripcion de un grupo de objetos
        Por medio de abstraccion se obtienen las caracteristicas del objeto
    
    Modificadores de acceso:
        Permiten definir el nivel de acceso de los atributos de la clase
        Existen: Publicos, Privados y Protected
    
    !Pilares de la orientacion a objetos¡
    Abstraccion: Proceso para pasar un objeto del mundo real a una clase de programacion
        Relaciones: Como interactuan las clases, por Asociacion y Agregacion
        Herencia: Relacion entre clases para compartir atributos publicos o protected
        Encapsulamiento: Definir que es privado y publico, la logica esta dentro de la clase
        sirve como un punto de control/validacion
    !Pilares de la orientacion a objetos¡
    
    Interfaces
        En resumen son contratos, se usan para definir como se va a definir la informacion que se va a usar 
    (no lleva nada de logica, es como una plantilla), no existen limites de interfaces para una clase
    
    Polimorfismo
        Capacidad de modificar los metodos
    */
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora(12, 15);
        
        int resultado = c1.suma();        
        int resultado2 = c1.resta();

        System.out.println(resultado);        
        System.out.println(resultado2);

    }
}
