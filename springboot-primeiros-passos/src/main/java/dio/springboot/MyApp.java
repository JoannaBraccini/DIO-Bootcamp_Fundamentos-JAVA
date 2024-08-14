package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;//executar os componentes
import org.springframework.stereotype.Component;

@Component // componente bean para sistema spring, não usa mais new
public class MyApp implements CommandLineRunner {
    @Autowired // dependências para executar componente corretamente
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(2, 7));
    }

}
