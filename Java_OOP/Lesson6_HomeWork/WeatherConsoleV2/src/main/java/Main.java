public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        Service service = new WeatherService();
//        Presenter presenter = new Presenter(view, service);
        new Presenter(view, service);
        view.start;
    }
}
