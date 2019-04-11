
package sunwaylab;


import java.net.*;
public class FindIp {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
    }
}
