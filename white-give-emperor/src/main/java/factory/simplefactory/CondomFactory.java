package factory.simplefactory;

/**
 * 避孕套工厂.
 * 根据你要的需要的东西生产(条件：你需要知道你要什么).
 *
 * Create to NULL  2019/1/6/16:35
 */
public class CondomFactory {

    public String getIstance(String name){
        if (name.equals("杜蕾斯")){
            return "你已获得"+ new Durex().getCondom();
        }else if (name.equals("杰士邦")){
            return "你已获得"+ new Jissbon().getCondom();
        }else{
            return "此工厂不生产"+name+"避孕套";
        }
    }
}
