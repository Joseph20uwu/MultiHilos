package com.pp2;

//Definimos unos sencillos hilos. Se detendr�n un rato
//antes de imprimir sus nombres y retardos

class TestTh extends Thread {
 private String nombre;
 private int retardo;

 // Constructor para almacenar nuestro nombre
 // y el retardo
 public TestTh( String s,int d ) {
     nombre = s;
     retardo = d;
     }

 // El metodo run() es similar al main(), pero para
 // threads. Cuando run() termina el thread muere
 public void run() {
     // Retasamos la ejecuci�n el tiempo especificado
     try {
         sleep( retardo );
     } catch( InterruptedException e ) {
         System.out.println("Esta tieso, algo sali� mal");
     }

     // Ahora imprimimos el nombre
     System.out.println( "Hola Mundo! "+nombre+" "+retardo );
     }
 } 
