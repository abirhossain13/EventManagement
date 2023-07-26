import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ValidateAdmin extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
    
        PrintWriter out = response.getWriter();
        String un = request.getParameter("Adminusername");//fetch username
        String pw = request.getParameter("Adminpassword");//fetch password
        response.setContentType("text/html");
        String u1 = "A101";
        String p1 = "1234";
        String u2 = "A102";
        String p2 = "5678";
        String u3 = "A103";
        String p3 = "ABCD";
        String u4 = "A104";
        String p4 = "abcd";
        
        //ifelse ladder to check entries 
        
        if(pw.equals(p1)&&un.equals(u1)){
        RequestDispatcher rd = request.getRequestDispatcher("AdminEvent.html");
        rd.forward(request, response);
        
        }
        else if(pw.equals(p2)&&un.equals(u2)){
        RequestDispatcher rd = request.getRequestDispatcher("AdminEvent.html");
        rd.forward(request, response);
        
        }
        else if(pw.equals(p3)&&un.equals(u3)){
        RequestDispatcher rd = request.getRequestDispatcher("AdminEvent.html");
        rd.forward(request, response);
        
        }
        else if(pw.equals(p4)&&un.equals(u4)){
        RequestDispatcher rd = request.getRequestDispatcher("AdminEvent.html");
        rd.forward(request, response);
        
        }
        //Credentials incorrect Stay on this page only!!
        else
        {
            out.println("<center><h3> !! Please Enter Valid Username and Password for Admin Access !! </h3></center>");
            RequestDispatcher rd = request.getRequestDispatcher("Adminlogin.html");
            rd.include(request, response);
        }
        out.close();
    } 

}
