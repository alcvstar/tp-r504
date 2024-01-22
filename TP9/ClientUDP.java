package TP9;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    public static void main(String[] args) {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("addresse=" +addr.getHostName());
        String s="Hello World";
        byte[] data = s.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
        DatagramSocket sock = new DatagramSocket();
        sock.send(packet);
        sock.close();
    }
}
