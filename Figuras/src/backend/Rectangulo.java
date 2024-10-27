package backend;
import java.util.Scanner;
public class Rectangulo extends FiguraGeometrica{
    private double base, altura;
    //Constructor que incluye color y relleno
    public Rectangulo(String color, boolean relleno, double base, double altura){
        super(color,relleno);
        this.base=base;
        this.altura=altura;
    }
      public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }  
    //Método para ´pedir datos al usuario y crear el Rectángulo
    public static Rectangulo crearRectangulo(Scanner sc){
       String color = "blanco";
       boolean relleno = false;
       char respuesta1;
       char respuesta2;
       
       System.out.print("¿Desea cambiar el color por defecto (blanco)? Si o No: ");
        respuesta1 = sc.next().toUpperCase().charAt(0);
        if (respuesta1 == 'S') {
            System.out.print("Ingrese el nuevo color del Rectangulo: ");
            color = sc.next();
        } 
        System.out.print("¿Desea cambiar el relleno por defecto (false)? Si o No: ");
        respuesta2 = sc.next().toUpperCase().charAt(0);
        if (respuesta2 == 'S') {
            relleno = true; // Cambiar a true si el usuario lo desea
        }                 
        System.out.println("Ingrese la base del Rectangulo: ");
        double base=sc.nextDouble();
        System.out.println("Ingrese la altura del Rectangulo: ");
        double altura = sc.nextDouble();
        //Crea el objeto Rectángulo y lo devuelve
        
        return new Rectangulo(color, relleno, base, altura);
            
    }
    
    //Método para calcular el área
    public double calcularArea(){
        return base*altura;  
    }
    public double calcularPerimetro(){
        return 2*(base+altura);
    }
    
      @Override
    public String toString() {
        return "Rectangulo [Color:" + getColor() + ", relleno: " + isRelleno() + 
               ", Fecha de Creacion: " + getFechaCreacion() + 
               "\nBase = " + base + "\nAltura = "+altura+"\nÁrea = "  + calcularArea() + " Unidades cuadradas" +
               "\nPerimetro = " + calcularPerimetro() + "]";
    }
}