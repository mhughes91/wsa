package com.wsa.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PlayerDto extends BaseEntityDto {

    private static final long serialVersionUID = -8452574434801794281L;

    private String firstName;
    private String surname;
}
