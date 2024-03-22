package juevessemana7;

public class Calculadora {
    private int a;
    private int b;
    
    public Calculadora(int n1, int n2){
        this.a = n1;
        this.b = n2;
    }
    
    public int suma(){
        return this.a + this.b;
    }
    
    public int resta(){
        return this.a - this.b;
    }
}
