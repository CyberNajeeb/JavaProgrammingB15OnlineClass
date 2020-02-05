package officeHours;

public class Teams extends ScrumTeam {

    public static void main(String[] args) {

        BofATeams scrum = new BofATeams();
        scrum.teamName = "Achievers";
        scrum.teamSize = 11;
        scrum.teamType = "scrum team";
        standUpMeeting();
        System.out.println(companyName);

        BofATeams DevOps = new BofATeams();
        DevOps.teamName = "GeekSquad";
        DevOps.teamType = "DevOps";
        DevOps.teamSize = 21;

        BofATeams performance = new BofATeams();
        performance.teamSize = 12;
        performance.teamName = "BugBros";
        performance.teamType = "performance";

        BofATeams UAT = new BofATeams();
        UAT.teamName = "Fabulous-est";
        UAT.teamType = "UAT";
        UAT.teamSize = 15;

    }
}
