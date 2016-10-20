package module07.task02;

import module07.*;
import module07.Currency;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(10, 11100, module07.Currency.UAH, "Lamp0", "Godman Store0", new User(1110, "Bob0", "Marley0", "Kiev", 1000)),
                new Order(10, 11100, module07.Currency.UAH, "Lamp0", "Godman Store0", new User(1110, "Bob0", "Marley0", "Kiev", 1000)),
                new Order(11, 12200, module07.Currency.USD, "Lamp1", "Godman Store222", new User(1111, "Bob1", "Marley1", "Rovno", 1001)),
                new Order(12, 12200, module07.Currency.UAH, "Lamp2", "Godman Store222", new User(1112, "Bob2", "Marley2", "Kiev", 1002)),
                new Order(13, 12200, module07.Currency.USD, "Lamp3", "Godman Store3", new User(1113, "Bob3", "Marley3", "Rovno", 1003)),
                new Order(14, 13300, module07.Currency.UAH, "Lamp4", "Godman Store4", new User(1114, "Bob4", "Marley4", "Kiev", 1004)),
                new Order(15, 12200, module07.Currency.UAH, "Lamp5", "Godman Store222", new User(1115, "Bob5", "Marley5", "Rovno", 1005)),
                new Order(16, 12200, module07.Currency.USD, "Lamp6", "Godman Store6", new User(1116, "Bob6", "Marley6", "Kiev", 1006)),
                new Order(137, 200, module07.Currency.UAH, "Lamp7", "Godman Store7", new User(1117, "Bob7", "Marley7", "Kamyzyak", 1007)),
                new Order(173, 20, module07.Currency.UAH, "Lamp7", "Godman Store7", new User(1117, "Bob7", "Marley7", "Kamyzyak", 1007)),
                new Order(17, 22200, module07.Currency.UAH, "Lamp7", "Godman Store7", new User(1117, "Bob7", "Marley7", "Kamyzyak", 1007)),
                new Order(18, 11, module07.Currency.USD, "Lamp8", "Godman Store8", new User(1118, "Bob8", "Marley8", "Rovno", 1008)),
                new Order(18, 11, module07.Currency.USD, "Lamp8", "Godman Store8", new User(1118, "Bob8", "Petrov", "Rovno", 1008))
        );
/*
        orders.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        System.out.println("\nOrders are sorted with price (with descending order): \n" + orders);

/////////////////////////////////////////////////////////////////////////////////////////////////

        orders.sort((o1, o2) -> {
            int result = o1.getPrice() - o2.getPrice();
            if (result == 0)
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return result;
        });
        System.out.println("\nOrders are sorted with price and city: \n" + orders);

/////////////////////////////////////////////////////////////////////////////////////////////////

        orders.sort((o1, o2) -> {
            int result = o1.getPrice() - o2.getPrice();
            if (result == 0) {
                result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (result == 0)
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return result;
        });
        System.out.println("\nOrders are sorted with price, shop and city: \n" + orders);

/////////////////////////////////////////////////////////////////////////////////////////////

        orders = new ArrayList<>(new HashSet<>(orders));

//      orders = orders.stream().distinct().collect(Collectors.toList());
        System.out.println("\nAll orders are unique now: \n" + orders);

/////////////////////////////////////////////////////////////////////////////////////////////

        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() < 1500)
                iterator.remove();
        }
//      orders = orders.stream().filter(order -> order.getPrice() > 1500).collect(Collectors.toList());
        System.out.println("\nOrders not less than 1500 price: \n" + orders);

/////////////////////////////////////////////////////////////////////////////////////////////////

*//*
        List<Order> uahCurrency = new ArrayList<>();
        List<Order> usdCurrency = new ArrayList<>();
        for (Order order : orders)
            if (order.getCurrency().equals(module07.Currency.UAH))
                uahCurrency.add(order);
            else
                usdCurrency.add(order);
*//*
        System.out.println("\nOrders by currency: \n");
        for (Map.Entry<Currency, List<Order>> entry : ordersByCurrency.entrySet())
            System.out.println(entry.getValue());

////////////////////////////////////////////////////////////////////////////////////////////////////

        Map<String, List<Order>> ordersByCity = orders.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
*//*
        Map<String, List<Order>> ordersByCity = new HashMap<>();
        for (Order order : orders) {
            if (!ordersByCity.containsKey(order.getUser().getCity()))
                ordersByCity.put(order.getUser().getCity(), new ArrayList<>());
            ordersByCity.get(order.getUser().getCity()).add(order);
        }
*//*
        System.out.println("\nOrders by city: \n");
        for (Map.Entry<String, List<Order>> entry : ordersByCity.entrySet()) {
            System.out.println(entry.getValue());
        }
        */

        /////////////////////////////////    9.1     ////////////////////////////////////////////////////////////////

        Comparator<Order> byPrice = (o1, o2) -> o2.getPrice() - o1.getPrice();
        System.out.println("\n       9.1\nOrders are sorted with price (with descending order): \n"
                + orders.stream().sorted(byPrice.reversed()).collect(Collectors.toList()));

        Comparator<Order> byCity = (o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity());
        System.out.println("\nOrders are sorted with price and city: \n" +
                orders.stream().sorted(byPrice.thenComparing(byCity)).collect(Collectors.toList()));

        Comparator<Order> byItemName = (o1, o2) -> o1.getItemName().compareTo(o2.getItemName());
        Comparator<Order> byShopIdentificator = (o1, o2) -> o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        System.out.println("\nOrders are sorted with itemName and shopName and city: \n" +
                orders.stream().sorted(byItemName.thenComparing(byShopIdentificator.thenComparing(byCity))).collect(Collectors.toList()));

        System.out.println("\nDuplicates are deleted: \n" +
                orders.stream().distinct().collect(Collectors.toList()));

        System.out.println("\nPrice less than 1500: \n");
        orders.stream().filter(order -> order.getPrice() < 1500).forEach(System.out::print);

        System.out.println("\nOrders by currency:");
        orders.stream()
                .collect(Collectors.groupingBy(order -> order.getCurrency()))
                .forEach((currency, ordersByCurrency) -> {
                    System.out.println("\n" + currency + " list:\n");
                    ordersByCurrency.forEach(System.out::print);
                });

        System.out.println("\nOrders by city:");
        orders.stream()
                .collect(Collectors.groupingBy(order -> order.getUser().getCity()))
                .forEach((city, ordersByCurrency) -> {
                    System.out.println("\n" + city + " list:\n");
                    ordersByCurrency.forEach(System.out::print);
                });

        System.out.println("\n" + (orders.stream().anyMatch(order -> "Petrov".equals(order.getUser().getLastName())) ?
        "Yes, we have order for Petrov." : "No, we have no order for Petrov."));

        System.out.println("\nUSD orders are deleted:\n\n" +
        orders.stream().filter(order -> !order.getCurrency().equals(Currency.USD)).collect(Collectors.toList()));
    }
}
