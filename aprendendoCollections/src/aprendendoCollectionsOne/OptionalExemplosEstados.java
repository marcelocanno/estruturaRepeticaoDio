package aprendendoCollectionsOne;

import java.util.Optional;

public class OptionalExemplosEstados {

	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("Valor opcional que est� presente");
		optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("N�o est� presente"));
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Vlor opcional que n�o est� presente");
		optionalNull.ifPresentOrElse(System.out::println,() -> System.out.println("null = n�o est� presente"));
		
		Optional<String> emptyOptional = Optional.empty();
		
		System.out.println("Valor opcional que n�o est� presente");
		emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = N�o est� presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		
		System.out.println("Valor opcional que lan�a erro NullPointException");
		optionalNullErro.ifPresentOrElse(System.out::println,() -> System.out.println("Erro = n�o est� presente"));
	}

}
