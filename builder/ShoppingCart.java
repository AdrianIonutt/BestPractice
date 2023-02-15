package builder;

import builder.Address;
import builder.Item;

import java.util.List;

public class ShoppingCart {
    private int id;
    private double cost;
    private double shippingRate;
    private Address address;
    private List<Item> list;

    public ShoppingCart(){};

    public ShoppingCart(int id, double cost, double shippingRate, Address address, List<Item> list) {
        this.id = id;
        this.cost = cost;
        this.shippingRate = shippingRate;
        this.address = address;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getShippingRate() {
        return shippingRate;
    }

    public void setShippingRate(double shippingRate) {
        this.shippingRate = shippingRate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
}