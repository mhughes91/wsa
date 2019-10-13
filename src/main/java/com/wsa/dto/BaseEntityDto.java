package com.wsa.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class BaseEntityDto implements Serializable {

    private static final long serialVersionUID = 3788074865484284582L;

    private Integer id;
    private int version;
}