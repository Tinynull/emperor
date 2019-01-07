package factory.simplefactory.test;

import factory.simplefactory.CondomFactory;

/**
 * 简单工厂模式测试类.
 *
 * @ClassName Test
 * Create to NULL 2019/1/6/16:57
 */
public class Test {
    public static void main(String[] args) {
        CondomFactory condomFactory = new CondomFactory();
        String condomName = condomFactory.getIstance("杜蕾斯");
        System.out.println(condomName);

        String condomName1 = condomFactory.getIstance("第六感");
        System.out.println("\n"+condomName1);

        String condomName2 = condomFactory.getIstance("杰士邦");
        System.out.println("\n"+condomName2);
    }
}
