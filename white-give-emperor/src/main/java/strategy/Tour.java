package strategy;

/**
 * 旅游.
 *
 * @ClassName Tour.
 * Create by Null on 2019/1/9/21:56
 **/
public class Tour extends Witness {

    public String tour(Vehicle vehicle) {
        String witness = new Witness().GetTo();
        return vehicle.tool() + witness;
    }
}
