package com.itheima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import com.itheima.domain.VO;
import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
////        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        UserService userService = app.getBean(UserService.class);
//        userService.save();
////        app.close();
//    }


    @RequestMapping("/quick23")
    @ResponseBody
    public void save23(String username, MultipartFile[] uploadFile) throws IOException {
        System.out.println(username);
        for (MultipartFile multipartFile :uploadFile) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("/Users/huangchun/Desktop/test/"+originalFilename));
        }
    }

    @RequestMapping("/quick22")
    @ResponseBody
    public void save22(String username, MultipartFile uploadFile, MultipartFile uploadFile2) throws IOException {
        System.out.println(username);
        String originalFilename = uploadFile.getOriginalFilename();
        String originalFilename2 = uploadFile2.getOriginalFilename();
        System.out.println(originalFilename);
        uploadFile.transferTo(new File("/Users/huangchun/Desktop/test/" + originalFilename));
        uploadFile.transferTo(new File("/Users/huangchun/Desktop/test/" + originalFilename2));
    }

    @RequestMapping("/quick21")
    @ResponseBody
    public void save21(@CookieValue(value = "JSESSIONID") String jsessionId) {
        System.out.println(jsessionId);
    }

    @RequestMapping("/quick20")
    @ResponseBody
    public void save20(@RequestHeader(value = "User-Agent", required = false) String userAgent) {
        System.out.println(userAgent);
    }


    @RequestMapping("/quick19")
    @ResponseBody
    public void save19(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request.getCookies());
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping("/quick18")
    @ResponseBody
    public void save18(Date date) {
        System.out.println(date);
    }

    @RequestMapping("/quick17/{name}")
    @ResponseBody
    public void save17(@PathVariable(value = "name", required = false) String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(@RequestParam(value = "name", required = false, defaultValue = "miao") String username) {
        System.out.println(username);
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    @RequestMapping("/quick14")
    @ResponseBody
    public void save14(VO vo) {
        System.out.println(vo);
    }

    @RequestMapping("/quick13")
    @ResponseBody
    public void save13(String[] strs) {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(User user) {
        System.out.println(user);
    }

    @RequestMapping("/quick11")
    @ResponseBody
    public void save11(String username, String address) {
        System.out.println(username);
        System.out.println(address);
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User save10() {
        User user = new User();
        user.setName("lisi2");
        user.setAddress("shenzhen2");
        return user;
    }

    @RequestMapping("/quick9")
    @ResponseBody
    public String save9() throws IOException {
        User user = new User();
        user.setName("lisi");
        user.setAddress("shenzhen");


        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public String save8() {
        return "{\"username\":\"evan\",\"age\":81}";
    }

    @RequestMapping("/quick7")
    @ResponseBody
    public String save7() {
        return "hello evan";
    }


    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello it cast");
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "evan5");
        return "success";
    }

//    @RequestMapping("/quick4")
//    public String save4(ModelMap modelMap ){
//        modelMap.addAttribute("username", "evan4");
//        return "success";
//    }

    @RequestMapping("/quick4")
    public String save3(Model model) {
        model.addAttribute("username", "evan4");
        return "success";
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username", "evan");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick2")
    public ModelAndView save2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "evan");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick", method = RequestMethod.GET)
    public String save() {
        System.out.println("Controller save running。。。");
        return "success";
    }
}
