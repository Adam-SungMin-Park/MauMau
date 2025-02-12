package com.example.demo.entity;

import com.example.demo.dto.BoardRequestDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column
    private String boardTitle;

    @Column
    private String boardContent;

    public Board(BoardRequestDto requestDto){
        this.boardTitle = requestDto.getBoardTitle();
        this.boardContent = requestDto.getBoardContent();
    }

    public void update(@NotNull BoardRequestDto requestDto) {
        this.boardContent =requestDto.getBoardContent();
        this.boardTitle = requestDto.getBoardTitle();
    }
}
