package com.wangluo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(String uname,String upwd){
        //System.out.print(uname+","+upwd);
//        硬编码
        if (uname.equals("admin")&&upwd.equals("123456"))
           // return "../admin.html";
            return "Sucess";
        else
           // return "../index1.html";
            return "Fault";
    }


        @RequestMapping("/register.do")
        @ResponseBody
        public String register(String uname,String upwd,String email){
            //System.out.print(uname+","+upwd);
//        硬编码
            System.out.println(email);
            boolean temp=false;
            if(temp)
                return "Success";
            else
                return "Fault";

        }

}
