package Lab_4.AbstractClasses;

import java.util.Objects;

public abstract class AbstractItem {
    private String itemname;
    private int itemprice;

    public AbstractItem(String itemname, int itemprice) {
        this.itemname = itemname;
        this.itemprice = itemprice;
    }

    public String getItemName() {
        return this.itemname;
    }

    public int getItemPrice() {
        return this.itemprice;
    }

    @Override
    public String toString() {
        return "Предмет " + itemname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemname, itemprice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractItem i = (AbstractItem) obj;
        return Objects.equals(itemname, i.itemname) && Objects.equals(itemprice, i.itemprice);
    }
}