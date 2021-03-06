package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.axis.session.Session;

public class SignOutUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignOutUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		HttpSession session = request.getSession();
		session.removeAttribute(Parameters.pUserBean);
		session.invalidate();
		response.sendRedirect(ClientConfig.USER_LOGIN);
	}

}
