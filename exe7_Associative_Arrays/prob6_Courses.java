package exe7_Associative_Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class prob6_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> mapCourses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] currentCommand = input.split(" : ");
            List<String> listStudents = new ArrayList<>();
            if (!mapCourses.containsKey(currentCommand[0])) {
                listStudents.add(currentCommand[1]);
                mapCourses.put(currentCommand[0], listStudents);
            } else {
                listStudents = mapCourses.get(currentCommand[0]);
                listStudents.add(currentCommand[1]);
                mapCourses.put(currentCommand[0], listStudents);
            }
            Collections.sort(listStudents);
            input = scanner.nextLine();
        }
        mapCourses.entrySet().stream().sorted((e1, e2) ->
                Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d\n", e.getKey(), e.getValue().size());
                    for (var element : e.getValue()) {
                        System.out.printf("-- %s\n", element);
                    }
                });
    }
}
