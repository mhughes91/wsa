package com.wsa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "player")
@Getter @Setter @NoArgsConstructor
public class Player extends BaseEntity {

    private static final long serialVersionUID = 2582081452130467071L;

    private String firstName;
    private String surname;
}
