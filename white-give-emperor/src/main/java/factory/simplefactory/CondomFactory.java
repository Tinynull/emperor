package factory.simplefactory;

/**
 * 避孕套工厂.
 * 根据你要的需要的东西生产(条件：你需要知道你要什么).
 * <p>
 * Create to NULL  2019/1/6/16:35
 */
public class CondomFactory {

    public String getIstance(String name) {

        String desc;

        switch (name) {

            case "杜蕾斯":
                desc = "你已获得" + new Durex().getCondom();
                break;

            case "杰士邦":
                desc = "你已获得" + new Jissbon().getCondom();
                break;

            default:
                desc = "此工厂不生产" + name + "避孕套";
                break;
        }

        return desc;

    }
}
