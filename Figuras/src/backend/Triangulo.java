package backend;

import java.util.Scanner;


public class Triangulo extends FiguraGeometrica {
    private double lado1 = 1.0,lado2 = 1.0,lado3 = 1.0; 
    
//contructor sin argumentos o vacio
public Triangulo(){
        super("Blanco", false);
        this.lado1=1.0;
        this.lado2=1.0;
        this.lado3=1.0;               
    }
    public static Triangulo crearTrianguloDefault(){
        
    return new Triangulo();} 
    
// Constructor que incluye color y relleno
    public Triangulo(String color, boolean relleno, double lado1, double lado2, double lado3) {
        super(color, relleno);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
                
    }
    
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    public static Triangulo crearTriangulo(Scanner scan){
       String color = "blanco";
       boolean relleno = false;

       char respuesta1;
       char respuesta2;
            
       
        System.out.print("¿Desea cambiar el color por defecto (blanco)? Si o No: ");
        respuesta1 = scan.next().toUpperCase().charAt(0);
        if (respuesta1 == 'S') {
            System.out.print("Ingrese el nuevo color del Triangulo: ");
            color = scan.next();
        } 
        System.out.print("¿Desea cambiar el relleno por defecto (false)? Si o No: ");
        respuesta2 = scan.next().toUpperCase().charAt(0);
        if (respuesta2 == 'S') {
            relleno = true; // Cambiar a true si el usuario lo desea
        }
        System.out.println("Ingrese el primer lado del Triangulo: ");
        double lado1=scan.nextDouble();
        System.out.println("Ingrese el segundo lado del Triangulo: ");
        double lado2 = scan.nextDouble();
        System.out.println("Ingrese el tercer lado del Triangulo: ");
        double lado3 = scan.nextDouble();
        //crea el objeto Triangulo y lo devuelve                       
        return new Triangulo(color, relleno, lado1, lado2, lado3);
        }
    

    //Metodos para los calculos correspondientes
    public double getArea(){
        double s = (lado1 + lado2 + lado3)/2;
        
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    public double getPerimeter(){
    return lado1+ lado2 + lado3;
    }
    
    @Override
    public String toString() {
        String Tri = " ";
        if (getArea() > 0){
        Tri = "Triangulo [Color:" + getColor() + ", relleno: " + isRelleno() + 
               ", Fecha de Creacion: " + getFechaCreacion() + 
               "\nLado 1 = " + lado1 + "\nLado 2 = "+lado2+"\nLado 3 = "+lado3+"\nÁrea = " + getArea() + " Unidades cuadradas" + 
               "\nPerimetro = " + getPerimeter() + "]";}           
        else{
        Tri = ("ERROR Triangulo no puede existir");}
        
        return Tri;
}   
}

