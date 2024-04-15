package opgave02.models.discounts;

import opgave02.models.Order;

public class NormalDiscount implements DiscountStrategy{
    @Override
    public int calculatePrice(Order order) {
        return order.getTotalPrice();
    }
}
