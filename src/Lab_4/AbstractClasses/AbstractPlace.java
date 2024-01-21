package Lab_4.AbstractClasses;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstractPlace {
    private String placename;
    private ArrayList<AbstractCharacter> characters = new ArrayList<>();

    public AbstractPlace(String placename) {
        this.placename = placename;
    }

    public void goAway(AbstractCharacter p){
        this.characters.remove(p);
    }

    public void addCharacter(AbstractCharacter p){
        this.characters.add(p);
    }

    public String getPlaceName() {
        return this.placename;
    }

    @Override
    public String toString() {
        return "Место " + placename;
    }

    @Override
    public int hashCode() {
        return Objects.hash(placename, characters);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractPlace p = (AbstractPlace) obj;
        return Objects.equals(placename, p.placename) && Objects.equals(characters, p.characters);
    }
}
