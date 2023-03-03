public interface View {
    Object start = null;
    void setPresenter(Presenter presenter);
    void start();
    void answer();
}
