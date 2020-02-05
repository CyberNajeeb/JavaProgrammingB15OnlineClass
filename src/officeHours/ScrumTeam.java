package officeHours;

public class ScrumTeam extends BofATeams {

    String scrumMasterName;
    int scrumMasterIDNum;
    BofATeams scrum = new BofATeams();

    public static void standUpMeeting(){
        System.out.println("This scrum team is joining the meeting");
    }
}

