import java.util.ArrayList;
import java.util.List;
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimNumbers = new ArrayList<>();
        nextFivePrimNumbers.add(13);
        nextFivePrimNumbers.add(17);
        nextFivePrimNumbers.add(19);
        nextFivePrimNumbers.add(23);
        nextFivePrimNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimNumbers);
        System.out.println(firstTenPrimeNumbers);

    }
}
