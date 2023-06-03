/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import HMS_Classes.Messages;
import java.net.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author mta
 */
class ClientHandler extends Thread{
     private Connection conn;
     private PreparedStatement pstmt;
     Socket s;
     public ClientHandler(  Socket s){
           this.s=s;
     }

        @Override
        public void run(){
            try {
                ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
                Messages message=(Messages)ois.readObject();
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/HMS_DB";
                String username = "mahnat";
                String password = "mahnat2023";
                conn = DriverManager.getConnection(url, username, password);
                pstmt=conn.prepareStatement("Insert into Messages (senderId,receiverId,messageContent,dateOfMessage,userType) values (?,?,?,?,?)");
                pstmt.setInt(1, message.getSender());
                pstmt.setInt(2, message.getReceiver());
                pstmt.setString(3, message.getMessageContent());
                pstmt.setDate(4, Date.valueOf(message.getDateOfMessage()));
                pstmt.setString(5, message.getUserType());
                pstmt.executeUpdate();
                
                pstmt.close();
                conn.close();
            } catch (IOException | ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

        }
    
}
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(2000);
        while (true) {            
         Socket s=ss.accept();
         System.out.println("Connected!!");
         ClientHandler c=new ClientHandler(s);
         c.start();
        }
    }
}
