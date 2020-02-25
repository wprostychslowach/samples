package with.generics;

import java.util.ArrayList;
import java.util.List;

class Simple {
    public static void main(String[] args) {
        ShoppingBasket<String> shoppingBasket = new ShoppingBasket();
        shoppingBasket.basket.add("Pizza");
        shoppingBasket.basket.add("Coca-cola");
        //shoppingBasket.basket.add(new StringBuilder("Beer").append(" and second beer")); // compile error
        shoppingBasket.showBasket();
    }
}

class ShoppingBasket<T> {
    List<T> basket = new ArrayList();

    void showBasket() {
        for(T p : basket) {
            System.out.println(p);
        }
    }
}