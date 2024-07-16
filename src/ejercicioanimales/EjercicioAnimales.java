/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioanimales;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjercicioAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        animal animal1 = new animal();
        animal animal2 = new animal();
        animal animal3 = new animal();
        do {
            //1. se crea el menú
            System.out.println("Ingrese 1 para ingresar la información");
            System.out.println("Ingrese 2 para mostrar la información");
            System.out.println("Ingrese 3 para salir");
            //2. se crea el objeto Scanner
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();
            //se necesita una estructura que me permita hacer una sección 
            //si se cumple un valor
            /*if(opcion==1){
            System.out.println("Opción 1");
        }else if
             */
            //se reinicia el Scanner
            scan = new Scanner(System.in);
            switch (opcion) {
                case 1 -> {
                    System.out.println("Opción Ingresar los valores");
                    System.out.println("Información del animal 1");
                    System.out.print("Ingrese el nombre el primer animal: ");
                    animal1.nombre=scan.nextLine();
                    boolean esIncorrecto=true;
                    do{
                        String entrada;
                        try{//intente ejecutar la función
                            System.out.print("Ingrese la edad del animal: ");
                            entrada=scan.nextLine();
                           animal1.edad = (short) Integer.parseInt(entrada);

                            esIncorrecto=false;
                        }catch(NumberFormatException error){
                         //catch atrape el error
                            System.out.println("No ingresó un número");
                        }
                        //ciclo loop
                        //while=mientras se cumple la condición
                        //mientras la condición tenga valor verdadero true
                    }while(esIncorrecto);
                
                    System.out.print("Ingrese el tipo de animal: ");
                    animal1.tipo=scan.nextLine();
                    System.out.print("Ingrese el habitad del animal: ");
                    animal1.habitat=scan.nextLine();
                    System.out.print("Ingrese el tipo de alimento: ");
                    animal1.alimento=scan.nextLine();
                    //se completa los campos de todos los animales
                }
                case 2 -> {
                    System.out.println("Opción Mostrar los valores");
                    System.out.println("");
                    System.out.println("Información del animal 1");
                    System.out.println("Nombre: "+animal1.nombre);
                    System.out.println("Edad: "+animal1.edad); 
                    System.out.println("Tipo: "+animal1.tipo);
                    System.out.println("Habitad :"+animal1.habitat);
                    System.out.println("Almiento:"+animal1.alimento);
                    //se completa los campos de todos los animales
                }
                case 3 -> {
                    System.out.println("Hasta luego");
                }
                default ->
                    System.out.println("Error opción no valida, vuelva intentarlo");
            }
            /*
            while=mientras
            se repite mientras se cumple la condición
            == es comparación
            a==b indica a debe ser estrictamente igual b
            a!=b indica que debe ser diferente a b
             */
        } while (opcion != 3);
    }

}
