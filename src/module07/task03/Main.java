package module07.task03;

import module07.*;
import module07.Currency;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Order> orders = new TreeSet<>(Arrays.asList(
                new Order(10, 11100, module07.Currency.UAH, "Lamp", "Godman Store0", new User(1110, "Bob0", "Marley0", "Kiev", 1000)),
                new Order(10, 11100, module07.Currency.UAH, "Lamp0", "Godman Store0", new User(1110, "Bob0", "Marley0", "Kiev", 1000)),
                new Order(11, 12200, module07.Currency.USD, "Lamp1", "Godman Store222", new User(1111, "Bob1", "Petrov", "Rovno", 1001)),
                new Order(12, 12200, module07.Currency.UAH, "Lamp2", "Godman Store222", new User(1112, "Bob2", "Marley2", "Kiev", 1002)),
                new Order(13, 12200, module07.Currency.USD, "Lamp3", "Godman Store3", new User(1113, "Bob3", "Marley3", "Rovno", 1003)),
                new Order(14, 13300, module07.Currency.UAH, "Lamp4", "Godman Store4", new User(1114, "Bob4", "Marley4", "Kiev", 1004)),
                new Order(15, 12200, module07.Currency.UAH, "Lamp5", "Godman Store222", new User(1115, "Bob5", "Marley5", "Rovno", 1005)),
                new Order(15, 12200, module07.Currency.UAH, "Lamp5", "Godman Store222", new User(1115, "Bob5", "Marley5", "Rovno", 1005)),
                new Order(18, 11, module07.Currency.USD, "Lamp8", "Godman Store8", new User(1118, "Bob8", "Marley8", "Rovno", 1008)),
                new Order(18, 11, module07.Currency.USD, "Lamp8", "Godman Store8", new User(1118, "Bob8", "Marley8", "Rovno", 1008))
        ));

        System.out.println(orders.stream().anyMatch(order -> "Petrov".equals(order.getUser().getLastName())));
        System.out.println(orders.stream().max(((o1, o2) -> o1.getPrice() - o2.getPrice())).get());

        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext())
            if (iterator.next().getCurrency().equals(Currency.USD))
                iterator.remove();
        System.out.println(orders);
    }
}
