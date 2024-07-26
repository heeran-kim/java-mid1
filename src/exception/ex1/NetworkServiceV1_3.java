package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        // main stream and error stream are mixed up
        // makes it hard to read
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[Network Error] Error Code: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)){
                System.out.println("[Network Error] Error Code: " + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
        // option + command + M: extract method to read it easy
    }
}
