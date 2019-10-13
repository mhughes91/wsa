package com.wsa.controller;

import com.wsa.domain.Match;
import reactor.core.publisher.Flux;

public interface MatchController {

    Iterable<Match> getAllMatches();
}
