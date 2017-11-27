package cn.tedu.service;

import cn.tedu.mapper.GameMapper;
import cn.tedu.pojo.GameInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tedu on 2017/11/27.
 */
@Service
public class GameServiceImpl implements GameService{
    @Autowired
    public GameMapper gameMapper;
    public GameInfo findOne(String gId) {
        return gameMapper.findOne("1");
    }
}
