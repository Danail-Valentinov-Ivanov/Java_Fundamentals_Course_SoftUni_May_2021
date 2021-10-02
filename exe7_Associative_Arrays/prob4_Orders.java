package exe7_Associative_Arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class prob4_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<Double>> mapProducts = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String[] currentProduct = input.split(" ");
            String nameProduct = currentProduct[0];
            double priceProduct = Double.parseDouble(currentProduct[1]);
            int quantityProduct = Integer.parseInt(currentProduct[2]);
            List<Double> listPriceAndQuantity = new ArrayList<>();
            if (!mapProducts.containsKey(nameProduct)) {
                listPriceAndQuantity.add(priceProduct);
                listPriceAndQuantity.add((double) quantityProduct);
                mapProducts.put(nameProduct, listPriceAndQuantity);
            } else {
                listPriceAndQuantity = mapProducts.get(nameProduct);
                if (priceProduct != listPriceAndQuantity.get(0)) {
                    listPriceAndQuantity.set(0, priceProduct);
                }
                listPriceAndQuantity.set(1, listPriceAndQuantity.get(1) + quantityProduct);
                mapProducts.put(nameProduct, listPriceAndQuantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> e : mapProducts.entrySet()) {
            double totalPriceProduct = e.getValue().get(0) * e.getValue().get(1);
            System.out.printf("%s -> %.2f\n", e.getKey(), totalPriceProduct);
        }
    }
}
