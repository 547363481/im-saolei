package cn.appsys.dao;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DevUserDao {
    //登录
    public DevUser Login(@Param("devCode") String devCode, @Param("devPassword") String devPassword);
    //显示信息
    public List<AppInfo> AppInfoList();
}
