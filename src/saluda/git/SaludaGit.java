/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saluda.git;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class SaludaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Introduzca su nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca la edad:");
        edad = sc.nextInt();
        System.out.println("Hola " + nombre + " tienes " + edad + " años");
    }
    
}
