package AdapterPattern;

public class IPhoneAdapter implements FormatAndroid{
    private FormatIPhone mobile;

    public IPhoneAdapter(FormatIPhone mobile) {
        this.mobile = mobile;
    }

    @Override
    public void recharge() {
        this.mobile.recharge();
    }

    @Override
    public void useMicroUsb() {
        System.out.print("MicroUsb Connected -> ");
        this.mobile.useLightning();
    }
}
