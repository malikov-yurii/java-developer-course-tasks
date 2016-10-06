package module07.task02;

import module07.*;

import java.util.*;
import java.util.Currency;
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
                new Order(17, 22200, module07.Currency.UAH, "Lamp7", "Godman Store7", new User(1117, "Bob7", "Marley7", "Kamyzyak", 1007)),
                new Order(18, 11, module07.Currency.USD, "Lamp8", "Godman Store8", new User(1118, "Bob8", "Marley8", "Rovno", 1008))
        );

        orders.sort((o1, o2) -> o2.getPrice() - o1.getPrice());

        orders.sort((o1, o2) -> {
            int result = o1.getPrice() - o2.getPrice();
            if (result == 0)
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return result;
        });

        orders.sort((o1, o2) -> {
            int result = o1.getPrice() - o2.getPrice();
            if (result == 0) {
                result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (result == 0)
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return result;
        });

        orders = orders.stream().distinct().collect(Collectors.toList());

//      orders = orders.stream().filter(order -> order.getPrice() > 1500).collect(Collectors.toList());
        for (int i = 0; i < orders.size(); i++)
            if (orders.get(i).getPrice() < 1500)
                orders.remove(i);

        List<Order> uahCurrency = new ArrayList<>();
        List<Order> usdCurrency = new ArrayList<>();
        for (Order order : orders)
            if (order.getCurrency().equals(module07.Currency.UAH))
                uahCurrency.add(order);
            else
                usdCurrency.add(order);

        Map<String, List<Order>> ordersByCity = orders.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));

        for (Map.Entry<String, List<Order>> entry : ordersByCity.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
