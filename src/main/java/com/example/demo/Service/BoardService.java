package com.example.demo.Service;


import com.example.demo.Entity.Board;
import com.example.demo.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public ResponseEntity<?> getBoard() {
        List<Board> boards = boardRepository.findAll();
        return ResponseEntity.ok(boards);
    };

}
