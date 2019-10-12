package com.wsa.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsa.domain.Player;
import com.wsa.repository.PlayerRepository;
import com.wsa.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(final PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Iterable<Player> getAllPlayers() {
        return this.playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(final Integer id) {
        return this.playerRepository.findById(id);
    }
}
