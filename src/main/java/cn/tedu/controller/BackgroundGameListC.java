package cn.tedu.controller;

import cn.tedu.pojo.Game;
import cn.tedu.service.BackgroundGameListS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by tedu on 2017/11/26.
 */
@Controller
public class BackgroundGameListC {

    @Autowired
    private BackgroundGameListS bs;

    @RequestMapping("/gamelist")
    public String gamelist(Model model){
        List<Game> list = bs.findAll();
        model.addAttribute("games",list);
        return "/background/gamelist/index";
    }
    @RequestMapping("/edit")
    public String edit(Model model){
        List<Game> list = bs.findAll();
        model.addAttribute("games",list);
        return "/background/gamelist/edit";
    }
}
