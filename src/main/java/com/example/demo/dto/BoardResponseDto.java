package com.example.demo.dto;

import com.example.demo.entity.Board;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardResponseDto {

    private String boardTitle;

    private String boardContent;

    public BoardResponseDto(Board board){
        this.boardContent = board.getBoardContent();
        this.boardTitle = board.getBoardTitle();
    }
}
