package lesson21;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerializeUtil {
    public static void main(String[] args) throws IOException {

        Map<String, User> userMap = new HashMap<>();
        serializeUserMap(userMap);
        deserializeUserMap();
    }

    static void serializeUserMap(Map<String, User> userMap) throws IOException {
        System.out.println("Please enter ID,name,surname");
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(",");
        User user = new User();
        user.setName(strings[1]);
        user.setSurname(strings[2]);
        userMap.put(strings[0], user);
        Writer w1 = new FileWriter("C:\\Users\\Admin-PC\\IdeaProjects\\ProffitProjects" +
                strings[0] + ".txt");
        w1.write(String.valueOf(user));
        w1.close();
    }

    static void deserializeUserMap() throws IOException {
        System.out.println("Please enter UserID");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder str = new StringBuilder();
        File file = new File(
                "C:\\Users\\Admin-PC\\IdeaProjects\\ProffitProjects" + string + ".txt");
        if (file.isFile()) {
            Reader reader = new FileReader(file);
            int i;
            while ((i = reader.read()) != -1) {
                str.append((char) i);
            }
            System.out.print(str);
        }
    }
}
