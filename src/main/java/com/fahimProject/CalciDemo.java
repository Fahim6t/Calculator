package com.fahimProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalciDemo extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		String str = req.getParameter("opr");
		double output = 0;
		PrintWriter out = res.getWriter();
		if(str.equals("+")) {
			output= num1+num2;
			out.println("Output : "+(int) output);
		}
		else if(str.equals("-")) {
			output= num1-num2;
			out.println("Output : "+(int) output);
		}
		else if(str.equals("*")) {
			output= num1*num2;
			out.println("Output : "+(int) output);
		}
		else if(str.equals("/")) {
			output= num1/num2;
			out.println("Output : "+output);
		}
		
		
	}

}
