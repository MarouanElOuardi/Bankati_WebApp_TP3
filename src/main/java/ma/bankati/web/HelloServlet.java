package ma.bankati.web;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        var page = """
                        <html>
                            <body>
                                <h1 style='color:blue'>Hello from HelloServlet</h1>
                                <h2>Protocol:  + req.getProtocol() </h2>
                                <h2>Method:  + req.getMethod() </h2>
                                <h2>Request URI:  + req.getRequestURI()</h2>
                                <h2>Context Path:  + req.getContextPath()</h2>
                                <h2>Servlet Path:  + req.getServletPath()</h2>
                                <h2>Path Info: +  req.getPathInfo()</h2>
                            </body>
                        </html>
                        """;
        resp.getWriter().println(page);

    }
}