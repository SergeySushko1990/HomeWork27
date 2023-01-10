package ru.learnup.java27.services;

import ru.learnup.java27.entity.Buyer;
import ru.learnup.java27.repository.BuyerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    private final BuyerRepository buyerRepository;

    public BuyerService(BuyerRepository buyerRepository) {
        this.buyerRepository = buyerRepository;
    }

    public Buyer createBuyer(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    public List<Buyer> getBuyers() {
        return buyerRepository.findAll();
    }

    public Buyer getBuyerById(Long id) {
        return buyerRepository.getById(id) ;
    }
}
