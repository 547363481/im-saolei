package cn.appsys.service.impl;

import cn.appsys.dao.DevUserDao;
import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserDao devUserDao;

    //登录操作
    @Override
    public DevUser Login(String devCode, String devPassword) {
        return devUserDao.Login(devCode, devPassword);
    }

    //显示信息操作
    @Override
    public List<AppInfo> AppInfoList() {
        return devUserDao.AppInfoList();
    }
}
