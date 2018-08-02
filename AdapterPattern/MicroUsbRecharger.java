package AdapterPattern;

public class MicroUsbRecharger {
    private IPhone phone;
    private IPhoneAdapter phoneAdapter;

    public MicroUsbRecharger() {
        System.out.println("---Recharging iPhone with Generic Recharger---");
        this.phone = new IPhone();
        this.phoneAdapter = new IPhoneAdapter(phone);
        this.phoneAdapter.useMicroUsb();
        this.phoneAdapter.recharge();
        System.out.println("---iPhone Ready for use---");
        System.out.println();
    }
}
