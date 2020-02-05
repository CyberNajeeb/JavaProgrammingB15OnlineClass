package day44;

/**
 Create a class called SlackUser
 attributes :
 name  ,  status (make it protected)
 behaviours :
 sendMessage
 callSomeone
 addEmoji
 Creare 1 subClass SlackAdminUser
 attribute :
 adminId
 behaviour :
 sendAtChannelMessage
 deleteMessage
 addChannel
 toString method
 constructor :
 3 argument constructor to set all fields value
 */
public class SlackUser {
    protected String name, status, phoneNum;


    public void sendMessage(){
        System.out.println("Slack User " + name + " typing");
    }
    public void callSomeone(){
        System.out.println("Slack User " + name + " calling");
    }
    public void addEmoji(){
        System.out.println("Slack User " + name + " sent Emoji");
    }
    public void addChannel(){
        System.out.println("channel added");
    }
    public void phoneNumber(){
        System.out.println(name + "'s phone number is " + phoneNum);
    }

    public void getPhoneNum() {
        System.out.println(name + "'s phone number is " + phoneNum);
    }
}
