package Lesson4_HomeWork;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tasks {
    private int priority; // Уровни приоритета задачи от 0 - приоритет не задан, до 4 - наивысший.
    private String taskTheme;
    private String author;
    private String startTime;
    private String startDate;
    private String deadLine;

    static int count;

    static {
        count = 0;
    }

    public Tasks(int priority, String author, String taskTheme, String deadLine) {
        this.priority = priority;
        this.author = author;
        this.startTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.startDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.deadLine = deadLine;
        this.taskTheme = taskTheme;

    }

    public String getPriority() { // возвращает приоритет в зависимости от кода
        return switch (priority) {
            case 1 -> "Низкий приоритет.";
            case 2 -> "Средний приоритет.";
            case 3 -> "Повышенный приоритет.";
            case 4 -> "Наивысший приоритет.";
            default -> "Некорректное значение приоритета или приоритет не установлен, "
                    + "приоритет задаётся в диапазоне от 1 до 4.";
        };

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

    public String getStartDate() {
        return startDate;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public String getTaskTheme() {
        return "\"" + taskTheme + "\"";
    }

    public void setTaskTheme(String taskTheme) {
        this.taskTheme = taskTheme;
    }

    public int getCount() {
        return count;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public static void setCount(int count) {
        Tasks.count = count;
    }

}
