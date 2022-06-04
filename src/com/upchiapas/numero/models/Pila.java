//221277-ortizcruzdiego
//221254-ochoespinozamartin

package com.upchiapas.numero.models;

import java.util.Scanner;
import java.util.Stack;

    public class Pila {
        String resultado1 = "";
        String resultado2 = "";

        Scanner entrada = new Scanner(System.in);

        public void Procedimiento (){
            System.out.println("Ingresar numero infijo");
            String num = entrada.next();

            Stack<Character> Entrada1 = new Stack<>();
            Stack<Character>Entrada2 = new Stack<>();

            for (int b = 0; b < num.length(); b++){
                if(num.charAt(b) == '+' || num.charAt(b) == '-' || num.charAt(b) == '/' ){
                    Entrada1.push(num.charAt(b));
                }else{
                    Entrada2.push(num.charAt(b)); }

            }
            while(!Entrada1.isEmpty()){
                this.resultado1 = resultado1 + Entrada1.pop();
            }
            while(!Entrada2.isEmpty()){
                this.resultado2 = resultado2 + Entrada2.pop();
            }
            System.out.println("El resultado es :"+ resultado1 + resultado2);

        }



    }



