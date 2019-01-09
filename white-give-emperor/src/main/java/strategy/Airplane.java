package strategy;

/**
 * 飞机.
 *
 * @ClassName Airplane.
 * Create by Null on 2019/1/9/21:40
 **/
public class Airplane implements Vehicle {
    @Override
    public String tool() {
        return "你已乘坐飞机到达";
    }
}
