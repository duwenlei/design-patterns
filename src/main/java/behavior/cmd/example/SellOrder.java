package behavior.cmd.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName SellOrder
 * @Date 2023/9/6 16:44
 * @Description TODO
 */
public class SellOrder implements Order {
    @Override
    public void execute(Stock stock) {
        stock.sell();
    }
}
