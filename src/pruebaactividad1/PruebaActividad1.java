/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaactividad1;

import static com.sun.activation.registries.LogSupport.log;

/**
 *
 * @author pc-Gpr
 */
public class PruebaActividad1 {

  
    static public int add (int a, int b)

        {

            return a + b;

        }
    
      static public int factorial (double numero) {
      if (numero==0)
        return 1;
      else
        return (int) (numero * factorial(numero-1));
    }
      
      static public int Raiz (int i)  {
    // sqrt(x) devuelve la raíz cuadrada.
    log("La raíz cuadrada de " + i + " es " + Math.sqrt(i));
    
    return i;
      }
      
      static public double pitagoras (double cateto1, double cateto2, double hypo)

        {

            hypo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
                
        return hypo;
        }
      
}


   
            
  

