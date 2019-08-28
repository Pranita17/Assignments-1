package module_3_4;

import java.io.IOException;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDetailsServlet
 */
@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Calendar myCalendar = new GregorianCalendar(1987, Calendar.JULY, 8);
		Date myDate = myCalendar.getTime();
		Employee e = new Employee();
		e.setEmployeeID(969143);
		e.setEmployeeName("John");
		e.setDateOfBirth(myDate);
		e.setFullTimeEmployee(true);
		e.setSalary(120000);
		e.setGender("Male");
		
		request.setAttribute("EmployeeID", e.getEmployeeID());
		request.setAttribute("EmployeeName", e.getEmployeeName());
		request.setAttribute("EmployeeDOB", e.getDateOfBirth());
		request.setAttribute("EmployeeFTE", e.isFullTimeEmployee());
		request.setAttribute("EmployeeSalary", e.getSalary());
		request.setAttribute("EmployeeDepartment", e.getDepartment());
		request.setAttribute("EmployeeGender", e.getGender());

		
		RequestDispatcher rd = request.getRequestDispatcher("/edit-employee.jsp");
		rd.forward(request, response);
	}

	

}
