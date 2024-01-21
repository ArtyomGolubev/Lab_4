package Lab_4.Interfaces;

import Lab_4.AbstractClasses.AbstractPlace;
import Lab_4.Exceptions.MovingToNonexistentPlaceException;

public interface CanMove {
    void move(AbstractPlace place) throws MovingToNonexistentPlaceException;
}