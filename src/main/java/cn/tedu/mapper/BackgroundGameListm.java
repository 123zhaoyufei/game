package cn.tedu.mapper;

import cn.tedu.pojo.Game;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by tedu on 2017/11/26.
 */

public interface BackgroundGameListM {
    @Select("select * from game_list")
    public List<Game> findAll();

    public List<Game> gameList();
}
