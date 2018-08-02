package AdapterPattern;

public class Android implements FormatAndroid {
    private boolean conntectorOK = false;

    @Override
    public void recharge() {
        this.conntectorOK = true;
        System.out.println("MicroUsb connected ->");
    }

    @Override
    public void useMicroUsb() {
        if(this.conntectorOK) {
            System.out.println("Recharge Started");
            System.out.println("Recharge 20%");
            System.out.println("Recharge 50%");
            System.out.println("Recharge 70%");
            System.out.println("Recharge Finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }
}
