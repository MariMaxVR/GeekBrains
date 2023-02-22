package Lesson4_HomeWork;

public class BackendTasks extends Tasks {

    private int id;
    static int count;

    public BackendTasks(int priority, String author, String taskTheme, String deadLine) {
        super(priority, author, taskTheme, deadLine);
        count++;
        this.id = count; // Отдельный автоматический подсчёт номеров заявок определённого типа.

    }

    @Override
    public String toString() {
        return "Заявка Backend: " + "\n" +
                "№ " + id + " - " + getTaskTheme() + "\n" +
                "Автор: " + getAuthor() + "\n" +
                "Время добавления: " + getStartTime() + "\n" +
                "Дата добавления: " + getStartDate() + "\n" +
                "Дедлайн: " + getDeadLine() + "\n" +
                "Важность выполнения: " + getPriority() + "\n\n";
    }

}
