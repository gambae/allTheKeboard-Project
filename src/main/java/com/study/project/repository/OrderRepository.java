package com.study.project.repository;

import com.study.project.entity.Order;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("select o from Order o " +
            "where o.member.id = :id " +
            "order by o.orderDate desc"
    )
    List<Order> findOrders(@Param("id") String id, Pageable pageable);

    @Query("select count(o) from Order o " +
            "where o.member.id = :id"
    )
    Long countOrder(@Param("id") String id);
}
