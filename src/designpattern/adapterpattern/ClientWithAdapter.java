package designpattern.adapterpattern;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceInterface asi = new AdapterServiceA();
        asi.runService();
    }
}
