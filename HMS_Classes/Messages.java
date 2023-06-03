/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS_Classes;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author mta
 */
public class Messages implements Serializable{
   
    private int senderID;
    private int receiverId;
    private String messageContent;
    private LocalDate dateOfMessage;
    private String userType;

    public Messages( int senderID, int receiverId, String messageContent, LocalDate dateOfMessage,String userType) {
        this.senderID = senderID;
        this.receiverId = receiverId;
        this.messageContent = messageContent;
        this.dateOfMessage = dateOfMessage;
        this.userType=userType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    

    public int getSender() {
        return senderID;
    }

    public void setSender(int senderID) {
        this.senderID = senderID;
    }

    public int getReceiver() {
        return receiverId;
    }

    public void setReceiver(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public LocalDate getDateOfMessage() {
        return dateOfMessage;
    }

    public void setDateOfMessage(LocalDate dateOfMessage) {
        this.dateOfMessage = dateOfMessage;
    }

    @Override
    public String toString() {
        return "Messages{" + "chatID=" + ", sender=" + senderID + ", receiver=" + receiverId + ", messageContent=" + messageContent + ", dateOfMessage=" + dateOfMessage + '}';
    }
    
}
