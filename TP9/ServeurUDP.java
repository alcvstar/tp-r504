package TP9;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServeurUDP {
    public static void main(String[] args) {
        DatagramSocket sock = new DatagramSocket(1234);
        while (true)
        {
            System.out.println("-Waiting data");
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            sock.receive(packet);
            String str = new String(packet.getData());
            System.out.println("str="+str);
        }
    }   
}
