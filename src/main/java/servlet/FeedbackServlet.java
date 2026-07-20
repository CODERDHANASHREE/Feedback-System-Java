package servlet;
import service.AIService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String rating = request.getParameter("rating");
        String comments = request.getParameter("comments");
        String aiResult = AIService.analyzeFeedback(comments);
        System.out.println(aiResult);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/feedbackdb?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "mysql123"
            );

            String query = "INSERT INTO feedback(name, email, rating, comments , ai_analysis) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, Integer.parseInt(rating));
            ps.setString(4, comments);
            ps.setString(5,aiResult);
            
            ps.executeUpdate();
            
            System.out.println(aiResult);

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Thank you " + name + "! Your feedback is submitted successfully.</h2>");

        out.println("<h3>AI Feedback Analysis:</h3>");

        out.println("<pre>");
        out.println(aiResult);
        out.println("</pre>");
        
        out.println("</body></html>");
    }
}