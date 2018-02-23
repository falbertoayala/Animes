/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Anime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        Scanner lea = new Scanner(System.in);
        String nombreanime="";
        String horarioanime="";
        String estudioanime="";
        
            do{
                
                try{
                System.out.println("Menu");
                System.out.println("Opcion #1 ----Estudios");
                System.out.println("Opcion #2 ----Televisora");
                System.out.println("Opcion #3 ----Salir");
                opcion = lea.nextInt();
                
                switch (opcion){
                
                    case 1:
                         System.out.println("Menu de Estudios");
                         System.out.println("Ingrese nombre del Anime");
                         nombreanime = lea.nextLine();
                         
                         System.out.println("Ingrese horario del Anime ---<Inicio-fin> ||<16-20>");
                         horarioanime = lea.nextLine();
                         
                         System.out.println("Ingrese Estudio creadora del Anime");
                         estudioanime = lea.nextLine();
                         
                    break;
                    
                    case 2:
                        
                    break;
                    
                    case 3:
                        
                    break;
                    
                    default:
                     System.out.println("Opcion no valida");
                    
                }
                
                } catch (Exception ex){
                    //catch (InputMismatchException ex){
                lea.nextLine();
                System.out.println("Ingreso un valor No valido");
                
                }
            }while(opcion !=3);
                
        }
        
       
// TODO code application logic here
    }
    

