package behavior.cmd.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Broker
 * @Date 2023/9/6 16:45
 * @Description TODO
 */
public class Broker {
    private Stock stock;
    private List<Order> orders = new ArrayList<>();

    public Broker(Stock stock) {
        this.stock = stock;
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        orders.stream().forEach(e -> {
            e.execute(stock);
        });
    }
}
