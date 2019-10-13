package com.wsa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.wsa.domain.Match;
import com.wsa.repository.MatchRepository;
import com.wsa.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

    private MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(final MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public Iterable<Match> getAllMatches()
    {

        return this.matchRepository.findAll();
//        return Flux.interval(Duration.ofSeconds(5))
//                .onBackpressureDrop()
//                .map(this::s)
//                .flatMapIterable(x -> x);
    }

    private List<Match> s(long interval) {
        return Lists.newArrayList(this.matchRepository.findAll());
    }
}
