package esercizio;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private final Long id;
    private final String status;
    private final LocalDate orderDate;
    private final LocalDate deliveryDate;
    private final Customer customer;
    List<Product> products;

    public Order(List<Product> products, Long id, String status, LocalDate orderDate, LocalDate deliveryDate, Customer customer) {
        this.products = products;
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }
}
