package lesson16and17;

public class Lesson {
    private String name;
    private int price;
    private int count;

    public Lesson(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Lesson{" + "name='" + name + '\'' + ", price=" + price + ", count=" + count + '}';
    }
}
