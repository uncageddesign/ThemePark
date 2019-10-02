package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;


public class RollerCoaster extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double isTol = visitor.getHeight() >= 200 ? 2.0 : 1.0;
        return defaultPrice() * isTol;
    }

    @Override
    public int getRating(int rating) {
        return rating;
    }

    @Override
    public String getName(String name) {
        return name;
    }
}
