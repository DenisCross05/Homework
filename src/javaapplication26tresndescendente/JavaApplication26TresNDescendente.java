/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26tresndescendente;

import javax.swing.JOptionPane;

/**
 *
 * @author G6
 */
public class JavaApplication26TresNDescendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float a, b, c, menor, mayor = 0, mediano = 0;
String primerNumero, segundoNumero, tercerNumero;

primerNumero = JOptionPane.showInputDialog("Digite el primer número: " );
segundoNumero = JOptionPane.showInputDialog("Digite el segundo número: " );
tercerNumero = JOptionPane.showInputDialog("Digite el tercer número: " );
a = Float.parseFloat(primerNumero);
b = Float.parseFloat(segundoNumero);
c = Float.parseFloat(tercerNumero);
if (a>= b & a>c){
    mayor=a;
    if (b>=c){
        mediano = b;
        menor =c;
             }
    else{
        mediano=c;
        menor =b;
        }
               }
else if (b>=a & b>c){
    mayor = b;
    if (a>=c){
        mediano=a;
        menor=c;
             }
    else{
        mediano=c;
        menor=a;
        }
                    }
   else{
    mayor=c;
    if(a>=b){
        mediano=a;
        menor=b;
            }
    else{
        mediano=b;
        menor=a;
        }
      }
System.out.println("Primer numero:"+mayor);
System.out.println("Segundo numero:"+mediano);
System.out.println("Tercer numero:"+menor);
    }
    } 