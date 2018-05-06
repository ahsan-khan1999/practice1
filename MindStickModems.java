public class MindStickModems extends Modem{

    @Override
    public void open() {
        System.out.println("yes mindstick modem is open");
    }

    @Override
    public void close() {
        System.out.println("yes mindstickmodem is close");
    }

    @Override
    public void read() {
        System.out.println("yes mindstickmodem is reading");
    }

    @Override
    public void write() {
        System.out.println("yes mindstickmodem is writing");
    }
}
