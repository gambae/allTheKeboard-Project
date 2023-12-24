package com.study.project.repository;

import com.study.project.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

    // 데이터베이스에 해당 id를 가진 데이터를 조회하는 select
    Member findById(String id);
}
