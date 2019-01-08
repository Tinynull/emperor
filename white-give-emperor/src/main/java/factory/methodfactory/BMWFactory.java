package factory.methodfactory;

/**
 * .
 *
 * @ClassName BMWFactory
 * Create to NULL 2019/1/6/17:26
 */
public class BMWFactory implements CarFactory {


    @Override
    public Car getCar() {
        return new BMW();
    }
}
