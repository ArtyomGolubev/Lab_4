package Lab_4.Interfaces;

import Lab_4.AbstractClasses.AbstractCharacter;
import java.util.function.Predicate;

public interface ClassPredicate extends Predicate<AbstractCharacter> {
    boolean test(AbstractCharacter c);
}