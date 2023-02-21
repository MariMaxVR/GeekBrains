package Lesson4_HomeWork;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Tasks {
    private int id;
    private int priority; // Уровни приоритета задачи от 0 - приоритет не задан, до 5 - наивысший.
    private String author;
    private String startTime;
    private String startDate;
    private String deadLine;

    public Tasks(int id, int priority, String author, String startTime, String startDate, String deadLine) {
        this.id = id++;
        this.priority = priority;
        this.author = author;
        this.startTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.startDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.deadLine = deadLine;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

}
