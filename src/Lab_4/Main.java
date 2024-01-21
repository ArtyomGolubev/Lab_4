package Lab_4;

import Lab_4.AbstractClasses.AbstractCharacter;
import Lab_4.Classes.*;
import Lab_4.Exceptions.EngineException;
import Lab_4.Exceptions.MovingToNonexistentPlaceException;
import Lab_4.Exceptions.NotEnoughMoneyException;
import Lab_4.Interfaces.ClassPredicate;

public class Main {
    public static void main(String[] args) {

        //Character
        Manufacturer Krabs = new Manufacturer();
        Businessman Miga = new Businessman("Miga");
        Businessman Julio = new Businessman("Julio");

        //Place
        GPSoffice GPSoffice = new GPSoffice("контора Общества гигантских растений");

        //Item
        Dinner dinner = new Dinner();

        //Exception test

        System.out.println("unchecked exception 1\n");
        Manufacturer.CarEngine.getStatus();
        try {
            Krabs.moveByCar(GPSoffice);
        } catch (EngineException e) {
            System.out.println(e.getMessage());
        }
        Manufacturer.CarEngine.igniteIgnition();
        try {
            Krabs.moveByCar(GPSoffice);
        } catch (EngineException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nunchecked exception 2\n");
        try {
            for (int i = 0; i <= 5; i++) {
                Miga.buy(dinner);
            }
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nchecked exception \n");
        try {
            Julio.move(null);
        } catch (MovingToNonexistentPlaceException e) {
            System.out.println(e.getMessage());
        }

        //Class realization
        System.out.println("\nanonymous class\n");
        ClassPredicate businessmanCheck = new ClassPredicate() {
            @Override
            public boolean test(AbstractCharacter c) {
                return (c instanceof Businessman);
            }
        };
        if (businessmanCheck.test(Krabs)) {
            System.out.println("Этот персонаж - бизнесмен.");
        } else {
            System.out.println("Этот персонаж - не бизнесмен.");
        }
    }
}