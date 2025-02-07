package com.example.demo.dto;

import lombok.Getter;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {

    @NotNull
    private String boardTitle;

    @NotNull
    private String boardContent;

}
