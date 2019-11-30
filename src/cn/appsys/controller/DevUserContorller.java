package cn.appsys.controller;

import cn.appsys.pojo.AppInfo;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("devuser")
public class DevUserContorller {
    @Resource
    DevUserService devUserService;

    @RequestMapping(value = "login.do")
    public String Login() {
        return "devlogin";
    }

    @RequestMapping(value = "dologin.do")
    public String doLogin(String devCode, String devPassword, HttpSession session, Model model) {
        DevUser devUser = devUserService.Login(devCode, devPassword);
        session.setAttribute("devUserSession",devUser);
        if (devUser != null) {
            return "developer/main";
        }else{
            model.addAttribute("error","账号或密码错误");
            return "devlogin";
        }
    }

    @RequestMapping(value = "appinof.do")
    public  String AppInfo(Model model){
        List<AppInfo> infoList=devUserService.AppInfoList();
        model.addAttribute("appInfoList",infoList);
        return "developer/appinfolist";
    }

    @RequestMapping(value = "appinfoadd.do")
    public  String appinfoadd(){

        return  "developer/appinfoadd";
    }

}


