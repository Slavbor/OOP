package HW_2_1;

public abstract class Actor implements ActorBehavior {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {
        System.out.println(name + " - заказ сделан.");
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        System.out.println(name + " - заказ отдан.");
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}