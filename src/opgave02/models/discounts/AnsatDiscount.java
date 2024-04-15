package opgave02.models.discounts;

import opgave02.models.Order;

public class AnsatDiscount implements DiscountStrategy{
    @Override
    public int calculatePrice(Order order) {
        return (int) (order.getTotalPrice() * 0.9);
    }
}
