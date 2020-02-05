package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    private int adminId;

    public SlackAdminUser(String name, String status, String phoneNum, int adminId) {
        this.name = name;
        this.status = status;
        this.adminId = adminId;
    }

    public static void main(String[] args) {

        SlackAdminUser user1 = new SlackAdminUser("Najeeb",
                "Release the horse", "001-004-007",007);
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        user1.sendAChannelMessage();
        user1.addChannel();
        user1.deleteMessage();

    }

    public void sendAChannelMessage() {
        System.out.println("Message sent!");
    }

    public void deleteMessage() {
        System.out.println("Message deleted!");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

}

