import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Lisa");
        names.add("Jennie");
        names.add("Rose");
        names.add("Jisoo");

        System.out.println("name: "+names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        names.sort((name1, name2)->name1.compareTo(name2));
        names.sort(Comparator.naturalOrder());
        System.out.println("Sort name: "+names);
    }
}
