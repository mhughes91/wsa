package com.wsa.repository;

import org.springframework.data.repository.CrudRepository;

import com.wsa.domain.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {}