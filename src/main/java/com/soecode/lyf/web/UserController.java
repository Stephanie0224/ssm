package com.soecode.lyf.web;

import java.util.List;

import com.soecode.lyf.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.soecode.lyf.service.UserService;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user") // url:/模块/资源/{id}/细分 /seckill/list
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired//依赖注入
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        List<User> list = userService.getList();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(value = "/{userId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("userId") Long userId, Model model) {
        if (userId == null) {
            return "redirect:/user/list";
        }
        User user = userService.getById(userId);
        if (user == null) {
            return "forward:/user/list";
        }
        model.addAttribute("user", user);
        return "detail";
    }


    @RequestMapping(value = "/{userId}/edit", method = RequestMethod.GET)
    private String edit(@PathVariable("userId") Long userId, Model model, HttpServletRequest request) {
       User user=userService.getById(userId);
       request.setAttribute("user",user);
        return "edit";
    }

    @RequestMapping(value = "/{userId}/delete", method = RequestMethod.GET)
    private String delete(@PathVariable("userId") Long userId, Model model) {
             userService.delete(userId);
        return "redirect:/user/list";
    }

    @RequestMapping(value = "/{userId}/update", method = RequestMethod.POST)
    private String update(User user) {
        userService.update(user);
        return "detail";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    private String save(User user) {
        userService.save(user);
        return "/login";
    }

    /**
     * 登录页面
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private String login(User user) {
        Integer count = userService.findUserByUserNameAndPass(user);
        if (count > 0) {
            return "redirect:/user/list";
        }
        return "/login";
    }


    @RequestMapping(value = "/registPage", method = RequestMethod.GET)
    private String regist(User user) {
        return "/register";
    }

}
