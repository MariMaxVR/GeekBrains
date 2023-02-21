package Lesson4_HomeWork;




public class BackendTasks extends Tasks implements Calendar {

    private int id;

    public BackendTasks(int priority, String author, String taskTheme, String deadLine) {
        super(priority, author, taskTheme, deadLine);
        this.id = ++count; // Отдельный автоматический подсчёт номеров заявок определённого типа.
    }

    @Override
    public String toString() {
        return "Заявка Backend: " + "\n" +
                "№ " + id + " - " + getTaskTheme() + "\n" +
                "Автор: " + getAuthor() + "\n" +
                "Время добавления: " + getStartTime() + "\n" +
                "Дата добавления: " + getStartDate() + "\n" +
                "Дедлайн: " + getDeadLine() + "\n" +
                "Важность выполнения: " + getPriority() + "\n";
    }

  

}
