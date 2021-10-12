
import java.io.IOException;

import control.service;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.employee;

public class EmployeesView extends HttpServlet{
	private service empService = new service();
	/**
	 * 
	 */
	private static final long serialVersionUID = -4289710759867984582L;
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		employee emp = new employee();
		res.setContentType("text/html");
		String firstName = req.getParameter("firstName");
		emp.setFirstName(firstName);
		String empId = req.getParameter("empId");
		Long empid = Long.parseLong(empId);
		emp.setEmpid(empid);
		String lastName = req.getParameter("lastName");
		emp.setLastName(lastName);
		String s = req.getParameter("salary");
		emp.setSalary(Integer.parseInt(s));
		String designation = req.getParameter("designation");
		emp.setDesignation(designation);
		
		if(empService.insert(emp)) {
			System.out.println("done");
			res.sendRedirect(req.getContextPath()+"/view.jsp");
		}else{
			System.out.println("error");
		};
	}
	
}
