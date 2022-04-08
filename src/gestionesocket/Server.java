/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loren
 */
public class Server {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket socket = null; 
        ServerSocket serverSocket = null;
        try {
            // TODO code application logic here
            serverSocket = new ServerSocket(2000);
            System.out.println("server creato");
            socket = serverSocket.accept();
            System.out.println("connessione avviata" + socket.getRemoteSocketAddress());
        }catch(BindException bx){
            System.out.println("server già avviato");
        } catch (IOException ex) {
            System.err.println("errore nella creazione del server e nell'avvio del servizio");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{
            //chiusura socket
            try {
                if(socket != null){
                    serverSocket.close();
                }
            }catch(IOException ex){
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }
    
}
