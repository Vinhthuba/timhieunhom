import java.util.ArrayList;
import java.util.List;
public class AccessElementFromArrayListExample {
    public static void main(String[] args) {

        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty"+topCompanies.isEmpty());

        topCompanies.add("google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top"+topCompanies.size()+"companies int the world");
        System.out.println(topCompanies);
        String bestCompany = topCompanies.get(0);
        String secondsBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);
        System.out.println("Best Company: "+bestCompany);
        System.out.println("Seconds Company: "+secondsBestCompany);
        System.out.println("Last company in the list: "+lastCompany);
        topCompanies.set(4,"walmart");
        System.out.println("Modified top companies list: "+topCompanies);
    }
}

