package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
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
}
