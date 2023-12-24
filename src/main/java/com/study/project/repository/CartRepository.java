package com.study.project.repository;

import com.study.project.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
    Cart findByMemberId(String memberId);
}
