package cn.appsys.service;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.BackendUser;

import java.util.List;

public interface BackendUserService {
    //登录
    public BackendUser Login(String userCode, String userPassword);
    //显示信息
    public List<AppInfo> AppInfoList();
}
