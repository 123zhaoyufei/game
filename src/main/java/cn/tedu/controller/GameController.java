package cn.tedu.controller;

import cn.tedu.pojo.GameInfo;
import cn.tedu.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tedu on 2017/11/25.
 */
@Controller
public class GameController {
    @Autowired
    private GameService gameService;
    @RequestMapping("/toview")
    public String toview(Model model){
        GameInfo gameInfo = gameService.findOne("1");
        model.addAttribute("gameInfo",gameInfo);
        return "gameInfo";
    }
}
