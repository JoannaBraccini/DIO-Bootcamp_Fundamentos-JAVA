package edu.joanna.terminal_argumentos;

public class AboutMe {
    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
/*
 * $ javac --enable-preview --release 22 -d ../bin
 * edu/joanna/terminal_argumentos/AboutMe.java
 * 
 * PS E:\DEV\DIO\Introdução-Java\bin> java --enable-preview
 * edu.joanna.terminal_argumentos.AboutMe Joanna Braccini 37 1.61
 * 
 * Olá, me chamo Joanna Braccini
 * Tenho 37 anos
 * Minha altura é 1.61cm
 * 
 * Argumentos padrão ficam em launch.json
 */