package exception.ex0;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + "Connect Success");
        return "success";
    }

    public String send(String data){
        System.out.println(address + "Sending data to server: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + "Disconnect");
    }
}
