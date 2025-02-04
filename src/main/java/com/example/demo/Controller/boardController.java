package com.example.demo.Controller;

import com.example.demo.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class boardController {
    private final BoardService boardService;

    public boardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public ResponseEntity<?> getMainBoard(){
        System.out.println("Board Controller being called");
        return boardService.getBoard();
    };




}

