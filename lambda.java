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
        System.out.println();
        System.out.println("Transformar: ");
        List<Integer>transform = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Numeros multiplicados por 2: " + transform);
        System.out.println();
        System.out.println("Ordenar: ");
        List<Integer>order = numbers.stream().sorted().toList();
        System.out.println("Numeros em ordem: " + order);
        System.out.println();
        System.out.println("Imprimir: ");
        numbers.stream().forEach(System.out :: println);
    }
}