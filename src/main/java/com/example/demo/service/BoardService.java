package com.example.demo.service;


import com.example.demo.dto.BoardRequestDto;
import com.example.demo.entity.Board;
import org.springframework.http.HttpStatus;
import com.example.demo.repository.BoardRepository;
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

    public ResponseEntity<?> saveBoard(BoardRequestDto requestDto) {
        System.out.println("Servicesss");
        Board board = boardRepository.save(new Board(requestDto));
        return new ResponseEntity<>(board.getBoardId(), HttpStatus.OK);
    }

    public ResponseEntity<?> deleteBoard(Long boardId) {
        Board board = boardRepository.getReferenceById(boardId);
        if(board.getBoardTitle().isEmpty()){
            return new ResponseEntity<>("board does not exist", HttpStatus.BAD_REQUEST);
        }
        boardRepository.deleteById(boardId);
        return new ResponseEntity<>("board {boardId} has been deleted!", HttpStatus.OK);
    }

    /*public ResponseEntity<?> editBoard(Long boardId, BoardRequestDto requestDto) {
        Board board = boardRepository.getReferenceById(boardId);
        board.update(requestDto.getBoardTitle(),requestDto.getBoardContent());

        boardRepository.deleteById(boardId);


    }*/
}
