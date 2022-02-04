package com.producter.demo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import com.producter.demo.model.Player;
import com.producter.demo.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private PlayerRepository playerRepository;

    public Iterable<Player> listAllPlayers() {
        return playerRepository.findAll();
    }
}
