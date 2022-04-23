package designpattern.adapterpattern;

public class AdapterServiceA implements AdapterServiceInterface {
    ServiceA sa1 = new ServiceA();

    public void runService() {
        sa1.runServiceA();
    }
}
