package factory.methodfactory;

/**
 * .
 *
 * @ClassName BMWFactory
 * Create to NULL 2019/1/6/17:26
 */
public class BMWFactory {

    public String getBMWCar(){
        return new BMW().getCar();
    }

}
