package TP9.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    public static void main(String[] args) throws IOException {
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
