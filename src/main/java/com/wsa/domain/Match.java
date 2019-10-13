package com.wsa.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "match")
@Data @NoArgsConstructor @AllArgsConstructor
public class Match extends BaseEntity {

    private static final long serialVersionUID = 9223095435752621395L;

    @OneToOne
    @JoinColumn(name = "FK_PlayerOneID")
    private Player firstPlayer;

    @OneToOne
    @JoinColumn(name = "FK_PlayerTwoID")
    private Player secondPlayer;
}
