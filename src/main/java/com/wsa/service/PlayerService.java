package com.wsa.service;

import java.util.Optional;

import com.wsa.domain.Player;

public interface PlayerService {
    Iterable<Player> getAllPlayers();

    Optional<Player> getPlayerById(final Integer id);
}
