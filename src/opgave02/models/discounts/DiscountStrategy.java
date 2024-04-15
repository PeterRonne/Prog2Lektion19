package opgave02.models.discounts;

import opgave02.models.Order;

public interface DiscountStrategy {
    public int calculatePrice(Order order);
}
