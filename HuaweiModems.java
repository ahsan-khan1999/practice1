public class HuaweiModems extends Modem {

    @Override
    public void open() {
        System.out.println("yes Huaweimodem is open");
    }

    @Override
    public void close() {
        System.out.println("yes Huaweimodem is close");
    }

    @Override
    public void read() {
        System.out.println("yes Huaweimodem is reading");
    }

    @Override
    public void write() {
        System.out.println("yes Huaweimodem is writing");
    }
}
