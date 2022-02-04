package com.producter.demo.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;

import javax.validation.Valid;

import com.producter.demo.model.InputPlayerAdd;
import com.producter.demo.model.Player;
import com.producter.demo.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@Component
public class PlayerMutationResolver implements GraphQLMutationResolver {
    @Autowired
    private PlayerRepository playerRepository;
    private int MAX_CAPACITY = 100;

    public Player addPlayer(@Valid InputPlayerAdd inputPlayerAdd) {
        Player p = inputPlayerAdd.toPlayer();
        if (playerRepository.findPlayerNumber() < MAX_CAPACITY) {
            return playerRepository.save(p);
        }
        return p;
    }

    public Player deletePlayer(int id) {
        Player p = playerRepository.findById(id).orElse(null);
        if (p != null) {
            playerRepository.delete(p);
        }
        return p;
    }
}