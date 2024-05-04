import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        Map<String, String> stateCapitalMap = new HashMap<>();
        stateCapitalMap.put("Gujarat", "Gandhinagar");
        stateCapitalMap.put("Andhra Pradesh", "Amaravati");
        stateCapitalMap.put("Arunachal Pradesh", "Itanagar");
        stateCapitalMap.put("Bihar", "Patna");
        stateCapitalMap.put("Haryana", "Chandigarh");
        stateCapitalMap.put("Jharkhand", "Ranchi");
        stateCapitalMap.put("Kerala", "Thiruvananthapuram");
        stateCapitalMap.put("Maharashtra", "Mumbai");
        stateCapitalMap.put("Uttarakhand", "Dehradun");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a state: ");
        String state = scanner.nextLine();
        String capital = stateCapitalMap.get(state);

        if (capital != null) {
            System.out.println("Capital of " + state + " is " + capital);
        } else {
            System.out.println("Capital for " + state + " not found.");
        }
    }
}