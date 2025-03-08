import java.util.List;
import java.util.stream.Collectors;

public class lambda {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(10,8,9,7,6,3,4,5,2,1);
        System.out.println("Lista original: " + numbers);
        System.out.println();
        System.out.println("Filtro: ");
        List<Integer>pares = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Numeros pares: " + pares);
    }
}
