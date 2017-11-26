package cn.tedu.service;

import cn.tedu.mapper.BackgroundGameListM;
import cn.tedu.pojo.Game;
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

}
