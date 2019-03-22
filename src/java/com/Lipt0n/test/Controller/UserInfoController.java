package com.Lipt0n.test.Controller;

import com.Lipt0n.test.Beans.*;
import com.Lipt0n.test.Service.UserInfoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService = null;



    /*新增用户信息
    *
    * @RequestMapping是一个用来处理请求地址映射的注解
    * value 指定请求的实际地址
    * method 指定请求的method类型 如GET POST PUT等；
    * */
    @RequestMapping(value = "/insertUser",method = RequestMethod.GET)
    public ResultBean InsertUser(UserData userData) {
        ResultBean resultBean = new ResultBean();
        int code = userInfoService.insertUser(userData);
        resultBean.setCode(-1);
        resultBean.setMsg("新增用户失败");
        if (code==1){
            resultBean.setCode(0);
            resultBean.setMsg("新增用户成功");

        }
        return resultBean;
    }



}