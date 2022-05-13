import java.util.ArrayList;
import java.util.List;
public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programingLanguages = new ArrayList<>();
        programingLanguages.add("C");
        programingLanguages.add("C++");
        programingLanguages.add("Java");
        programingLanguages.add("Kotlin");
        programingLanguages.add("Python");
        programingLanguages.add("Perl");
        programingLanguages.add("Ruby");
        System.out.println("Initial List: "+programingLanguages);
        programingLanguages.remove(5);
        System.out.println("After Remove(5)"+programingLanguages);
        boolean isRemoved = programingLanguages.remove("Kotlin");
        System.out.println("After remove (\"Kotlin\"): "+programingLanguages);

        List<String> scriptLanguages = new ArrayList<>();
        scriptLanguages.add("Python");
        scriptLanguages.add("Ruby");
        scriptLanguages.add("Perl");

        programingLanguages.removeAll(scriptLanguages);
        System.out.println("After removeAll(scriptingLanguages): "+programingLanguages);

        programingLanguages.removeIf(s->(s.charAt(0)=='C'));
        System.out.println("After removing all elements that start with \"C\": "+programingLanguages);

        programingLanguages.clear();
        System.out.println("After clear: "+programingLanguages);
    }
}

