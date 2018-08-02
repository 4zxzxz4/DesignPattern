package AdapterPattern;

public class AndroidAdapter implements FormatIPhone {
    private FormatAndroid mobile;

    public AndroidAdapter(FormatAndroid mobile) {
        this.mobile = mobile;
    }

    @Override
    public void recharge() {
        this.mobile.recharge();
    }

    @Override
    public void useLightning() {
        System.out.print("Lightning Connected -> ");
        this.mobile.useMicroUsb();
    }
}
