package AdapterPattern;

public class IPhoneRecharger {
    private FormatIPhone phone;

    public IPhoneRecharger() {
        System.out.println("---Recharging iPhone with iPhone Recharger---");
        this.phone = new IPhone();
        this.phone.useLightning();
        this.phone.recharge();
        System.out.println("---iPhone Ready for use---");
        System.out.println();
    }
}
