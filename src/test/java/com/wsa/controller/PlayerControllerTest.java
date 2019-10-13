package com.wsa.controller;

import static com.google.common.collect.Lists.newArrayList;
import static com.wsa.util.TestUtils.createPlayer;
import static com.wsa.util.TestUtils.createPlayerDto;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.google.common.collect.Lists;
import com.wsa.controller.impl.PlayerControllerImpl;
import com.wsa.domain.Player;
import com.wsa.dto.PlayerDto;
import com.wsa.service.PlayerService;
import com.wsa.util.TestUtils;
import javassist.NotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class PlayerControllerTest {

    @Mock
    private PlayerService playerService;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private PlayerControllerImpl playerControllerImpl;

    @Test
    public void testGetAllPlayers() {
        final Player firstPlayer = createPlayer(1, "First", "Player");
        final Player secondPlayer = createPlayer(2, "Second", "Player");
        final List<Player> players = newArrayList(firstPlayer, secondPlayer);

        final PlayerDto firstPlayerDto = createPlayerDto(1, "First", "Player");
        final PlayerDto secondPlayerDto = createPlayerDto(2, "Second", "Player");

        when(this.playerService.getAllPlayers()).thenReturn(players);
        when(this.modelMapper.map(firstPlayer, PlayerDto.class)).thenReturn(firstPlayerDto);
        when(this.modelMapper.map(secondPlayer, PlayerDto.class)).thenReturn(secondPlayerDto);

        final List<PlayerDto> result = newArrayList(this.playerControllerImpl.getAllPlayers());
        assertThat(result.size(), is(2));
        assertThat(result.get(0), is(firstPlayerDto));
        assertThat(result.get(1), is(secondPlayerDto));
    }

    @Test
    public void shouldGetPlayerById() throws NotFoundException {
        final Optional<Player> firstPlayerOptional =
                Optional.of(createPlayer(1, "First", "Player"));

        final Player firstPlayer = firstPlayerOptional.get();
        final PlayerDto firstPlayerDto = createPlayerDto(1, "First", "Player");

        when(this.playerService.getPlayerById(1)).thenReturn(firstPlayerOptional);
        when(this.modelMapper.map(firstPlayer, PlayerDto.class)).thenReturn(firstPlayerDto);

        final PlayerDto result = this.playerControllerImpl.getPlayerById(1);
        assertThat(result, is(firstPlayerDto));
    }
}