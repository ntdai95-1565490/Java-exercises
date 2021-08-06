package academy.learnprogramming;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbintalPeriod) {
        super(name, orbintalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
