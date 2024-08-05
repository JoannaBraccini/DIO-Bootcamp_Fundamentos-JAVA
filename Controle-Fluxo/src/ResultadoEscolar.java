public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
         * int nota = 6;
         * if (nota >= 7)
         * System.out.println("Aprovado");
         * //condicional simples: somente if
         * 
         * else if (nota >= 5 && nota < 7)
         * System.out.println("Recuperação");
         * //condicional composta: if/else
         * 
         * else
         * System.out.println("Reprovado");
         * //condicional encadeada: if/else-if/else
         */
        int nota = 6;
        String resultado = nota <= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        // ternário encadeado: if (...?) else if (:...?) else (:), ternário simples (if?
        // else:)

    }
}
