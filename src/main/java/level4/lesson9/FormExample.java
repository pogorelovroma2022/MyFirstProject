package level4.lesson9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/form")
public class FormExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("Name: " + request.getParameter("name777"));
        out.println("<br>");
        out.println("Age: " + request.getParameter("age888"));
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
