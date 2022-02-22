/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinaria;

import java.util.Scanner;

/**
 *
 * @author gilbe
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota animal = new Mascota("Pedro", "Canino", 7, "22/02/2022", " 'Ta malito");
        Dueno persona = new Dueno("Alberto", "Adolfo Lopez Mateos", "7712343456", animal);
        
        Scanner leer = new Scanner(System.in);
        int caso;
        do{
            System.out.println("|-------------------------------------------|");
            System.out.println(" MENU PRINCIPAL");            
            System.out.println("+-------------------------------------------+");
            System.out.println(" Elije una opcion");
            System.out.println("+-------------------------------------------+");
            System.out.println("  (1) Datos de dueno");
            System.out.println("  (2) Datos de mascota");
            System.out.println("  (3) Datos de diagnostico");
            System.out.println("  (4) Cambiar datos de la mascota");
            System.out.println("  (5) Cambiar datos del dueno");
            System.out.println("  (6) Cambiar el diagnostico");
            System.out.println("  (7) SALIR");
            System.out.println("|-------------------------------------------|");
            
            caso = leer.nextInt();
            
            switch(caso){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
            }
            
        }while(caso != 7);
        
    }
    
}
