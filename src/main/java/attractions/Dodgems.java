package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public int getRating(int rating) {
        return rating;
    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double isSmol = visitor.getAge() <= 12 ? 1.0 : 0.5;
        return defaultPrice() / isSmol;
    }


}
