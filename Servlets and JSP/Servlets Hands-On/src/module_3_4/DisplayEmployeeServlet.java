package module_3_4;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayEmployeeServlet
 */
@WebServlet("/DisplayEmployeeServlet")
public class DisplayEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee e = new Employee();
		ArrayList<String> tmp = new ArrayList<String>();
		tmp.add(request.getParameter("department"));
		e.setGender(request.getParameter("gender"));
		e.setEmployeeID(969143);
		e.setEmployeeName(request.getParameter("employee-name"));
		boolean isFTE = false;
		if(request.getParameter("fulltimeEmployee").equals("on")) isFTE = true;
		e.setFullTimeEmployee(isFTE);
		try {
			e.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse((request.getParameter("dob"))));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.setDepartment(tmp);
		e.setSalary(Double.parseDouble(request.getParameter("salary")));
		System.out.println(e);
		request.setAttribute("EmployeeID", e.getEmployeeID());
		request.setAttribute("EmployeeName", e.getEmployeeName());
		request.setAttribute("EmployeeDOB", e.getDateOfBirth());
		request.setAttribute("EmployeeFTE", e.isFullTimeEmployee());
		request.setAttribute("EmployeeSalary", e.getSalary());
		request.setAttribute("EmployeeDepartment", e.getDepartment());
		request.setAttribute("EmployeeGender", e.getGender());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/display-details.jsp");
        requestDispatcher.forward(request, response);
		
	}

}
