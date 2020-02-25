package without.generics;

import java.util.ArrayList;
import java.util.List;

class Simple {
    public static void main(String[] args) {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.basket.add("Pizza");
        shoppingBasket.basket.add("Coca-cola");
        shoppingBasket.basket.add(new StringBuilder("Beer").append(" and second beer"));
        shoppingBasket.showBasket();
    }
}

class ShoppingBasket {
    List basket = new ArrayList();

    void showBasket() {
        for(int i=0; i<basket.size(); i++) {
            String product = (String) basket.get(i);
            System.out.println(product);
        }
    }
}