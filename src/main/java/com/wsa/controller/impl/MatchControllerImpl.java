package com.wsa.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsa.controller.MatchController;
import com.wsa.domain.Match;
import com.wsa.service.MatchService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/match")
public class MatchControllerImpl implements MatchController {

    private MatchService matchService;

    @Autowired
    public MatchControllerImpl(final MatchService matchService) {
        this.matchService = matchService;
    }

    @Override
//    @GetMapping(path = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @GetMapping("/all")
    public Iterable<Match> getAllMatches() {
        return this.matchService.getAllMatches();
    }
}
