package level4.lesson9;

import level4.lesson8.model.City;
import level4.lesson8.reposity.CityRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/hello")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CityRepository repository = new CityRepository();

        request.setAttribute("cities", repository.getAll());
        request.getRequestDispatcher("default.jsp")
                .forward(request, response);

        // JSP - Java Server Pages
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        out.println("<html>");
//        out.println("<body>");
//
//
//        out.println("<table border=\"1\">");
//        for (City city : cities) {
//            out.println("<tr>");
//            out.println("<td>");
//            out.println(city.id);
//            out.println("</td>");
//            out.println("<td>");
//            out.println(city.name);
//            out.println("</td>");
//            out.println("</tr>");
//        }
//        out.println("</table>");
//
//        out.println("</body>");
//        out.println("</html>");
//        out.close();
    }
}
