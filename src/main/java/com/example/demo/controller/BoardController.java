package com.example.demo.controller;

import com.example.demo.dto.BoardRequestDto;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping
    public ResponseEntity<?> getMainBoard(){
        System.out.println("Board Controller being called");
        return boardService.getBoard();
    };

    @PostMapping("/save")
    public ResponseEntity<?> saveBoard (@RequestBody BoardRequestDto requestDto){
        System.out.println("Controller");
        return boardService.saveBoard(requestDto);
    }

    @DeleteMapping("/{boardId}")
    public ResponseEntity<?> deleteBoard(@PathVariable Long boardId){
        System.out.printf("%d has been called",boardId);
        return boardService.deleteBoard(boardId);
    }

    @PutMapping("/edit/{boardId}")
    public ResponseEntity<?> editBoard(@PathVariable Long boardId, @RequestBody BoardRequestDto requestDto){
        return boardService.editBoard(boardId,requestDto);
    }

    /*@PutMapping("/edit")
    public ResponseEntity<?> editBoard(Long boardId,BoardRequestDto requestDto){
        return boardService.editBoard(boardId,requestDto);
    }*/


}

