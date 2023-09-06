package behavior.cmd.example;

/**
 * @author duwenlei
 * @version 1.0
 * @ClassName Stock
 * @Date 2023/9/6 16:42
 * @Description TODO
 */
public class Stock {
    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("buy " + name);
    }

    public void sell() {
        System.out.println("sell " + name);
    }
}
