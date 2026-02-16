import java.util.Scanner;

public class Actors {
    private String[][] actorMembers = new String[100][2];
    private int actorCount = 5;

    void initializeActors() {
        actorMembers[0][0] = "Jeffrey";
        actorMembers[1][0] = "Anna";
        actorMembers[2][0] = "William";
        actorMembers[3][0] = "Michael";
        actorMembers[4][0] = "Armstrong";

        actorMembers[0][1] = "stunt performer";
        actorMembers[1][1] = "voice actor";
        actorMembers[2][1] = "script writer";
        actorMembers[3][1] = "3d artist";
        actorMembers[4][1] = "designer";
    }

    public void viewActors() {
        if (actorCount == 0) {
            System.out.println("Actor list is empty.");
        }
        for (int i = 0; i < actorCount; i++) {
            System.out.println(i+1 + ". " + actorMembers[i][0] + "       " + actorMembers[i][1]);
        }
    }
    public void addActor(String actorName, String actorRole) {
        if (actorCount < actorMembers.length) {
            actorMembers[actorCount][0] = actorName;
            actorMembers[actorCount][1] = actorRole;
            actorCount++;
            System.out.println("Actor " + actorName + " has been added.");
        }
        else {
            System.out.println("Actor list is full.");
        }
    }
}
