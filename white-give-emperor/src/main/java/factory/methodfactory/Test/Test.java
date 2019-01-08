package factory.methodfactory.Test;

import factory.methodfactory.BMWFactory;

/**
 * .
 *
 * @ClassName Test
 * Create to NULL 2019/1/6/17:27
 */
public class Test {
    public static void main(String[] args) {
        BMWFactory bmwFactory = new BMWFactory();
        System.out.println(bmwFactory.getCar().obtainCar());
    }
}
