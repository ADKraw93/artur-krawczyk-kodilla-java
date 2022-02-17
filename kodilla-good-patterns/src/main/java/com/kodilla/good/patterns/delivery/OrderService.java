package com.kodilla.good.patterns.delivery;

public class OrderService {
    private Seller seller;

    public OrderService(Seller seller) {
        this.seller = seller;
    }

    public void processOrder(Order order){
        seller.process(order);
        System.out.println("Zamówienie zapisano w bazie danych.");
        System.out.println("Wysłano potwierdzenie do: " + order.getUser().getName() + " na adres e-mail: " + order.getUser().getEmail());
        System.out.println("Proces zamówienia przebiegł pomyślnie.");
    }
}
