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
     *
     */
    //Codigo Funcion arreglo
    private static int arraySize = 3;
    private static Animes arregloAnime[] = new Animes[arraySize];
    private static Scanner lea = new Scanner(System.in);

    //Codigo Funcion Revisa si el arreglo esta Vacio
    private static boolean checkArraySize() {
        for (int i = 0; i < arraySize; i++) {
            if (arregloAnime[i] == null) {
                return true;

            }

        }
        return false;

    }
    //Codigo Funcion Obtiene Posicion del espacion que esta vacio
    private static int getArrayPosition() {

        for (int i = 0; i < arraySize; i++) {
            if (arregloAnime[i] == null) {
                return i;
            }
        }
        return -1;

    }

    public static void opcionEstudios() {

        if (checkArraySize() == true) {

            String nombreanime = "";
            String horarioanime = "";
            String estudioanime = "";

            System.out.println("Menu de Estudios");
            nombreanime = lea.nextLine();
            System.out.println("Ingrese nombre del Anime");
            nombreanime = lea.nextLine();

            System.out.println("Ingrese horario del Anime ---<Inicio-fin> ||<16-20>");
            horarioanime = lea.nextLine();

            System.out.println("Ingrese Estudio creadora del Anime");
            estudioanime = lea.nextLine();
            
            Animes anime = new Animes(nombreanime, horarioanime, estudioanime);
            int posicion = getArrayPosition();
            arregloAnime[posicion] = anime;

        } else {
            System.out.println("No hay horario disponible para su anime");

        }

    }

    public static void main(String[] args) {

        int opcion = 0;

        do {

            try {
                System.out.println("Menu");
                System.out.println("Opcion #1 ----Estudios");
                System.out.println("Opcion #2 ----Televisora");
                System.out.println("Opcion #3 ----Salir");
                opcion = lea.nextInt();

                switch (opcion) {

                    case 1:
                        opcionEstudios();

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    default:
                        System.out.println("Opcion no valida");

                }

            } catch (Exception ex) {
                //catch (InputMismatchException ex){
                lea.nextLine();
                System.out.println("Ingreso un valor No valido");

            }
        } while (opcion != 3);

    }

// TODO code application logic here
}
