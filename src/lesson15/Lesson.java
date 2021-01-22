package lesson15;

import java.util.Objects;

public class Lesson {
    private String name;
    private int duration;
    private double price;
    private String lecturerName;

    public Lesson(String name, int duration, double price, String lecturerName) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.lecturerName = lecturerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Lesson{" + "name='" + name + '\'' + ", duration=" + duration + ", price=" + price +
                ", lecturerName='" + lecturerName + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lesson)) return false;
        Lesson lesson = (Lesson) o;
        return duration == lesson.duration &&
                Double.compare(lesson.price, price) == 0 &&
                name.equals(lesson.name) &&
                lecturerName.equals(lesson.lecturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, price, lecturerName);
    }
}
