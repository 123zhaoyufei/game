package cn.tedu.service;

import cn.tedu.mapper.BackgroundGameListM;
import cn.tedu.pojo.Game;
import cn.tedu.pojo.GameInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tedu on 2017/11/26.
 */
@Service
public class BackgroundGameListSImpl implements BackgroundGameListS {

    @Autowired
    private BackgroundGameListM bm;

    public List<Game> findAll() {
        return bm.findAll();
    }

    public GameInfo findOneGameInfo(Integer gId) {
        return bm.findOneGameInfo(gId);
    }

    public void savegl(GameInfo gameInfo) {
        bm.saveGameInfo(gameInfo);
        bm.saveGameList(gameInfo);
    }
}
