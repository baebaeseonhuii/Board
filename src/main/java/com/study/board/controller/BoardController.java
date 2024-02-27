package com.study.board.controller;

import com.study.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {

    @GetMapping("/board/write") //localhost:8080/board/write
    public String boardWriteForm() {

        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(@RequestParam(name = "title") String title,  @RequestParam(name = "content") String content) {

        System.out.println(title);
        System.out.println(content);
        return "";
    }

}
