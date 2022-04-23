package designpattern.adapterpattern;

public class AdapterServiceB implements AdapterServiceInterface {
    ServiceB sb1 = new ServiceB();

    public void runService() {
        sb1.runServiceB();
    }
}
