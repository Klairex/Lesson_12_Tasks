public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();

        processor.ShowInfo();
        ram.showInfo();

        MotherBoard.USB usb = new MotherBoard.USB();
        usb.showInfo();
    }
}
