/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_2_clases_java;

/**
 *
 * @author Doan Escobar
 */
public class EVA1_2_CLASES_JAVA {

    public static void main(String[] args) {
     //*clase es la receta
     //* objeto es el ´platillo
     /*INSTALACION
     1 DECLARAR EL IDENTIFUCADOR PARA EL OBJETO
     
     
     
     
     */
     /*
    // ESTA SECCION ES PORQUE INICIAMOS LOS ATRIBUTOS CON MODIFICADOR DEFAULT
    Persona  perso1 = new Persona();
        System.out.println("perso1");
       perso1.nombre="cristian";
       perso1.apellido="escobar";
       perso1.edad=23;
       perso1.estadocivil=true; // true es soltero
       
       System.out.println(perso1.nombre);*/
     Persona perso1=new Persona();
             perso1.setNombre("Cristian Doan ");
        System.out.println(perso1.getNombre());
          perso1.setApellido("Trucios Escobar");
        System.out.println(perso1.getApellido());
         perso1.setEdad(22);
        System.out.println(perso1.getEdad());
         perso1.setEstadoCivil(true);
        System.out.println(perso1.getEstadoCivil());
        System.out.println("Estado civil: soltero");
        
                Persona perso2=new Persona();
                perso2.setNombre("juan carlos");
                 System.out.println(perso2.getNombre());
          perso2.setApellido("hernandez medina");
        System.out.println(perso2.getApellido());
         perso2.setEdad(34);
        System.out.println(perso2.getEdad());
         perso2.setEstadoCivil(true);
        System.out.println(perso2.getEstadoCivil());
        System.out.println("Estado civil: casado");
                
                
                
        
          
        
       
        
       
       
       
        
    }
}
