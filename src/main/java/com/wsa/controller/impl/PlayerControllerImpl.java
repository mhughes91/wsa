package com.wsa.controller.impl;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsa.controller.PlayerController;
import com.wsa.domain.Player;
import com.wsa.dto.PlayerDto;
import com.wsa.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerControllerImpl implements PlayerController {

    private ModelMapper modelMapper;
    private PlayerService playerService;

    @Autowired
    public PlayerControllerImpl(final ModelMapper modelMapper, final PlayerService playerService) {
        this.modelMapper = modelMapper;
        this.playerService = playerService;
    }

    @GetMapping("/all")
    public Iterable<PlayerDto> getAllPlayers() {
        final List<Player> players =
                newArrayList(this.playerService.getAllPlayers());

        return players.stream()
                .map(player -> this.modelMapper.map(player, PlayerDto.class))
                .collect(Collectors.toList());
    }
}
