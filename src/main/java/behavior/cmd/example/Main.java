package behavior.cmd.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Main
 * @Date 2023/9/6 16:46
 * @Description TODO
 */
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setName("Oracle");
        stock.setQuantity(100);

        Order buyOrder = new BuyOrder();
        Order sellOrder = new SellOrder();

        Broker broker = new Broker(stock);
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        broker.placeOrder();

    }
}
