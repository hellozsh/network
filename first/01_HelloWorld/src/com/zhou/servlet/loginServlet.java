package com.zhou.servlet;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理登录请求
 * 1. 继承httpServlet，才能够处理Http请求
 * 2. 使用@WebServlet，说明它要处理的请求路径
 */

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("============== doGet");
    }

    @Override
    /**
     * HttpServletRequest req 请求: 用来获取客户端发送的数据
     * HttpServletResponse resp 响应: 用来给客户端返回数据
     */
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. 获取客户端发送的数据(请求参数)
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 2.判断帐号密码是否正确
        if ("123".equals(username) && "456".equals(password)) {
            resp.getWriter().write("Login success");
        } else {
            resp.getWriter().write("Login Fail");
        }

        //
        System.out.println("============== doPost");
    }
}
