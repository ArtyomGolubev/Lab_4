package Lab_4.Classes;

import Lab_4.AbstractClasses.AbstractCharacter;
import Lab_4.AbstractClasses.AbstractItem;
import Lab_4.Enums.Status;
import Lab_4.Exceptions.NotEnoughMoneyException;

public class Businessman extends AbstractCharacter {

    private Wallet wallet = new Wallet();

    public Businessman(String name) {
        super(name);
    }

    private class Wallet { //Inner Class
        private int money = 1000;
        private Wallet(){
            this.money = money;
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

    public void agreeFor(Meeting m, AbstractCharacter p){
        if (this.getStatus() == Status.Interested) {
            System.out.println(getName() + " согласился на " + m.getTitle() + " с " + p.getName() + " так как он заинтересован");
            m.addParticipant(this);
        }
        else System.out.println(getName() + " не согласился на " + m.getTitle() + " с " + p.getName());
    }

    public void eat() {
        System.out.println(super.getName() + " ест");
        this.setStatus(Status.Saturated);
    }
}
