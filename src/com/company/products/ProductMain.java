package com.company.products;

import com.company.enums.ProductTypes;

import java.util.Arrays;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product(1, "apple_red", ProductTypes.FRUIT, 30);
        Product product2 = new Product(2, "apple_green", ProductTypes.FRUIT, 35);
        Product product3 = new Product(3, "apple_great", ProductTypes.FRUIT, 50);
        Product product4 = new Product(4, "orange", ProductTypes.FRUIT, 30);
        Product product5 = new Product(5, "orange_great", ProductTypes.FRUIT, 60);
        Product product6 = new Product(6, "potato", ProductTypes.VEGETABLES, 10);
        Product product7 = new Product(7, "tomato", ProductTypes.VEGETABLES, 50);
        Product product8 = new Product(8, "tomato_great", ProductTypes.VEGETABLES, 70);
        Product product9 = new Product(9, "pork", ProductTypes.MEAT, 120);
        Product product10 = new Product(10, "beef", ProductTypes.MEAT, 200);
        Product product11 = new Product(11, "beef_great", ProductTypes.MEAT, 250);

        Product [] products = {product1, product2, product3, product4, product5, product6, product7, product8, product9, product10, product11};
        Product [] withTypeFruit = new Product[products.length];
        Product [] withTypeVegetables = new Product[products.length];
        Product [] withTypeMeat = new Product[products.length];

        int lessThan100PriceCount = 0;
        int withGreatInNameCount = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getType().equals(ProductTypes.FRUIT)) {
                withTypeFruit[i] = products[i];
            }

            if (products[i].getType().equals(ProductTypes.VEGETABLES)) {
                withTypeVegetables[i] = products[i];
            }

            if (products[i].getType().equals(ProductTypes.MEAT)) {
                withTypeMeat[i] = products[i];
            }

            if (products[i].getPrice() < 100) {
                lessThan100PriceCount = lessThan100PriceCount + 1;
            }

            if (products[i].getName().matches("(.*)great(.*)")) {
                withGreatInNameCount = withGreatInNameCount + 1;
            }
        }

        System.out.println("All products: " + Arrays.toString(products));
        System.out.println("Fruit: " + Arrays.toString(withTypeFruit));
        System.out.println("Vegetables: " + Arrays.toString(withTypeVegetables));
        System.out.println("Meat: " + Arrays.toString(withTypeMeat));
        System.out.println("With price less than 100 count: " + lessThan100PriceCount);
        System.out.println("With Great in name count: " + withGreatInNameCount);

    }
}
