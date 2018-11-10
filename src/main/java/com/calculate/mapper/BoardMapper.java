package com.calculate.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.calculate.vo.BoardVO;

@Repository("com.calculate.mapper.BoardMapper")
public interface BoardMapper {
    
    public int testCount() throws Exception;
    
//    public List<BoardVO> boardList() throws Exception;
//    
//    public int boardInsert(BoardVO board) throws Exception;
//    
//    public BoardVO boardDetail(int board_no) throws Exception;
//    
//    public int boardUpdate(BoardVO board) throws Exception;
//    
//    public int boardDelete(int board_no) throws Exception;
//
//    public Map selectMap(Map map);

    public String getNow() throws Exception;

}
