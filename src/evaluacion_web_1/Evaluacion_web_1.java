/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_web_1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Evaluacion_web_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1.(valor 1.0) En una finca entre gallinas y conejos, se cuentan
        50 cabezas y 140 patas ¿Cuántas gallinas y conejos hay en la
        granja?, recuerde
        x=(CE-BF)/(AE-BD)
        Y=(AF-CD)/(AE-BD)*/
        
        //Definimos variables
        /*Scanner objleer = new Scanner(System.in);
        int conejos, gallinas, numPatas, numCabezas, resultado, cabezas_y, cab_pat;*/
                       
        
        /*System.out.print("\n\nIngrese la cantidad de Patas: ");
        numPatas=objleer.nextInt();
        System.out.print("Ingre la cantidad de Cabezas: ");
        numCabezas=objleer.nextInt();
        
        cabezas_y= numCabezas*-2;
        cab_pat=cabezas_y+ numPatas;
       
        conejos=cab_pat/2;
        gallinas= numCabezas-conejos;
        
        System.out.println("\n...RESULTADO...");
        System.out.println("la cantidad de conejos son: "+conejos);
        System.out.println("La cantidad de gallinas son: "+gallinas);*/
        
        /* **************************************************************** 
         2.(valor 1.0) Pedir 20 números y contar cuantos de los
            ingresados fueron negativos
         */
        /*Scanner objleer = new Scanner(System.in);
        int numeros[] = new int[5], negativos=0;
        
        for(int i=0; i<= numeros.length -1; i++){
            
        System.out.println("Digite un número entero: ");
        numeros[i] = objleer.nextInt();
        }
        
        for(int i=0; i<= numeros.length -1; i++){
            
            if(numeros[i] < 0) {
                negativos++;
            }
        }
        System.out.println("La cantidad de positivos es de: "+ negativos);*/
          
        
        
        /* **************************************************************** 
         3.(valor 1.0) Crear una matriz de enteros (tamaño a elección
            del usuario) y obtener en un nuevo arreglo unidimensional la
            suma de cada columna.
         */
        
       /* Scanner objleer = new Scanner(System.in);
        int matriz [][], nFilas, nCol, sumaCol, sumaColumnas[];
        
        System.out.println("Digite el número de filas: ");
        nFilas = objleer.nextInt();
        
        System.out.println("Digite el número de columnas: ");
        nCol = objleer.nextInt();
        
        matriz = new int [nFilas][nCol];
        
        System.out.println("Digite la matriz");
        
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nCol; j++){
                System.out.println("Matriz["+i+"]["+j+"] ");
                matriz[i][j] = objleer.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nCol; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Sumar columnas
         for (int j=0; j<nCol; j++){
             sumaCol= 0;
                for (int i=0; i<nCol; i++){
                sumaCol += matriz[i][j];  
                
                 
         } 
                System.out.println("\n la suma de la columna["+j+"] es: "+ sumaCol);
                System.out.println("");
         }      */
        
        
        
        /* **************************************************************** 
         3.4.(valor 2.0) Reinaldo Rueda técnico de la selección Colombia
de futbol, lo contrata para elaborar un programa en JAVA que
cumpla las siguientes condiciones:
Codificar Menú de 5 opciones
- op1 Agregar un jugador (solo nombre) a un arreglo
- op2 Buscar un jugador por nombre y si no existe
notificarlo
- op3 Editar un jugador por nombre y si no existe
notificarlo
- op4 Mostrar toda la convocatoria de jugadores
- op5 Salir
         */
        
        Scanner objleer = new Scanner(System.in);
        int opcion;
        
        System.out.println("Bienvenido Reinaldo Rueda\n");
               
               System.out.println("1: Agregar un jugador");
               System.out.println("2: Buscar un jugador por nombre");
               System.out.println("3: Editar un jugador por nombre");
               System.out.println("4: Mostrar toda la convocatoria de jugadores");
               System.out.println("5: Salir");
               
               System.out.print("Digite una opcion: ");
               opcion= objleer.nextInt();
               
               switch(opcion){
                   
                   case 1: 
                       break;
                       
                   case 2:
                       
                       System.out.print("\n Digite un numero entero: ");
                       int numero=objleer.nextInt();
                       
                      
                       break;
                    
                   case 3:
                       
                       System.out.print("\n Digite un numero entero: ");
                       int numero2=objleer.nextInt();
                      
                       
                       
                    break;
                    
                   case 4:
                       System.out.print("\n Digite un numero entero: ");
                       int numero3=objleer.nextInt();
                       
                       
                       
                    break;
                    
                   case 5:
                       
                       System.out.print("\n Digite un numero entero: ");
                       int numero4=objleer.nextInt();
                       
                      
                       break;
                     
                   
               }
    }
}
