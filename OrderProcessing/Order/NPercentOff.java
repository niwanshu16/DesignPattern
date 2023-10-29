package DesignPattern.OrderProcessing.Order;

public class NPercentOff extends AmountDecorator {

    Order order;
    private Integer N;
    public NPercentOff(Order order, int N) {
        this.order = order;
        this.N = N;
    }
    @Override
    public double calculateAmount() {
        return (order.calculateAmount()*(100-N))/100;
    }
}
