package cn.appsys.service.impl;

import cn.appsys.dao.BackendUserDao;
import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.BackendUser;
import cn.appsys.service.BackendUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BackendUserServiceImpl implements BackendUserService {
    @Resource
    private BackendUserDao backendUserDao;

    //登录操作
    @Override
    public BackendUser Login(String userCode,String userPassword) {
        return backendUserDao.Login(userCode,userPassword);
    }
    //显示操作
    @Override
    public List<AppInfo> AppInfoList() {
        return backendUserDao.AppInfoList();
    }
}
