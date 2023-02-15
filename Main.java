import builder.Address;
import builder.Address.AddressBuilder;
import builder.Item;
import builder.Item.ItemBuilder;
import builder.ShoppingCart;
import singleton.CountSingleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = AddressBuilder.builder()
                .setAddress("Caione")
                .setCountry("Italy")
                .setPostalCode("11")
                .build();

        Item item1 = ItemBuilder.builder().setCost(2.3d).build();
    }
}
