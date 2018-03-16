
package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts.dao.LoginDao;
import com.struts.form.LoginForm;

public class LoginAction extends Action {
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	    public ActionForward execute(ActionMapping mapping, ActionForm form, 
	    		HttpServletRequest request, HttpServletResponse response) throws Exception {
	    	
	    	  
	    	String param = request.getParameter("param");
	    	LoginForm loginForm = (LoginForm) form;
	    	  String username = loginForm.getUsername();
	    	  String password = loginForm.getPassword();
	    	  
	    	  LoginDao loginDao = new LoginDao();
	    	  String dbCheck = loginDao.readData(username,password);
    	   String Passwd = dbCheck;
	    	    
	    	  if ( dbCheck.equalsIgnoreCase(password)) {
	    		  System.out.println("Password matched");
	    		  HttpSession ses = request.getSession(); 
	  			  ses.setAttribute("userName", username); 			  
	    		  
	    	  }
	    	  else 
	  		{
	  			System.out.println("not matched");
	  			return mapping.findForward("failure");
	  		}
	    	  
	       return mapping.findForward("success");
	       
	    }
	    
	}

