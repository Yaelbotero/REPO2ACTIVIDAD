/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author ratap
 */
import java.util.Scanner;
public class Vista {
    private Scanner scanner;
    
    public Vista (){
    
    scanner = new Scanner(System.in);
    }
    // metodo para pedir los numeros
    
    public int pedirNumero(String orden){
    System.out.println("Ingresa el " + orden + " numero: ");
    return scanner.nextInt();
    }
    
    //metodo MostrarResultado
    public void MostrarResultado(int mayor){
        System.out.println("<-------------------->");
        System.out.println("<El numero mayor a tres numeros es: >"+ mayor);
        System.out.println("<-------------------->");
    }
}
