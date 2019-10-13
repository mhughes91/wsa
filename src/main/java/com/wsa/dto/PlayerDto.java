package com.wsa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class PlayerDto extends BaseEntityDto {

    private static final long serialVersionUID = -8452574434801794281L;

    private String firstName;
    private String surname;
}
