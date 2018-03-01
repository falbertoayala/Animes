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
    private static int arraysize=3;
    private static Animes[] arranimes= new Animes[arraysize];
    private static Scanner lea=new Scanner(System.in);
    
    private static boolean checkarraysize(){
        for(int i=0; i<arraysize; i++){
            if (arranimes[i] == null){
            return true;
            }
        }
        return false;
    }
    
    private static int getArrayPosition(){
        for(int i=0; i<arraysize; i++){
            if (arranimes[i] == null){
            return i;
            }
        }
        return -1;
    }
    
    private static boolean isArrayEmpty(){
        int contador =0;
        for(int i=0; i<arraysize; i++){
            if (arranimes[i] == null){
                contador ++;
            
            }
        }
        return contador == arraysize;
    }
       
    
    private static boolean horarioanime(String horarioanime){
        
        CharSequence primero = horarioanime.subSequence(0, 2);
        CharSequence segundo = horarioanime.subSequence(3, 5);
        CharSequence tercero = horarioanime.subSequence(6, 8);
        CharSequence cuarto = horarioanime.subSequence(9, 11);
        int prim = Integer.parseInt(primero.toString());
        int segu = Integer.parseInt(segundo.toString());
        int ter = Integer.parseInt(tercero.toString());
        int cuar = Integer.parseInt(cuarto.toString());
        if (prim>ter){
        System.out.println("La hora inicial no puede ser mayor a la hora final");
        return false;
        }
        else{
            if (prim==ter && segu>=cuar){
            System.out.println("Los minutos de la hora inicial deben ser menores a los minutos de la hora final");
            return false;
            }
            else{
                if (prim>23 || segu>59 || prim<00 || segu<00 || ter>23 || cuar>59 || ter<00 || cuar<00){
                System.out.println("La hora solo acepta un formato de 23 horas y 59 minutos como maximo");
                return false;
                }
            }
        }
    return true;
    }
    
    public boolean existeAnime(String Anime){
        for(int i=0; i<arraysize;i++){
            if(arranimes[i].getNombreAnimes().equalsIgnoreCase(Anime)){
                return true;
               
            }
        }
        return false;
    }
    
    public static void opcionTelevisora(){
        
    }
    
    public static void opcionEstudios(){
        if (checkarraysize() == true){
            String nombreanime="";
            String horarioanime="";
            String estudio="";
            String horario="";
            boolean a;
            System.out.println("Menu de estudios");
            System.out.println("Ingrese nombre del anime");
            nombreanime=lea.nextLine();
            do {
            System.out.println("Ingrese horario del anime --- (<inicio-fin>) ||<16:45-20:45>");
                horarioanime=lea.nextLine();
                a=horarioanime.matches("\\d{2}:\\d{2}\\-\\d{2}:\\d{2}");
                if(a!=true){
                System.out.println("Formato incorrecto--- (<inicio-fin>) ||<16-20>");
                }
                else{
                    horarioanime(horarioanime);
                }
            }while(a!=true || horarioanime(horarioanime)!=true);
            System.out.println("Ingrese Estudio creadora del anime");
            estudio=lea.nextLine();
            Animes anime = new Animes(nombreanime,horarioanime,estudio);
            int posicion = getArrayPosition();
            arranimes[posicion] = anime;
        } else {
            System.out.println("Ya no hay horarios disponibles para su anime");
        }
    
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        
       
        
        do{
        try{
        System.out.println("Menu");
        System.out.println("opcion #1 --- Estudios");
        System.out.println("opcion#2 --- Televisora");
        System.out.println("opcion#3 --- Salir");
        opcion = lea.nextInt();
        lea.nextLine();
        
        switch(opcion){
                case 1 :
                    opcionEstudios();
                    break;
                    
                case 2 :
                    
                    break;
                    
                case 3 :
                    break;
                default:
                    System.out.println("Opcion no valida");
        }
        }catch(InputMismatchException ex){
            lea.nextLine();
            System.out.println("Ingreso un valor no numerico");
        }
        }while (opcion!=3);
    }
    
}
