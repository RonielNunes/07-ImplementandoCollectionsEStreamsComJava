package optinonal;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        System.out.println("Valor inteiro Opcional");
        OptionalInt.of(12).isPresent();

        System.out.println("Valor Decimal opcional");
        OptionalDouble.of(55).isPresent();

        System.out.println("Valor long opcional");
        OptionalLong.of(55).isPresent();




    }
}
