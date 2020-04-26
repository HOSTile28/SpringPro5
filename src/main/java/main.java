public class main {
    public static void main(String... args) {
        MessageRenderer mr = new StandartOutMessageRender();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
