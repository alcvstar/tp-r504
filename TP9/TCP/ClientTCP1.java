package TP9.TCP;

import java.io.*;
import java.net.*;

public class ClientTCP1 {
    public static void main(String[] args) {
        try {
        // ClientTCP1.java
            Socket socket = new Socket("localhost", 2016);
            DataOutputStream dOut=new DataOutputStream(socket.getOutputStream());
            dOut.writeUTF("message test");
            socket.close();
        } catch (Exception e) {
        // TODO: handle exception
        }
    }   
}
