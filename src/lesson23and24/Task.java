package lesson23and24;

import java.util.Date;

public class Task {
    private String title;
    private String desc;
    private long estimate;
    private Date createdDate;
    private Status status;

    public Task(String title, String desc, long estimate, Date createdDate, Status status) {
        this.title = title;
        this.desc = desc;
        this.estimate = estimate;
        this.createdDate = createdDate;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public long getEstimate() {
        return estimate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEstimate(long estimate) {
        this.estimate = estimate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", estimate=" + estimate +
                ", createdDate=" + createdDate +
                ", status=" + status +
                '}';
    }
}
