package ru.learnup.java27.repository;

import ru.learnup.java27.entity.OrderingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderingDetailsRepository extends JpaRepository<OrderingDetails, Long> {

}
