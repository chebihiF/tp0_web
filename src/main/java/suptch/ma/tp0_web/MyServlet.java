package suptch.ma.tp0_web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name"); // get param value
        String remoteIpAddress = req.getRemoteAddr().toString(); // get Client IP adress
        req.setAttribute("name",name);
        req.getRequestDispatcher("myServlet.jsp").forward(req,resp);
    }
}
