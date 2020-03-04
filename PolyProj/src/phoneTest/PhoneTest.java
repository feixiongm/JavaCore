package phoneTest;

import tel.*;

public class PhoneTest {
    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.call();
        phone.message();
        phone.video();
        phone.music();
        phone.network();
        phone.photo();
        System.out.println("====================");
        Iphoto ip = new FourthPhone();
        ip.photo();
        ip = new Camera();
        ip.photo();
        System.out.println("====================");
        System.out.println(INet.TEMP);
        System.out.println("====================");
        INet net = new SmartPhone();
        System.out.println("====================");
        System.out.println(net.TEMP);
        System.out.println("====================");
        SmartPhone sp = new SmartPhone();
        System.out.println(sp.TEMP);
        System.out.println("====================");
        net.connection();
        System.out.println("====================");
        INet.stop();
        System.out.println("====================");
        INet net2 = new SmartPhone();
        net2.connection();
        Iphoto ip2 = new SmartPhone();
        ip2.connection();
        System.out.println("====================");
        INet net3 = new FourthPhone();
        Iphoto ip3 = new FourthPhone();
        net3.connection();
        ip3.connection();
    }
}
