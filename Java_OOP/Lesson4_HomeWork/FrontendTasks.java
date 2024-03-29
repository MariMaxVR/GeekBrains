package Lesson4_HomeWork;

public class FrontendTasks extends Tasks {

    private int id;
    static int count;

    public FrontendTasks(int priority, String author, String taskTheme, String deadLine) {
        super(priority, author, taskTheme, deadLine);
        count++;
        this.id = count; // Отдельный автоматический подсчёт номеров заявок определённого типа.
    }

    @Override
    public String toString() {
        return "Заявка Frontend: " + " " + "\n" +
                "№ " + id + " - " + getTaskTheme() + "\n" +
                "Автор: " + getAuthor() + "\n" +
                "Время добавления: " + getStartTime() + "\n" +
                "Дата добавления: " + getStartDate() + "\n" +
                "Дедлайн: " + getDeadLine() + "\n" +
                "Важность выполнения: " + getPriority() + "\n\n";
    }

}
