package ru.learnup.java27.services;

import ru.learnup.java27.entity.OrderingDetails;
import ru.learnup.java27.repository.OrderingDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderingDetailsService {

    private final OrderingDetailsRepository orderingDetailsRepository;

    public OrderingDetailsService(OrderingDetailsRepository orderingDetailsRepository) {
        this.orderingDetailsRepository = orderingDetailsRepository;
    }

    public OrderingDetails createOrderingDetails(OrderingDetails orderingDetails) {
        return orderingDetailsRepository.save(orderingDetails);
    }

    public List<OrderingDetails> getOrderingDetails() {
        return orderingDetailsRepository.findAll();
    }

    public OrderingDetails getOrderingDetailsById(Long id) {
        return orderingDetailsRepository.getById(id) ;
    }
}
