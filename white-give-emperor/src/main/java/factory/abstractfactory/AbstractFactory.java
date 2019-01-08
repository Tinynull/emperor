package factory.abstractfactory;

/**
 * .
 *
 * @ClassName AbstractFactory
 * Create to NULL 2019/1/7/21:13
 */
public class AbstractFactory extends AbstractMilk {





    @Override
    Milk getMenNiu() {
        return new MN();
    }

    @Override
    MN getMN() {
        return new MN();
    }
}
