package factory.abstractfactory;

/**
 * 抽象工厂模式.
 *
 * @ClassName Test
 * Create to NULL 2019/1/7/21:13
 */
public class Test {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new AbstractFactory();
        System.out.println(abstractFactory.getMenNiu().getMilk());
        System.out.println(abstractFactory.getMN().getMilk());
    }
}
