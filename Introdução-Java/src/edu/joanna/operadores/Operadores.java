package edu.joanna.operadores;
/*Atribuição
 * String nome = "JOANNA";
 * int idade = 38;
 * double peso = 54.5;
 * char sexo = 'F';
 * boolean doadorOrgao = false;
 * Date dataNascimento = new Date();
 */

public class Operadores {
    public static void main(String[] args) {

        /*
         * int numero = 5;
         * System.out.println(-numero);// -5
         * System.out.println(numero);// 5
         * 
         * numero = -numero;
         * System.out.println(numero);// -5
         * 
         * numero = numero * -1;// 5
         * numero = numero + 1;// --> numero++
         */

        /*
         * Ternário --> ?:
         * 
         * int a, b;
         * a = 5;
         * b = 6;
         * String resultado = a == b ? "verdadeiro" : "falso";
         * System.out.println(resultado);
         */

        String nomeUm = "Joanna";
        String nomeDois = "Joanna";
        String nomeTres = new String("Joanna");
        System.out.println(nomeUm == nomeDois); // true
        System.out.println(nomeUm == nomeTres); // false
        System.out.println(nomeUm.equals(nomeTres)); // true

    }
}
