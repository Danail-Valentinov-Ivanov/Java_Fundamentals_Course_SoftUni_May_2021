package exe7_Associative_Arrays;

import java.util.*;

public class prob5_SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Map<String, String> mapUserName = new LinkedHashMap<>();
        for (int i = 0; i < input; i++) {
            String[] currentCommand = scanner.nextLine().split(" ");
            switch (currentCommand[0]) {
                case "register":
                    if (!mapUserName.containsKey(currentCommand[1])) {
                        mapUserName.put(currentCommand[1], currentCommand[2]);
                        System.out.printf("%s registered %s successfully\n", currentCommand[1]
                                , currentCommand[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s\n"
                                , currentCommand[2]);
                    }
                    break;
                case "unregister":
                    if (mapUserName.containsKey(currentCommand[1])) {
                        String unregisteredUser = currentCommand[1];
                        mapUserName.remove(currentCommand[1]);
                        System.out.printf("%s unregistered successfully\n", unregisteredUser);
                    } else {
                        System.out.printf("ERROR: user %s not found\n", currentCommand[1]);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> e : mapUserName.entrySet()) {
            System.out.printf("%s => %s\n", e.getKey(), e.getValue());
        }
    }
}
