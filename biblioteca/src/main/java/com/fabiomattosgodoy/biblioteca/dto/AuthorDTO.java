package com.fabiomattosgodoy.biblioteca.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String nome;

    @NonNull
    @Size(max = 100)
    private Integer idade;
}
