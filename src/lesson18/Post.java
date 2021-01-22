package lesson18;

import java.util.Date;

public class Post {
    private String title;
    private String post;
    private String category;
    private Date createdDate;
    private User author;

    public Post(String title, String post, String category, Date createdDate, User author) {
        this.title = title;
        this.post = post;
        this.category = category;
        this.createdDate = createdDate;
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public User getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Post{" + "title='" + title + '\'' + ", post='" + post + '\'' +
                ", category='" + category + '\'' + ", createdDate=" + createdDate +
                ", author=" + author + '}';
    }
}
