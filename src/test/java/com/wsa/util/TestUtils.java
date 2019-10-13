package com.wsa.util;

import com.wsa.domain.Player;
import com.wsa.dto.PlayerDto;

public class TestUtils {

    public static Player createPlayer(final Integer id, final String firstName, final String surname) {
        final Player player = new Player(firstName, surname);
        player.setId(id);

        return player;
    }

    public static PlayerDto createPlayerDto(final Integer id, final String firstName, final String surname) {
        final PlayerDto playerDto = new PlayerDto(firstName, surname);
        playerDto.setId(id);

        return playerDto;
    }
}
