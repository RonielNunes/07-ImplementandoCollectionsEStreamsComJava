package optinonal;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("VALOR OPCIONAL");
        System.out.println(optionalString.isPresent());

        //optionalString.isPresent(System.out::println);

        //optionalString.isPresent(System.out::println,()->System.out.println("VALOR NÃO ESTÁ PRESENTE"));

        if (optionalString.isPresent()){
            String valor = optionalString.get();
            System.out.println(valor);
        }

        //optionalString.map(valot->valot.concat("**")).isPresent(System.out::println);
        optionalString.orElseThrow(IllegalStateException::new);
    }
}
