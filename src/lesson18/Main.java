package lesson18;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<User> userList = new LinkedList<>();
        List<Post> postList = new LinkedList<>();
        List<String> emailList = getEmails(userList);
        User userU = null;
        boolean isRun = true;
        boolean flag = true;
        boolean run = true;
        comment();
        while (isRun) {
            String string = scanner.nextLine();
            for (Post p : postList) {
                System.out.println(p);
            }

            switch (string) {
                case "0":
                    isRun = false;
                    break;

                case "1":
                    System.out.println("Please enter email");
                    String email = scanner.nextLine();
                    boolean validEmailS = email.matches("^(.+)@(.+)$");
                    if (!validEmailS) {
                        throw new RuntimeException("invalid email");
                    }

                    System.out.println("Please enter password");
                    String password = scanner.nextLine();
                    if (password.length() == 0 || password.length() > 20) {
                        throw new RuntimeException("invalid password");
                    }

                    for (User u : userList) {
                        if (u != null) {
                            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                                System.out.println("welcome " + u.getName());
                                userU = u;
                                break;
                            }
                        }
                    }
                    com();
                    while (run) {
                        String string1 = scanner.nextLine();
                        switch (string1) {

                            case "0":
                                run = false;
                                break;

                            case "1":
                                //String title, String post, String category, Date createdDate, User author
                                System.out.println("Please enter title");
                                String title = scanner.nextLine();

                                System.out.println("Please enter post");
                                String postText = scanner.nextLine();

                                System.out.println("Please enter category");
                                String category = scanner.nextLine();

                                Post post = new Post(title, postText, category, new Date(), userU);
                                System.out.println(post);

                                System.out.println("All posts");
                                for (Post p:postList) {
                                    System.out.println(p);
                                }
                                postList.add(post);
                        }
                    }
                    break;

                case "2":

                    System.out.println("Please enter name");
                    String nameString = scanner.nextLine();
                    boolean validName = nameString.matches("[A-Z][a-z]*");
                    if (!validName) {
                        throw new RuntimeException("invalid name");
                    }

                    System.out.println("Please enter surname");
                    String surnameString = scanner.nextLine();
                    boolean validSurName = surnameString.matches("[A-Z][a-z]*");
                    if (!validSurName) {
                        throw new RuntimeException("invalid surname");
                    }

                    System.out.println("Please enter email");
                    String emailString = scanner.nextLine();
                    boolean validEmail = emailString.matches("^(.+)@(.+)$");
                    if (!validEmail) {
                        throw new RuntimeException("invalid email");
                    }

                    System.out.println("Please enter password");
                    String passwordString = scanner.nextLine();
                    if (passwordString.length() == 0 || passwordString.length() > 20) {
                        throw new RuntimeException("invalid password");
                    }

                    for (String s : emailList
                    ) {
                        if (s != null) {
                            if (s.equals(emailString)) {
                                System.out.println("please enter other username");
                                flag = false;
                            }
                        }
                    }

                    if (flag) {
                        User user = new User(nameString, surnameString, emailString, passwordString);
                        userList.add(user);
                        System.out.println("Thank you for registering");
                        System.out.println("name = " + user.getName());
                        System.out.println("surname = " + user.getSurname());
                        System.out.println("username = " + user.getEmail());
                        break;
                    }
                    flag = false;
                    break;

                case "3":
                    System.out.println("Please enter category");
                    String stringCategory = scanner.nextLine();
                    for (Post p : postList) {
                        if (p.getCategory().equals(stringCategory)) {
                            System.out.println(p);
                        }
                    }
                    break;

                case "4":
                    System.out.println("Please enter user name");
                    String stringUserName = scanner.nextLine();
                    for (Post p : postList) {
                        if (p.getAuthor().getName().equals(stringUserName)) {
                            System.out.println(p);
                        }
                    }
                    break;
            }
        }
    }

    private static void comment() {
        System.out.println("0_Exit");
        System.out.println("1_Login");
        System.out.println("2_Registration");
        System.out.println("3_POSTS_BY_CATEGORY");
        System.out.println("4_POSTS_BY_USER");
    }

    public static void com() {
        System.out.println("0_Logout");
        System.out.println("1_ADD_POST");
    }

    private static List<String> getEmails(List<User> list) {
        List<String> stringList = new LinkedList<>();
        for (User u : list) {
            stringList.add(u.getEmail());
        }
        return stringList;
    }
}
