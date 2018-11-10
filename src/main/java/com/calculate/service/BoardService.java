package com.calculate.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.calculate.mapper.BoardMapper;
import com.calculate.vo.BoardVO;

@Service("com.calculate.service.BoardService")
public class BoardService {
    
    @Resource(name="com.calculate.mapper.BoardMapper")
    BoardMapper boardMapper;
    
    public String getNow() throws Exception {
        return boardMapper.getNow();
    }
    
    public int testCount() throws Exception {
    	return boardMapper.testCount();
    }
    
//    public List<BoardVO> boardListService() throws Exception{
//        return boardMapper.boardList();
//    }
//    
//    public BoardVO boardDetailService(int board_no) throws Exception {
//        return boardMapper.boardDetail(board_no);
//    }
//    
//    public int boardInsertService(BoardVO board) throws Exception {
//        return boardMapper.boardInsert(board);
//    }
//    
//    public int boardUpdateService(BoardVO board) throws Exception {
//        return boardMapper.boardUpdate(board);
//    }
//    
//    public int boardDeleteService(int board_no) throws Exception {
//        return boardMapper.boardDelete(board_no);
//    }
//    
//    public int boardTotalCount() throws Exception {
//        return boardMapper.boardCount();
//    }
//
//    public Map getSelectMap(String string, Map<String, String> tMap) {
//        Map resultMap = null;
//        try {
//            return (Map) boardMapper.selectMap(tMap);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return resultMap;
//    }

}
