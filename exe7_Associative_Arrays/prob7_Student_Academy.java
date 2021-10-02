package exe7_Associative_Arrays;

import java.util.*;

public class prob7_Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Map<String, Double> mapStudentName = new LinkedHashMap<>();
        for (int i = 0; i < input; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            int countGrade = 1;
            if (!mapStudentName.containsKey(name)) {
                mapStudentName.put(name, grade);
            } else {
                countGrade++;
                mapStudentName.put(name, (mapStudentName.get(name) + grade) / countGrade);
            }
        }
        mapStudentName.entrySet().stream()
                .filter(e -> e.getValue() >= 4.5)
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s -> %.2f\n", e.getKey(), e.getValue()));
    }
}
