package service;


import entity.Board;
import repository.BoardRepository;
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

    /*public void addBoard(List<Board> boardList, List<BoardResponseDto> boardResponseDto){
        System.out.println(boardList);
        for (Board board : boardList){
            /*if(board.getBoardContent() == null || board.getBoardTitle() == null){
                boardList.remove(board);
                continue;
            }
            boardResponseDto.add(new BoardResponseDto(board));
        }
        new ResponseEntity<>(boardResponseDto, HttpStatus.OK);
    }*/

    /*public ResponseEntity<?> saveBoard(Member member) {
        List<Board> boardList = boardRepository.findAllByMemberId(member);
        Board board = boardRepository.save(new Board(member));
        return new ResponseEntity<>(board.getBoardId(),HttpStatus.OK);
    }*/


}
