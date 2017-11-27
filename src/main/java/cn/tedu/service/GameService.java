package cn.tedu.service;

import cn.tedu.pojo.GameInfo;

/**
 * Created by tedu on 2017/11/27.
 */
public interface GameService {
    GameInfo findOne(String gId);
}
