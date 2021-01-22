package lesson13and14and22;

public class User {
    private String name;
    private String surname;
    private String username;
    private String password;
    private Work[]  works;

    public Work[] getWorks() {
        return works;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }
    public User(String name, String surname, String username, String password,Work[] works) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.works=works;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", username='" + username + '\'' +
                ", password='" + password + '\'' + '}';
    }
}
