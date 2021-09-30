package lab6_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prob4_Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSong = Integer.parseInt(scanner.nextLine());
        List<Songs> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSong; i++) {
            String[] data = scanner.nextLine().split("_");
            String typeList = data[0];
            String name = data[1];
            String time = data[2];

            Songs song = new Songs(typeList, name, time);
            songs.add(song);
        }
        String type = scanner.nextLine();
        if (type.equals("all")){
            for (Songs e : songs) {
                System.out.println(e.getName());
            }
        } else {
            for (Songs e : songs) {
                if (e.getTypeList().equals(type)){
                    System.out.println(e.getName());
                }
            }
        }
    }

    public static class Songs {
        private String typeList;
        private String name;
        private String time;

        public Songs(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }
    }
}
