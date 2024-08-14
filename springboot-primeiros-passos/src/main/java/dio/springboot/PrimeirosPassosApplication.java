package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

}
/**
 * Component quando se tem acesso ao código fonte;
 * 
 * Bean quando usando interfaces em que não se tem acesso ao código (ex. imports
 * de springframework);
 * 
 * Usa-se autowired para evitar instanciação (new);
 * 
 * Caso se precise de muitos Beans, melhor criar uma classe chamada Beans para
 * manter todos ali
 * 
 * singleton: todas instancias remetem a mesma referencia;
 * 
 * prototype: cada instancia remete a uma referencia;
 * 
 * application.properties: mantém dados que serão iterados/acessados;
 * 
 * ConfiguratioProperties (prefix): todos os valores dos beans virão através
 * dele;
 * 
 * ORM: Object-Relational Mapping (mapeamento objeto-relacional) recurso para
 * aproximar o POO do contexto de banco de dados relacional;
 * 
 * JPA: especificação baseada em interfaces que, através de um framework,
 * realiza operações de persistência de objetos em Java. Ex. Hibernate, Eclipse
 * Link (Eclipse), Top Link (Oracle), Open JPA;
 */