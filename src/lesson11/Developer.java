package lesson11;

import java.util.Arrays;

public class Developer {
    private String name;
    private String surname;
    private int age;
    private int experience;
    private String[] languages;

    public void write(){
        System.out.print("name = " + name + ", surname = " + surname + ", languages = { ");
        for (String s:languages
             ) {
            System.out.print(s+" ");
        }
        System.out.print("}");
        System.out.println();
        }

    public Developer(String name, String surname, int age, int experience, String[] languages) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.languages = languages;
    }

    public int count(){
        int count = 0;
        for (String s:languages
             ) {
            if(s.equals("Java")){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
