package strategy;

/**
 * 交通工具枚举类.
 */
public enum VechiecGrop{
    AIRPLANE(new Airplane()),
    FE(new Fe());

    public Vehicle vehicle;

    VechiecGrop(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle get() {
        return this.vehicle;
    }
}
