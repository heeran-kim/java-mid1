package exception.ex1;

public class NetworkClientV1 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println(address + " Connect Fail");
            return "connectError";
        }

        System.out.println(address + " Connect Success");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " Sending Fail: " + data);
            return "sendError";
        }

        System.out.println(address + " Sending Success: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " disconnect");
    }

    public void initError(String data) {
        if (data.contains("error1")){
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
