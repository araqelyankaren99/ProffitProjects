package lesson11;


public class Main1 {
    public static void main(String[] args) {

        FullStackDeveloper fullStackDeveloper1 = new FullStackDeveloper("Karen", "Araqelyan", 21, 2,
                new String[]{"Java", "HTML/CSS", "Android"});

        FullStackDeveloper fullStackDeveloper2 = new FullStackDeveloper("Ashot", "Gabrielyan", 23, 5,
                new String[]{"Javascript", "HTML/CSS", "Angular", "Java", "React"});

        BackendDeveloper backendDeveloper1 = new BackendDeveloper("Emma", "Hakobyan", 23, 3,
                new String[]{"Javascript", "HTML/CSS", "React"});

        BackendDeveloper backendDeveloper2 = new BackendDeveloper("Hayk", "Petrosyan", 24, 3,
                new String[]{"C#", "C++"});

        FrontEndDeveloper frontEndDeveloper1 = new FrontEndDeveloper("Artur", "Harutyunyan", 27, 8,
                new String[]{"Java", "Android"});

        FrontEndDeveloper frontEndDeveloper2 = new FrontEndDeveloper("Aram", "Gasparyan", 28, 5,
                new String[]{"Java", "Android"});

        Developer[] developers = new Developer[]{fullStackDeveloper1, fullStackDeveloper2,
                backendDeveloper1, backendDeveloper2,
                frontEndDeveloper1, frontEndDeveloper2};
        System.out.println("developers");
        for (Developer d:developers
             ) {
            d.write();
        }
        System.out.println();
        System.out.println("count of Java developers = " + countJavaDevelopers(developers));
    }

    public static int countJavaDevelopers(Developer[] developers){
        int count = 0;
        for (Developer d:developers
             ) {
            count+=d.count();
        }
        return count;
    }
}