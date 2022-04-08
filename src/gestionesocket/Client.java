/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loren
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            //richiesta connessione al server 
            socket = new Socket("127.0.0.1",2000);
            System.out.println("client connesso con il " + socket.getRemoteSocketAddress());
            System.out.println("alla porta "+socket.getLocalPort());
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

        finally{
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
