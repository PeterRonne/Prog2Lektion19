package opgave02.models;

import opgave02.models.discounts.DiscountStrategy;
import opgave02.models.products.Beer;

public class Customer {
    private BarTab tab;
    private DiscountStrategy strategy;

    public Customer(DiscountStrategy strategy) {
        this.strategy = strategy;
        this.tab = new BarTab();
    }

    public void placeOrder(Order order) {
        int ajustedPrice = strategy.calculatePrice(order);
        tab.addItem(new BarTabItem(order, ajustedPrice));
    }

    public BarTab getBarTab() {
        return tab;
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
}
