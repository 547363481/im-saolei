package cn.appsys.service;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.DevUser;

import java.util.List;

public interface DevUserService {
    //登录
    public DevUser Login(String devCode, String devPassword);
    //显示信息
    public List<AppInfo> AppInfoList();
}
