package lesson10;

public class Education {
    private String name;
    private int start;
    private int end;

    public Education(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public int getStage(){
        return end-start;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Education{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
