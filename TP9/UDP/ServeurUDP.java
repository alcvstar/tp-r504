package TP9.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServeurUDP {
    public static void main(String[] args) throws IOException {
        try (DatagramSocket sock = new DatagramSocket(1234)) {
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
}
