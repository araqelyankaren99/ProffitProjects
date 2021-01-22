package lesson23and24;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private Type type;

    public User(String name, String surname, String email, String password, Type type) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}
