package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // pode ser default e não public
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcão");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche");
    }

    private void prepararVitamina() {
        System.out.println("Preparando a vitamina");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionando fruta, leite e suco");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina no liquidificador");
    }

    private void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e o ovo para hamburguer");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
