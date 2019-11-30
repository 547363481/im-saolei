package cn.appsys.controller;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.BackendUser;
import cn.appsys.service.BackendUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("backenduser")

public class BackendUserContorller {
    @Resource
    BackendUserService backendUserService;
    @RequestMapping(value = "login.do")
    public String Login(){
        return "backendlogin";
    }

    @RequestMapping(value = "dologin.do")
    public String doLogin(String userCode, String userPassword, HttpSession session, Model model){
        BackendUser backendUser=backendUserService.Login(userCode,userPassword);
        session.setAttribute("userSession",backendUser);
        if(backendUser!=null){
            return "backend/main";
        }else{
            model.addAttribute("error","账号或密码错误");
            return "backendlogin";
        }
    }
    @RequestMapping(value = "appinof.do")
    public  String AppInfo(Model model){
        List<AppInfo> infoList=backendUserService.AppInfoList();
        model.addAttribute("appInfoList",infoList);
        return "backend/applist";
    }


}
