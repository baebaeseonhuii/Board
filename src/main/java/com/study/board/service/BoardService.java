package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    //write posts
    public void write(Board board) {
    boardRepository.save(board);
    }

    //list the posts
    public List<Board> boardList() {

        return boardRepository.findAll();

    }

    //call posts
    public Board boardView(Integer id) {
        return boardRepository.findById(id).get();
    }

    //delete post

    public void boardDelete(Integer id) {
        boardRepository.deleteById(id);
    }
}
