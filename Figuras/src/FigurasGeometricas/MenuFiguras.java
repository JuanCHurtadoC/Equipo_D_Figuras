package FigurasGeometricas;

import backend.Circulo;
import java.util.Scanner;
import backend.Rectangulo;
import backend.Triangulo;

public class MenuFiguras {
    public static void main(String[] args) {
        Menu();
    }
    private static void Menu(){
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        char respuesta = 'S'; 
        
        while(opcion !=4){
            System.out.println("Menu de figuras geometricas");
            System.out.println("1. Crear circulo");
            System.out.println("2. Crear Triangulo");
            System.out.println("3. Crear rectangulo");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    Circulo circulo = Circulo.crearCirculo(scanner);
                    
                    System.out.println("Circulo creado: " + circulo.toString());
                    break;
                case 2:
                    System.out.println("¿Desea crear un Triangulo por default? Si o No: ");
                    respuesta = scanner.next().toUpperCase().charAt(0);
                    if (respuesta == 'S'){
                    Triangulo triangulo = Triangulo.crearTrianguloDefault();
                    System.out.println("Triangulo creado: " + triangulo.toString());
                    }
                    else{
                    Triangulo triangulo = Triangulo.crearTriangulo(scanner);
                    System.out.println("Triangulo creado: " + triangulo.toString());
                    }
                    
                    
                    break;
                case 3:
                    Rectangulo rectangulo = Rectangulo.crearRectangulo(scanner);
                    
                    System.out.println("Rectangulo creado: " + rectangulo.toString());
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el aplicativo");
                    break;
                default:
                System.out.println("El numero ingresado no es valido");
                    
            }
        }
    }
}
    