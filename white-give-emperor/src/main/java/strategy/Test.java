package strategy;

/**
 * @ClassName Test.
 * Create by Null on 2019/1/9/22:02
 **/
public class Test {
    public static void main(String[] args) {
        Tour tour = new Tour();
        String tour1 = tour.tour(VechiecGrop.FE.get());
        System.out.println(tour1);
    }
}
