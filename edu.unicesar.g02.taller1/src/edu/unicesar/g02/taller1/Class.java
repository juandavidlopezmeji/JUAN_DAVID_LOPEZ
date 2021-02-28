/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.g02.taller1;


import java.util.Scanner;

/**
 *
 * @author Okami
 */
public class Class {
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        int op=0;
        do{
            System.out.println("----------------------");
            System.out.println("Menu Opciones");
            System.out.println("1. Dia de la semana");
            System.out.println("2. Calcula Edad");
            System.out.println("3. Suma PAres e Impares");
            System.out.println("4. Suma arreglo");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Seleccione: ");
            op = entrada.nextInt();
            System.out.println("----------------------\n");


            switch(op){
                case 1: 
                        System.out.print("No del dia: ");
                        int dia = entrada.nextInt();
                        diaSemana(dia);
                        break;

                case 2: System.out.print("Edad: ");
                        int edad = entrada.nextInt();
                        calculadEdad(edad);
                        break;
                case 3: System.out.print("N: ");
                        int n = entrada.nextInt();
                        sumaParesImpares(n);
                        break;
                case 4: int v[] = {8,5,2,9,7};  // arreglo con elementos por defecto
                        System.out.println("Arreglo v: con elementos por default");
                        sumaArreglo(v);
                        System.out.println("Arreglo w: con elementos leidos por consola");
                        int w[] = crearArreglo(); // crea el arreglo y lee por consola sus valores
                        sumaArreglo(w);
                        break;
                case 0: System.out.println("La aplicacion finalizo con exito");
                        break;
                default: System.out.println("Opcion do disponible / intente otra vez"); 
            }

        }while(op!=0);
    }

    public static void diaSemana(int dia){
        switch(dia){
            case 1: System.out.println("Lunes");break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sabado");break;
            case 7: System.out.println("Domingo");break;
            default: System.out.println("Indeterminado");
        }
    }

    public static int[] crearArreglo(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("No elementos del arreglo: ");
        int n= entrada.nextInt();
        int v[] = new int[n];
        for(int i=0; i<v.length;i++){
            System.out.printf("Valor de V[%d]:", i);
            v[i]=entrada.nextInt();
        }
        return v;
    }

    public static void sumaArreglo(int v[]){
        int suma=0;
        for(int i=0; i<v.length;i++){
            System.out.print(" "+v[i]);
            suma+=v[i];
        }
        System.out.println("\nSuma de elementos: " + suma);
    }

    public static void calculadEdad(int edad){
        if(edad>=18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }

    public static void sumaParesImpares(int n){
        int i=0; // cuenta el numero de pares sumados
        int j=0; // cuenta el numero de impares sumados
        int num=0; // el numero
        long sumaPares =0; 
        long sumaImpares=0;    
        //n=3;
        while(i<n || j<n){
            if(num%2==0 ){ // es par
                sumaPares+=num;
                i++;
            }
            else{
                sumaImpares+=num;
                j++;
            }
         num++;
        }

        System.out.printf("Suma %d Pares = %d\n", n, sumaPares);
        System.out.printf("Suma %d impares = %d\n", n, sumaImpares);
    }
}
