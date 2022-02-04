package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private Order order;
    private InformationService informationService;
    private TransportService transportService;
    private OrderRepository orderRepository;

    public ProductOrderService(final Order order,
                               final TransportService transportService,
                               final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.order = order;
        this.transportService = transportService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public void processOrder() {
        transportService.process(order.getBuyer().getUserAdress(), order.getSeller().getUserAdress());
        informationService.process();
        orderRepository.saveToDatabase();
    }
}
