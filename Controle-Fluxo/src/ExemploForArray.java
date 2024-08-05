public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        // for (int x = 0; x < alunos.length; x++) {
        // System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        // }

        for (String aluno : alunos) {// foreach
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
