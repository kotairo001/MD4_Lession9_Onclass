package rikkei.academy;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/display-discount")
public class product_discount_calculator extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float amount = (float) (price*percent*0.01);
        float discount_price = price-amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: "+ description +"</h1>");
        writer.println("<h1>List Price: "+ price +"</h1>");
        writer.println("<h1>Discount Percent: "+ percent +"</h1>");
        writer.println("<h1>Discount Amount: "+ amount +"</h1>");
        writer.println("<h1>Discount Price: "+ discount_price +"</h1>");
        writer.println("</html>");
    }
}