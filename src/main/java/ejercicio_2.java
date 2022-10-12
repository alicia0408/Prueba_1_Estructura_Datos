
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ªngelitox
 */
public class ejercicio_2 {
    public static void main(String[] args) throws IOException {
   
    //declarando matrices , tener en cuenta que deben ser igual el numero de fila y columnas de amabas matrices , sin importar si son cuadradas.        
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int matriz_resultado[][] = new int[3][3];
        int matriz_resultado_resta[][] = new int[3][3];

        // definiendo un objeto de entrada para tomar datos del teclado
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
        // pidiendo los datos del teclado de la matriz a
        System.out.println("Valores Matriz A");
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                System.out.print("Da elemento " + (i+1)+ " , " + (j+1) + " : ");
                a[i][j] = Integer.parseInt(in.readLine());
            }
            System.out.println();
        }
       
        // pidiendo los datos del teclado de la matriz b
        System.out.println("Valores Matriz B");
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<b[0].length; j++) {
                System.out.print("Da elemento " + (i+1)+ " , " + (j+1) + " : ");
                b[i][j] = Integer.parseInt(in.readLine());
            }
            System.out.println();
        }
       
      
       //suamdo A+B
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<b[0].length; j++){
                matriz_resultado[i][j] = a[i][j] + b[i][j];
            }
        }
       //suamdo A+B
        for (int i=0; i<matriz_resultado.length; i++) {
            for (int j=0; j<b[0].length; j++){
                matriz_resultado_resta[i][j] = matriz_resultado[i][j] - a[i][j];
            }
        }
        //mostrando la suma de A+B
        System.out.println("La suma A+B-C es");
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<b[0].length; j++) {
                System.out.print(" "+ matriz_resultado_resta[i][j] + " " );
            }
            System.out.println();
        }
   }
}
