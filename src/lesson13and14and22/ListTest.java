package lesson13and14and22;

import java.util.Scanner;

public class ListTest {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
        String[] userNames = dataStorage.userNames();
        boolean isRan = true;
        boolean flag = true;
        comment();
        while (isRan) {
            String string = scanner.nextLine();
            switch (string) {

                case "0":
                    isRan = false;
                    break;

                case "1":
                    System.out.println("Please enter username");
                    String username1 = scanner.nextLine();
                    boolean matches1 = username1.matches("[a-zA-Z0-9]*");
                    if (!matches1) {
                        throw new UserNameNotValidException("invalid username");
                    }

                    System.out.println("Please enter password");
                    String pass = scanner.nextLine();
                    for (User u : dataStorage.getArray()
                    ) {
                        if (u != null) {
                            if (u.getUsername().equals(username1)&& u.getPassword().equals(pass)) {
                                System.out.println("welcome " + u.getName());
                                break;
                            }
                        }
                    }
                    break;

                case "2":
                    System.out.println("Please enter name ");
                    String name = scanner.nextLine();
                    boolean matches2 = name.matches("[A-Z][a-z]*");
                    if (!matches2) {
                        throw new UserNameNotValidException("invalid name");
                    }

                    System.out.println("Please enter surname ");
                    String surname = scanner.nextLine();
                    boolean matches3 = name.matches("[A-Z][a-z]*");
                    if (!matches3) {
                        throw new UserNameNotValidException("invalid surname");
                    }

                    System.out.println("Please enter username");
                    String username = scanner.nextLine();
                    boolean matches4 = username.matches("[a-zA-Z0-9]*");
                    if (!matches4) {
                        throw new UserNameNotValidException("invalid username");
                    }

                    System.out.println("Please enter password");
                    String password = scanner.nextLine();
                    boolean matches5 = username.matches("[a-zA-Z][a-zA-Z0-9]*");
                    if (!matches5 || password.length() == 0 || password.length() > 20) {
                        throw new UserNameNotValidException("invalid password");
                    }
//
                    for (String userName : userNames) {
                        if (userName != null) {
                            if (userName.equals(username)) {
                                System.out.println("please enter other username");
                                flag = false;
                            }
                        }
                    }

                    if (flag) {
                        User user1 = new User(name, surname, username, password);
                        dataStorage.add(user1);
                        for (int i = 0; i < userNames.length; i++) {
                            if (userNames[i] == null) {
                                userNames[i] = username;
                                break;
                            }
                        }
                        System.out.println("Thank you for registering");
                        System.out.println("name = " + user1.getName());
                        System.out.println("surname = " + user1.getSurname());
                        System.out.println("username = " + user1.getUsername());
                        System.out.println("password = " + user1.getPassword());
                        break;
                    }
                    flag = true;
            }
        }
    }


    private static void comment() {
        System.out.println("0_Exit");
        System.out.println("1_Login");
        System.out.println("2_Registration");
    }

}
