/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.edad.apache;

/**
 *
 * @author Jarvis
 */
public class EDADAPACHE {

    public   static   void  main(String[] args)  throws  Exception {
        //imprimir el titulo del programa
        System.out.println("CALCULAR EDAD A PARTIR DE CURP");
        //menu de opciones para el usuario y guardar la opcion en una variable de tipo entero llamada opcion 1 es agregar curp y 2 es salir
        System.out.println("1. Agregar CURP");
        System.out.println("2. Salir");
        int opcion = 1;
            while (opcion != 2) {
            //try catch para evitar errores
            try {
            //preguntarle al usuario que opcion desea
            System.out.println("Ingresa una opcion");
            //guardar la opcion en una variable de tipo entero llamada opcion
            opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case  1 -> {
                        //traer la variable curp de la clase CURP
                        CURP curp =  new  CURP();
                        //imprimir la funcion calcularEdad de la clase CURP
                        System.out.println("TU EDAD ES: " + curp.calcularEdad() + " AÑOS");
                        //imprimir la fecha de nacimiento de la persona a partir de su CURP en formato dd/mm/aaaa
                        System.out.println("FECHA DE NACIMIENTO: " + curp.diaNac + "/" + curp.mesNac + "/" + curp.anioNac);
                    }
                    case  2 -> System.out.println("Salir");
                    default -> System.out.println("Ingresa una opcion valida");
                }
                //si el usuario ingresa 1, imprimir el mensaje de agregar curp
                //si el usuario ingresa 2, imprimir el mensaje de salir
                //si el usuario ingresa un valor que no sea 1 o 2, imprimir el mensaje de error
                            }
            catch  (NumberFormatException e) {
                //si el usuario ingresa un valor que no sea un numero, imprimir el mensaje de error
                System.out.println("Ingresa un numero");
            }
        }  
        
    }
}
