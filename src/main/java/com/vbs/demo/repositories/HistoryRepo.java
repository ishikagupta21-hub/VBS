package com.vbs.demo.repositories;


import com.vbs.demo.modals.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepo extends JpaRepository<History, Integer> {
}
