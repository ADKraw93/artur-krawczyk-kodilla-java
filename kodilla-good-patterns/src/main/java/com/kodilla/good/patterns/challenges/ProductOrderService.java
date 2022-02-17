package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public void processOrder(Order order) {
        order.getTransportMethod().process(order.getBuyer().getUserAdress(), order.getSeller().getUserAdress());
        informationService.process();
        orderRepository.saveToDatabase();
    }
}
