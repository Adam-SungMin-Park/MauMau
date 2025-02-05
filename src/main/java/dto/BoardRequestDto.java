package dto;

import lombok.Getter;
import jakarta.validation.constraints.NotNull;
import lombok.Setter;

@Getter
@Setter
public class BoardRequestDto {

    @NotNull
    private String boardTitle;

    @NotNull
    private String boardContent;

}
