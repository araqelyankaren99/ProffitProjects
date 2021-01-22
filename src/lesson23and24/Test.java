package lesson23and24;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        List<User> usersList = new ArrayList<>();
        List<User> managersList = new ArrayList<>();
        List<Task> taskList = new ArrayList<>();
        User user = new User(
                "Anna", "Anyan", "an@mail.ru", "anna", Type.Manager);
        managersList.add(user);
        boolean isRun = true;
        Type type = null;
        comment();
        while (isRun) {
            String string = scanner.nextLine();
            switch (string) {

                case "0":
                    isRun = false;
                    System.out.println("You logout");
                    break;

                case "1":
                    System.out.println("Please enter email");
                    String email = scanner.nextLine();

                    System.out.println("Please enter password");
                    String password = scanner.nextLine();

                    for (User u : usersList
                    ) {
                        if (!usersList.isEmpty()) {
                            if (u.getEmail().equals(email)
                                    && u.getPassword().equals(password)) {
                                System.out.println("Welcome " + u.getName() + ",  you " + u.getType());
                                type = u.getType();
                            }
                        }
                    }

                    for (User u : managersList
                    ) {
                        if (u.getEmail().equals(email)
                                && u.getPassword().equals(password)) {
                            System.out.println("Welcome " + u.getName() + ", you " + u.getType());
                            type = u.getType();
                        }
                    }


                    boolean run = true;
                    while (run) {
                        if (type != null) {
                            switch (type) {

                                case Manager:
                                    commentManager();
                                    String str = scanner.nextLine();
                                    switch (str) {

                                        case "0":
                                            run = false;
                                            taskList.clear();
                                            System.out.println("You logout");
                                            break;

                                        case "1":
                                            System.out.println("Please enter name");
                                            String name2 = scanner.nextLine();
                                            boolean matches1 = name2.matches("[a-zA-Z0-9]*");
                                            if (!matches1) {
                                                throw new RuntimeException("invalid name");
                                            }

                                            System.out.println("Please enter surname");
                                            String surname2 = scanner.nextLine();
                                            boolean matches2 = surname2.matches("[a-zA-Z0-9]*");
                                            if (!matches2) {
                                                throw new RuntimeException("invalid surname");
                                            }

                                            System.out.println("Please enter email");
                                            String email2 = scanner.nextLine();
                                            boolean validEmail = email.matches("^(.+)@(.+)$");
                                            if (!validEmail) {
                                                throw new RuntimeException("invalid email");
                                            }

                                            System.out.println("Please enter password");
                                            String password2 = scanner.nextLine();
                                            if (password2.length() == 0 || password2.length() > 20) {
                                                throw new RuntimeException("invalid password");
                                            }

                                            User user2 = new User(
                                                    name2, surname2, email2, password2, Type.User);
                                            usersList.add(user2);
                                            System.out.println("Added user " + user2.getName());
                                            break;

                                        case "2":

                                            System.out.println("Please enter title");
                                            String title = scanner.nextLine();

                                            System.out.println("Please enter desc");
                                            String desc = scanner.nextLine();

                                            System.out.println("Please enter estimate");
                                            long estimate = Long.parseLong(scanner.nextLine());

                                            System.out.println("Please enter status");
                                            String statuses = scanner.nextLine();
                                            Status status = null;

                                            switch (statuses) {
                                                case ("New"):
                                                    status = Status.New;
                                                    break;
                                                case ("InProgress"):
                                                    status = Status.InProgress;
                                                    break;
                                                case ("Finished"):
                                                    status = Status.Finished;
                                                    break;
                                            }

                                            Task task = new Task(
                                                    title, desc, estimate, new Date(), status);

                                            taskList.add(task);
                                            System.out.println("Added task " + task.getTitle());
                                            break;

                                        case "3":
                                            for (Task t : taskList
                                            ) {
                                                System.out.println(t);
                                            }
                                            break;

                                        case "4":
                                            for (User u : usersList
                                            ) {
                                                System.out.println(u);
                                            }
                                            break;

                                        case "5":
                                            System.out.println("Please enter status");
                                            String statuses2 = scanner.nextLine();
                                            Status status2 = null;

                                            switch (statuses2) {

                                                case ("New"):
                                                    status2 = Status.New;
                                                    break;

                                                case ("InProgress"):
                                                    status2 = Status.InProgress;
                                                    break;

                                                case ("Finished"):
                                                    status2 = Status.Finished;
                                                    break;
                                            }

                                            for (Task t : taskList
                                            ) {
                                                if (t.getStatus().equals(status2)) {
                                                    System.out.println(t);
                                                }
                                            }
                                            break;

                                        case "6":
                                            System.out.println("Please enter email");
                                            String email3 = scanner.nextLine();

                                            System.out.println("Please enter password");
                                            String newPassword = scanner.nextLine();

                                            for (User u : managersList) {
                                                if (u.getEmail().equals(email3)) {
                                                    u.setPassword(newPassword);
                                                    System.out.println("new Password = " + newPassword);
                                                }
                                            }
                                            break;

                                        case "7":
                                            System.out.println("Please enter email");
                                            String email4 = scanner.nextLine();
                                            usersList.removeIf(u -> u.getEmail().equals(email4));
                                            break;
                                    }
                                    break;

                                case User:
                                    commentUser();
                                    String str2 = scanner.nextLine();
                                    switch (str2) {

                                        case "0":
                                            run = false;
                                            taskList.clear();
                                            System.out.println("Your logout");

                                        case "1":
                                            for (Task t : taskList
                                            ) {
                                                if (t.getStatus().equals(Status.New)) {
                                                    System.out.println(t);
                                                }
                                            }
                                            break;

                                        case "2":
                                            for (Task t : taskList
                                            ) {
                                                if (t.getStatus().equals(Status.InProgress)) {
                                                    System.out.println(t);
                                                }
                                            }
                                            break;

                                        case "3":
                                            for (Task t : taskList
                                            ) {
                                                if (t.getStatus().equals(Status.Finished)) {
                                                    System.out.println(t);
                                                }
                                            }
                                            break;

                                        case "4":
                                            System.out.println("Please enter name");
                                            String stName = scanner.nextLine();
                                            System.out.println("Please enter status");
                                            String statuses = scanner.nextLine();
                                            Status status = null;

                                            switch (statuses) {
                                                case ("New"):
                                                    status = Status.New;
                                                    break;
                                                case ("InProgress"):
                                                    status = Status.InProgress;
                                                    break;
                                                case ("Finished"):
                                                    status = Status.Finished;
                                                    break;
                                            }
                                            for (Task t : taskList
                                            ) {
                                                if (t.getTitle().equals(stName)) {
                                                    t.setStatus(status);
                                                }
                                            }
                                            break;

                                        case "5":
                                            System.out.println("Please enter name");
                                            String stName2 = scanner.nextLine();
                                            System.out.println("Please enter estimation");
                                            long estimationTask = Long.parseLong(scanner.nextLine());
                                            for (Task t : taskList
                                            ) {
                                                if (t.getTitle().equals(stName2)) {
                                                    t.setEstimate(estimationTask);
                                                }
                                            }
                                            break;
                                        case "6":

                                            System.out.println("Please enter email");
                                            String email3 = scanner.nextLine();
                                            System.out.println("Please enter password");
                                            String newPassword = scanner.nextLine();
                                            for (User u : usersList) {
                                                if (u.getEmail().equals(email3)) {
                                                    u.setPassword(newPassword);
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    private static void commentUser() {
        System.out.println("0_LOGOUT");
        System.out.println("1_Print my new Tasks");
        System.out.println("2_Print my current Tasks");
        System.out.println("3_Print my finished Tasks");
        System.out.println("4_Change My Task Status by Name");
        System.out.println("5_Change My Task Estimations by Name");
        System.out.println("6_Change Your Password");
    }

    private static void commentManager() {
        System.out.println("0_LOGOUT");
        System.out.println("1_ADD User");
        System.out.println("2_ADD Task");
        System.out.println("3_Print All Tasks");
        System.out.println("4_Print All Users");
        System.out.println("5_Print Tasks By Status");
        System.out.println("6_Change Your Password");
        System.out.println("7_Delete UserBy Email");
    }

    private static void comment() {
        System.out.println("0_Exit");
        System.out.println("1_Login");
    }
}
