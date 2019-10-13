package com.wsa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "player")
@Data @NoArgsConstructor @AllArgsConstructor
public class Player extends BaseEntity {

    private static final long serialVersionUID = 2582081452130467071L;

    private String firstName;
    private String surname;
}
