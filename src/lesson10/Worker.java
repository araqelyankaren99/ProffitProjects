package lesson10;

public class Worker {
    private String name;
    private String surname;
    private int age;
    private Education education;

    public Worker(String name, String surname, int age, Education education) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.education = education;
    }

    public Education getEducation() {
        return education;
    }

    public void print() {
        if (education.getStage() == 4) {
            System.out.println("name = " + name + ", surname = " + surname + ", age = " + age + ", education = bachelor" +
                    ", university = " + education.getName());
        } else if (education.getStage() == 6) {
            System.out.println("name = " + name + ", surname = " + surname + ", age = " + age + ", education = master " +
                    ", university = " + education.getName());
        } else if (education.getStage() == 8) {
            System.out.println("name = " + name + ", surname = " + surname +
                    ", age = " + age + ", education =  postgraduate student " + ", university = " + education.getName());
        } else {
            System.out.println("error");
        }
    }

    @Override
    public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age +
                ", education=" + education +
                '}';
    }
}
