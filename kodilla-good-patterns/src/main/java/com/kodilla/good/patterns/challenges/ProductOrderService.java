package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    //private OrderRequest orderRequest;
    private InformationService informationService;
    private TransportService transportService;
    private OrderRepository orderRepository;

    public ProductOrderService(final TransportService transportService,
                               final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.transportService = transportService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public void processOrder(String recipientAdress, String senderAdress) {
        transportService.process(recipientAdress, senderAdress);
        informationService.process();
        orderRepository.saveToDatabase();
    }
}
