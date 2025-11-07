package com.example.exp7;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if ("admin".equals(user) && "1234".equals(pass)) {
            out.println("<h2>Welcome, " + user + "!</h2>");
        } else {
            out.println("<h3>Invalid Credentials!</h3>");
        }
    }
}
