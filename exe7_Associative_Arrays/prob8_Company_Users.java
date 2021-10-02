package exe7_Associative_Arrays;

import java.util.*;

public class prob8_Company_Users {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> mapEmployees = new TreeMap<>();
        while (!input.equals("End")) {
            String[] currentCommand = input.split(" -> ");
            String company = currentCommand[0];
            String employeeId = currentCommand[1];
            List<String> listEmployeesId = new ArrayList<>();
            if (!mapEmployees.containsKey(company)) {
                listEmployeesId.add(employeeId);
                mapEmployees.put(company, listEmployeesId);
            } else {
                listEmployeesId = mapEmployees.get(company);
                if (!listEmployeesId.contains(employeeId)) {
                    listEmployeesId.add(employeeId);
                }
                mapEmployees.put(company, listEmployeesId);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> e : mapEmployees.entrySet()) {
            System.out.println(e.getKey());
            for (var element : e.getValue()) {
                System.out.printf("-- %s\n", element);
            }
        }
    }
}
