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
public class Tellar1_ejercicio2 {
    public static void main(String[] args) {
         /* Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto, cociente
        y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas*/
        Scanner entrada = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("----------------------");
            System.out.println("MENU DE OPCIONES");
            System.out.println("1.EJERCICIO 1\n2.EJERCICIO 2\n3.EJERCICIO 3\n4.EJERCICIO 4\n5.EJERCICIO 5\n6.EJERCICIO 6\n7.EJERCICIO 7\n8.EJERCICIO 8\n9.EJERCICIO 9\n10.EJERCICIO 10\n11.EJERCICIO 11\n0. Salir");
            System.out.println("");
            System.out.print("Seleccione: ");
            
            opc = entrada.nextInt();


            switch(opc){
                case 1: 
                       /*Escriba un programa en java que lea dos datos de tipo entero, los almacene en dos variables num1 y num2, y ejecute
                       las siguientes instrucciones, analice los resultados*/

                        System.out.print("introducir 1 numero: ");
                        int num1 = entrada.nextInt();
                        System.out.print("introducir 2 numero: ");
                        int num2 = entrada.nextInt();
                        System.out.printf("num1 = %d\n", num1 );
                        System.out.printf("num1 = %.2f\n",(double) num1 );
                        System.out.printf("El valor de %d + %d es %d\n", num1, num1, ( num1 + num1 ) );
                        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );
                        System.out.print("Presine cualquier tecla para continuar");
                   
                        break;

                case 2: 
                    /*Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario e imprima la
                    suma, producto, diferencia de los números.*/
                        System.out.print("introducir 1 numero: ");
                        int nu1 = entrada.nextInt();
                        System.out.print("introducir 2 numero: ");
                        int nu2 = entrada.nextInt();
                        System.out.printf("suma de nu1 + nu2= %d\n", nu1 + nu2 );
                        System.out.printf("Producto de nu1 * nu2= %d\n", nu1 * nu2 );
                        System.out.printf("restante de nu1 - nu2= %d\n", nu1 - nu2 );
                       
                        break;
                case 3: 
                    /*Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto, cociente
                    y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas*/
                        System.out.print("introducir 1 numero: ");
                        double descimal1 = entrada.nextDouble();
                        System.out.print("introducir 2 numero: ");
                        double descimal2 = entrada.nextDouble();
                        System.out.print("introducir 3 numero: ");
                        double descimal3 = entrada.nextDouble();
                        System.out.printf("suma de descimal3 + descimal3 + descimal3 = %f\n", descimal1 + descimal2 + descimal3 );
                        System.out.printf("Producto de descimal3 * descimal3 * descimal3 = %f\n", descimal1 * descimal2 * descimal3 );
                        System.out.printf("Promedio es = %f\n",(descimal1 + descimal2 + descimal3)/(double)3 );
                      
                        break;
                case 4: /*Escriba un programa en Java que le solicite al usuario el valor del radio de una circunferencia y calcule su longitud y
                        área. Imprima los resultados (con dos números decimales)*/
                        System.out.print("introducir radio: ");
                        double L,A;
                        double r = entrada.nextDouble();
                        L=2*Math.PI*r;
                        A=Math.PI*Math.pow(r,2);
                        System.out.printf("Longuitud = %.2f\n",L );
                        System.out.printf("Area = %.2f\n",A );
                        break;
                case 5:
                    /* Escriba un programa en Java que lea un carácter e imprima su correspondiente valor numérico (utilizar la conversión
                    de tipos).*/
                    System.out.print("introducir caracter: ");
                    char c = entrada.next().charAt(0);
                    int asciiValue = c;
                    System.out.printf("Correspondiente numerico de c: %d\n", asciiValue);
                    break;
                case 6:
                    /*Desarrolle un programa en java que calcule el índice de masa corporal BMI el cual está dado por la formula (pesoenKg
                    / alturaenmetros*alturaenmetros)
                    Bajo peso = menos de 18.5
                    Peso normal = 18.5–24.9
                    Sobrepeso = 25–29.9
                    Obesidad = IMC de 30 ó mayor*/
                    System.out.print("Introduzca su peso: ");
                    double pesokg = entrada.nextDouble();
                    System.out.print("Introduzca su Altura en metros: ");
                    double altura = entrada.nextDouble();
                    double IBM;
                    IBM= pesokg / (altura*altura);
                    if (IBM<0 && IBM<18.5){
                        System.out.printf("Bajo peso %.2f\n  ",IBM);
                    }else if (IBM>=18.5 && IBM<25){
                        System.out.printf("Peso Normal %.2f\n  ",IBM);
                        
                    }else if (IBM>=25 && IBM<30){
                        System.out.printf("Sobrepeso %.2f\n  ",IBM);
                    }else {System.out.printf("Obesidad %.2f\n ",IBM);}
                    break;
                    
                    
                case 7:
                    /*Juan conoce el precio de compra y de venta de unos de los productos de su tienda y requiere conocer cuál es su % de
                    utilidad. Desarrolle un programa en java que lo ayude con ese cálculo.*/
                    System.out.print("Precio de compra ");
                    int compra=entrada.nextInt();
                    System.out.print("precio de venta ");
                    int venta=entrada.nextInt();
                    int restault= venta - compra;
                    System.out.printf("Porsentaje de utilidad es: %f",(restault / (double)venta)*100);
                case 8:
                    /*Se desea un aplicativo en Java que muestre por consola el texto de un menú con cinco opciones. Para ello, se solicita
                    utilizar solo una instrucción de impresión.*/
                    System.out.println("--MENU DE 5 OPCIONES--\nOPCION 1\n OPCION 2\nOPCION 3\nOPCION 4\nOPCION 5");
                    break;
                case 9:
                    /*Se desea construir un programa en java que permita calcular el costo total de un viaje que tiene una duración en días.
                    Para ello, se requiere los siguientes datos: Número de días del viaje, Total de kilómetros conducidos por día, costo por
                    litro de gasolina, promedio de kilometro por litro de gasolina, pago por estacionamiento por día, pago de peajes por día.
                    Imprima en consola el resultado.*/
                    System.out.print("Introduze Número de días del viaje ");
                    int Ndv=entrada.nextInt();
                    System.out.print("Total de kilómetros conducidos por día "); 
                    double Kmd=entrada.nextDouble();
                    System.out.print("costo de gasolina por litro");
                    int costGasolina=entrada.nextInt();
                    System.out.print("numero de Litros");
                    int nlitros=entrada.nextInt();
                    int G=nlitros*costGasolina;
                    System.out.printf("Total de costo por gasolina = %d\n ",G);
                    System.out.print("Introducir costo de Estacionamiento ");
                    int costestacionamiento=entrada.nextInt();
                    System.out.printf("Promedio de kilometro por litro de gasolina= %.3f\n ",Kmd / (double)nlitros );
                    
                    System.out.print("Introduzca pago por estacionamiento por día ");
                    int station=entrada.nextInt();
                    System.out.print("pago por estacionamiento por día  ");
                    int pea=entrada.nextInt();
                    System.out.printf("COSTO TOTAL DE EL VIAJE == %d",(G + station + pea + costestacionamiento) *Ndv);
                    
                case 10:
                    /*Escriba un programa en Java que lea el peso de un objeto (en kilogramos) e imprima su equivalencia en: gramos, libras,
                    toneladas.*/
                   
                        System.out.print("INTRODUZCA VALOR EN PESOS--> ");
                        double peso = entrada.nextDouble();
                        double gr=1000;
                        System.out.printf("peso Kg equivalen a %.4f Gramos\n ", gr * peso );
                        System.out.printf("peso Kg equivalen a %.4f Libras\n ",peso * 2 );
                        System.out.printf("peso Kg equivalen a %.4f Toneladas\n ",peso / gr);
                        break;
                case 11:
                    /*Desarrolle un programa en java que lea una cantidad numérica entre cero y mil (0 y 1000) e imprima la cifra
                    correspondiente a sus unidades, decenas y centenas.*/
                    System.out.print("INTRODUZCA UN numero de 0 a 1000 --> ");
                    int num= entrada.nextInt();
                    if (num<1000 && num>100){
                        System.out.printf("Unidad %d\n  ", num%10);
                        num=num/10;
                        System.out.printf("Decena %d\n ", num%10);
                        System.out.printf("Unidad %d\n   ", num/10);
                        
                        }else if (num<100 && num>9){
                            System.out.printf("Unidad %d\n   ", num%10);
                            num=num/10;
                            System.out.printf("Decena %d\n   ", num%10);
                            
                        }else if (num<10 && num>0){
                            System.out.printf("Unidad %d\n   ", num%10);
                         
                        }else{ System.out.print("Numero fuera de rango");}
                    break;
                        
                    
                case 0: 
                    System.out.println("La aplicacion finalizo con exito");
                    break;
                default: System.out.println("Opcion do disponible / intente otra vez"); 
            }

        }while(opc!=0);
    }

}
