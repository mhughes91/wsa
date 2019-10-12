package com.wsa.controller;

import com.wsa.dto.PlayerDto;

public interface PlayerController {

    Iterable<PlayerDto> getAllPlayers();
}
