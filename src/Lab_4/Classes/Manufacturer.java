package Lab_4.Classes;

import Lab_4.AbstractClasses.AbstractCharacter;
import Lab_4.AbstractClasses.AbstractItem;
import Lab_4.AbstractClasses.AbstractPlace;
import Lab_4.Enums.Status;
import Lab_4.Exceptions.EngineException;
import Lab_4.Exceptions.NotEnoughMoneyException;
import Lab_4.Interfaces.CanMoveByCar;

public class Manufacturer extends AbstractCharacter implements CanMoveByCar {

    private Wallet wallet = new Wallet();
    public CarEngine carengine = new CarEngine();

    public Manufacturer() {
        super("Крабс");
    }

    private class Wallet { //Inner Class
        private int money = 1000;
        private Wallet(){
            this.money = money;
        }
    }

    public static class CarEngine {// Static Nested class
        private static boolean isWorking = false;

        public static void getStatus() {
            System.out.println("Двигатель работает: " + isWorking);
        }

        public static void igniteIgnition() {
            class Ignition {// Method-local Inner class
                public void ignite() {
                    isWorking = !isWorking;
                    if (isWorking) {
                        System.out.println("Двигатель работает");
                    } else {
                        System.out.println("Двигатель не работает");
                    }
                }
            }
            Ignition ignition = new Ignition();
            ignition.ignite();
        }
    }

    public void buy(AbstractItem item) throws NotEnoughMoneyException {
        if (wallet.money - item.getItemPrice() >= 0) {
            System.out.println(super.getName() + " купил предмет " + item.getItemName());
            wallet.money -= item.getItemPrice();
        } else {
            throw new NotEnoughMoneyException();
        }
    }

    public void eat() {
        System.out.println(super.getName() + " ест");
        this.setStatus(Status.Saturated);
    }

    public void talkWith(AbstractCharacter person1, AbstractCharacter person2) {
        System.out.println(getName() + " отвел в сторонку " + person1.getName() + " и " + person2.getName() + " и поговорил с ними");
        person1.setStatus(Status.Interested);
        person2.setStatus(Status.Interested);
    }

    public void arrangeMeeting(Meeting m, AbstractPlace place) {
        m.setLocation(place);
        System.out.println(getName() + " организовал " + m.getTitle() + " в " + place.getPlaceName());
    }

    public void moveByCar(AbstractPlace place) throws EngineException {
        if (this.carengine.isWorking) {
            super.setWhereabouts(place);
            System.out.println(super.getName() + " приехал в " + place.getPlaceName() + " на машине");
        } else {
            throw new EngineException();
        }
    }
}