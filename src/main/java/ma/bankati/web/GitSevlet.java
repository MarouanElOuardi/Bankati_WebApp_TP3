package ma.bankati.web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "GitServlet", urlPatterns = {"/git"})
public class GitSevlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws java.io.IOException {
        resp.sendRedirect("https://github.com/MarouanElOuardi");
    }
}