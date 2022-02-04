package com.producter.demo.repository;

import com.producter.demo.model.Player;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
    @Query(value = "SELECT COUNT(*) FROM Player")
    public int findPlayerNumber();
}
