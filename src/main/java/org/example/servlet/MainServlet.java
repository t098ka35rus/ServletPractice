package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var path = req.getRequestURI();
        if (path.matches("/")) {
           // resp.setContentType("plain/text");
            resp.getWriter().println("GET processed " + "Timestamp = " + LocalDateTime.now().toString());

        }
    }
}