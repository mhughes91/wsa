package com.wsa.service;

import com.wsa.domain.Match;
import reactor.core.publisher.Flux;

public interface MatchService {

    Iterable<Match> getAllMatches();
}
