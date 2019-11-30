package cn.appsys.dao;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackendUserDao {
    //登录
    public BackendUser Login(@Param("userCode")String userCode, @Param("userPassword")String userPassword);
    //显示信息
    public List<AppInfo> AppInfoList();
}
