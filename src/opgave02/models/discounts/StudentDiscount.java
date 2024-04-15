package opgave02.models.discounts;

import opgave02.models.Order;
import opgave02.models.products.Beer;

public class StudentDiscount implements DiscountStrategy{
    @Override
    public int calculatePrice(Order order) {
        if (order.getProduct() instanceof Beer beer) {
            return order.getTotalPrice() - order.getCount() * 5;
        }
        return order.getTotalPrice();
    }
}
