package com.calculate.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calculate.service.BoardService;
import com.calculate.vo.BoardVO;

@Controller
public class BoardController {
    
    private static Logger log = LogManager.getLogger("LOGIN_LOG"); 
    
    @Resource(name="com.calculate.service.BoardService")
    BoardService boardService;    
    
    @RequestMapping("/")
    private String test(Model model) throws Exception {
        log.info(boardService.getNow());
        return "hello";
    }
    
    @RequestMapping("/list")
    private String boardList(Model model) throws Exception {
        model.addAttribute("list", boardService.testCount());
        log.info(boardService.testCount());
        return "";
    }
    
//    @RequestMapping("/list")
//    private String boardList(Model model) throws Exception {
//        model.addAttribute("list", boardService.boardListService());
//        log.info(boardService.boardListService().toString());
//        return "list";
//    }
//    
//    @RequestMapping("/gisMain")
//    private String gisMain(Model model) throws Exception {
//        Map<String,String>  tMap = new HashMap<String,String>();
//        tMap.put("fcltyNm", tMap.get("f3C01B06MNm"));
//        model.addAttribute("data", boardService.getSelectMap("hm_hist.fcltyMatrlCode", tMap));
////        model.addAttribute("userInfo", userInfo);
//        return "gisMain";
//    }
//    
//    @RequestMapping("/detail/{bno}")
//    private String boardDetail(@PathVariable int bno, Model model) throws Exception {
//        model.addAttribute("detail", boardService.boardDetailService(bno));
//        return "detail";
//    }
//    
//    @RequestMapping("/insert")
//    private String boardInsert(Model model) throws Exception {
//        return "insert";
//    }
//    
//    @RequestMapping("/insertProc")
//    private String boardInsertProc(HttpServletRequest request) throws Exception {
//        
//        BoardVO board = new BoardVO();
//        
//        board.setBoard_no(boardService.boardTotalCount());
//        board.setSubject(request.getParameter("subject"));
//        board.setContent(request.getParameter("content"));
//        board.setWriter(request.getParameter("writer"));
//        
//        log.debug(board.toString());
//
//        int insert = boardService.boardInsertService(board);
//        
//        log.debug("insert yn => " + insert);
//        
//        return "redirect:/list";
//    }
//    
//    @RequestMapping("/delete/{bno}")
//    private String boardInsert(@PathVariable int bno, Model model) throws Exception {
//        
//        int delete = boardService.boardDeleteService(bno);
//        
//        log.debug("delete yn => " + delete);
//        
//        return "redirect:/list";
//    }

}
