package com.wsa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class MatchDto extends BaseEntityDto {

    private static final long serialVersionUID = 3935101000635130388L;

    private PlayerDto playerOne;
    private PlayerDto playerTwo;
}
