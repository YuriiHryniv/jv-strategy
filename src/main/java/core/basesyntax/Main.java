package core.basesyntax;

import core.basesyntax.strategy.DiscountService;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new DiscountStrategy();
        DiscountService discountService = strategy.getDiscountServiceBySpecialEvent("Black Friday");
        double discount = discountService.getDiscount();
        System.out.println(discount);
    }
}
