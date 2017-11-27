package cn.tedu.mapper;

import cn.tedu.pojo.GameInfo;

/**
 * Created by tedu on 2017/11/25.
 */
public interface GameMapper {
    GameInfo findOne(String gId);
}
