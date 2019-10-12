package com.wsa.controller;

import com.wsa.dto.PlayerDto;
import javassist.NotFoundException;

public interface PlayerController {
    Iterable<PlayerDto> getAllPlayers();

    PlayerDto getPlayerById(final Integer id) throws NotFoundException;
}
