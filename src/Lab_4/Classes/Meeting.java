package Lab_4.Classes;

import Lab_4.AbstractClasses.AbstractCharacter;
import Lab_4.AbstractClasses.AbstractPlace;
import java.util.ArrayList;

public class Meeting {
    private String title = "Встреча";
    private ArrayList<AbstractCharacter> participants = new ArrayList<>();
    private AbstractPlace location;

    public String getTitle() {
        return this.title;
    }

    public AbstractPlace getLocation() {
        return location;
    }

    public void setLocation(AbstractPlace place) {
        this.location = place;
    }

    public ArrayList<AbstractCharacter> getParticipants() {
        return this.participants;
    }

    public void addParticipant(AbstractCharacter p) {
        System.out.println(p.getName() + " принял участие в " + this.getTitle());
    }
}