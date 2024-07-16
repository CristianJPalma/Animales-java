/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioanimales;

import java.util.Scanner;

/**
 *
 * @author CristianJPalma
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
            scan = new Scanner(System.in);
            switch (opcion) {
                case 1 -> {
                    System.out.println("Opción Ingresar los valores");
                    System.out.println("Información del animal 1");
                    System.out.print("Ingrese el nombre del primer animal: ");
                    animal1.nombre= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el nombre del primer animal: ");
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
                    }while(esIncorrecto);
                
                    System.out.print("Ingrese el tipo de animal: ");
                    animal1.tipo= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el tipo de animal: ");
                    System.out.print("Ingrese el habitat del animal: ");
                    animal1.habitat= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el habitat del animal: ");
                    System.out.print("Ingrese el tipo de alimento: ");
                    animal1.alimento= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el tipo de alimento: ");
                    System.out.println("");
                    
                    System.out.println("Información del animal 2");
                    System.out.print("Ingrese el nombre del segundo animal: ");
                    animal2.nombre= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el nombre del segundo animal: ");
                    boolean esIncorrecto2=true;
                    do{
                        String entrada;
                        try{//intente ejecutar la función
                            System.out.print("Ingrese la edad del animal: ");
                            entrada=scan.nextLine();
                           animal2.edad = (short) Integer.parseInt(entrada);

                            esIncorrecto2=false;
                        }catch(NumberFormatException error){
                         //catch atrape el error
                            System.out.println("No ingresó un número");
                        }
                    }while(esIncorrecto2);
                
                    System.out.print("Ingrese el tipo de animal: ");
                    animal2.tipo = leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el tipo de animal: ");
                    System.out.print("Ingrese el habitat del animal: ");
                    animal2.habitat= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el habitat del animal: ");
                    System.out.print("Ingrese el tipo de alimento: ");
                    animal2.alimento = leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el tipo de alimento: ");
                    System.out.println("");
                    
                    System.out.println("Información del animal 3");
                    System.out.print("Ingrese el nombre del tercer animal: ");
                    animal3.nombre= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el nombre del tercer animal: ");
                    boolean esIncorrecto3=true;
                    do{
                        String entrada;
                        try{//intente ejecutar la función
                            System.out.print("Ingrese la edad del animal: ");
                            entrada=scan.nextLine();
                           animal3.edad = (short) Integer.parseInt(entrada);

                            esIncorrecto3=false;
                        }catch(NumberFormatException error){
                         //catch atrape el error
                            System.out.println("No ingresó un número");
                        }
                    }while(esIncorrecto3);
                
                    System.out.print("Ingrese el tipo de animal: ");
                    animal3.tipo= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el tipo de animal: ");
                    System.out.print("Ingrese el habitat del animal: ");
                    animal3.habitat= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el habitat del animal: ");
                    System.out.print("Ingrese el tipo de alimento: ");
                    animal3.alimento= leerEntrada(scan, "Este campo no puede estar vacío. \nIngrese el tipo de alimento: ");
                    System.out.println("");
                }
                
                
                case 2 -> {
                    //se completa los campos de todos los animales
                    System.out.println("Opción Mostrar los valores");
                    System.out.println("");
                    System.out.println("Información del animal 1");
                    System.out.println("Nombre: "+animal1.nombre);
                    System.out.println("Edad: "+animal1.edad); 
                    System.out.println("Tipo: "+animal1.tipo);
                    System.out.println("Habitat: "+animal1.habitat);
                    System.out.println("Almiento: "+animal1.alimento);
                    
                    System.out.println("");
                    System.out.println("Información del animal 2");
                    System.out.println("Nombre: "+animal2.nombre);
                    System.out.println("Edad: "+animal2.edad); 
                    System.out.println("Tipo: "+animal2.tipo);
                    System.out.println("Habitat: "+animal2.habitat);
                    System.out.println("Almiento: "+animal2.alimento);
                    System.out.println("");
                    
                    System.out.println("Información del animal 3");
                    System.out.println("Nombre: "+animal3.nombre);
                    System.out.println("Edad: "+animal3.edad); 
                    System.out.println("Tipo: "+animal3.tipo);
                    System.out.println("Habitat: "+animal3.habitat);
                    System.out.println("Almiento: "+animal3.alimento);
                    System.out.println("");
                }
                case 3 -> {
                    System.out.println("Hasta luego");
                }
                default ->
                    System.out.println("Error opción no valida, vuelva intentarlo");
            }

        } while (opcion != 3);
    }
    // Validacion para espacios en blanco
    private static String leerEntrada(Scanner scan, String mensajeError) {
        String entrada = "";
        while (entrada.trim().isEmpty()) {
            entrada = scan.nextLine();
            if (entrada.trim().isEmpty()) {
                System.out.print(mensajeError);
            }
        }
        return entrada;
    }

}
