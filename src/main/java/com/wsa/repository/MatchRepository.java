package com.wsa.repository;

import org.springframework.data.repository.CrudRepository;

import com.wsa.domain.Match;

public interface MatchRepository extends CrudRepository<Match, Integer> {}