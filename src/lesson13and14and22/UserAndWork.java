package lesson13and14and22;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserAndWork {

    static Scanner scanner=new Scanner(System.in);
    static List<User> userList = new LinkedList<>();
    static List<Work> workList = new LinkedList<>();


    public static void main(String[] args) {
        comment();
        boolean isRan=true;
        while (isRan){
            String string=scanner.nextLine();
            switch(string){
                case "0":
                    isRan=false;
                    break;
                case "1":
                    addUser();
                    break;
                case "2":
                    addWork();
                    break;
                case"3":
                    printUsers();
                    break;
                case "4":
                    printWorkers();
            }
    }
}
    private static void addUser(){
        //String name, String surname, String username, String password,Work[] works

        System.out.println("Please enter name");
        String nameString = scanner.nextLine();

        System.out.println("Please enter surname");
        String surnameString = scanner.nextLine();

        System.out.println("Please enter username");
        String usernameString = scanner.nextLine();

        System.out.println("Please enter password");
        String passwordString = scanner.nextLine();

        //String name, int start, int end

        System.out.println("Please enter names");
        String namesString = scanner.nextLine();
        String[] stringsNames = namesString.split(" ");

        System.out.println("Please enter starts");
        String startsString = scanner.nextLine();
        String[] stringsStarts = startsString.split(" ");
        int[] intsStarts = new int[stringsStarts.length];
        for (int i = 0; i <stringsStarts.length ; i++) {
            intsStarts[i]= Integer.parseInt(stringsStarts[i]);
        }

        System.out.println("Please enter end");
        String endString = scanner.nextLine();
        String[] stringsEnds = endString.split(" ");
        int[] intsEnd = new int[stringsEnds.length];
        for (int i = 0; i <stringsStarts.length ; i++) {
            intsEnd[i]= Integer.parseInt(stringsStarts[i]);
        }

        int namesLength = stringsNames.length;
        int endsLength = stringsEnds.length;
        int startsLength = stringsStarts.length;

        if(namesLength!=endsLength || namesLength!=startsLength){
            throw new RuntimeException("errors data");
        }

        Work[] works = new Work[namesLength];

        for (int i = 0; i < namesLength; i++) {
            Work work = new Work(stringsNames[i],intsStarts[i],intsEnd[i]);
            works[i]=work;
            workList.add(work);
        }

        User user = new User(nameString,surnameString,usernameString,passwordString,works);

        userList.add(user);
    }

    private static void addWork() {
        //String name, int start, int end

        System.out.println("Please enter name");
        String workName = scanner.nextLine();

        System.out.println("Please enter start date");
        int startWork = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter end date");
        int endWork = Integer.parseInt(scanner.nextLine());

        Work work = new Work(workName,startWork,endWork);

        workList.add(work);
    }

    private static void printUsers() {
        for (User u:userList
             ) {
            System.out.println(u);
        }
    }

    private static void printWorkers() {
        for (Work w:workList
             ) {
            System.out.println(w);
        }
    }

    public static void comment(){
        System.out.println("0_Exit");
        System.out.println("1_addUser");
        System.out.println("2_add Work");
        System.out.println("3_allUsers");
        System.out.println("4_allWorks");
    }
}
