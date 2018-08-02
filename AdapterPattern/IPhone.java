package AdapterPattern;

// Adaptee
public class IPhone implements FormatIPhone {
    private boolean conntectorOK = false;

    @Override
    public void recharge() {
        this.conntectorOK = true;
        System.out.println("Lightning connected ->");
    }

    @Override
    public void useLightning() {
        if(this.conntectorOK) {
            System.out.println("Recharge Started");
            System.out.println("Recharge 20%");
            System.out.println("Recharge 50%");
            System.out.println("Recharge 70%");
            System.out.println("Recharge Finished");
        } else {
            System.out.println("Connect Lightning first");
        }
    }
}
