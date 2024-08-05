package edu.joanna.anatomiadasclasses;
public class MinhaClasse {//classe
    
    public static void main (String [] args) {//método
        String primeiroNome = "Joanna";
        String segundoNome = "Braccini";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {//método
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
