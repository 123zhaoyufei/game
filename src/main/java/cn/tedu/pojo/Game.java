package cn.tedu.pojo;

import org.springframework.stereotype.Repository;

/**
 * Created by tedu on 2017/11/26.
 */

public class Game {
    private Integer gId;
    private String gName;
    private Integer gClass;
    private double gScore;
    private String gPic;
    private Integer flag;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Integer getgClass() {
        return gClass;
    }

    public void setgClass(Integer gClass) {
        this.gClass = gClass;
    }

    public double getgScore() {
        return gScore;
    }

    public void setgScore(double gScore) {
        this.gScore = gScore;
    }

    public String getgPic() {
        return gPic;
    }

    public void setgPic(String gPic) {
        this.gPic = gPic;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}