package AdapterPattern;

public class AndroidRecharger {
    private FormatAndroid phone;

    public AndroidRecharger() {
        System.out.println("---Recharging Android Phone with Generic Recharger---");
        this.phone = new Android();
        this.phone.useMicroUsb();
        this.phone.recharge();
        System.out.println("---Android Phone Ready for use---");
        System.out.println();
    }
}
