package controller;

import service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

  /*  @PostMapping("/board/save")
    public ResponseEntity<?> saveBoard (Member member){
        return boardService.saveBoard(member);
    }

*/
}

