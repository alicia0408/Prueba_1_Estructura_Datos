/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ªngelitox
 */
public class Ejercicio_1 {
  static void Fibonacci(int n)
    {
        int a[] = new int[n];
        // Asignación del primer y segundo elemento
        a[0] = 0;
        a[1] = 1;
     
        for (int i = 2; i < n; i++)
        {
            a[i] = a[i - 2] + a[i - 1]; //almacenar la suma la variable a
        }
     
        for (int i = n - 1; i >= 0; i--)//Matriz en inverso 
        {
     
            System.out.print(a[i] +" ");
        }
    }
     
    // Función donde se define la cantidad de espacios
    public static void main(String[] args)
    {
        int n = 5;
        Fibonacci(n);
     
    }     
}
