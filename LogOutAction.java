package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogOutAction extends Action{
	
	 public ActionForward execute(ActionMapping mapping,HttpServletRequest request, 
			 						HttpServletResponse response) throws Exception {
		 HttpSession session = request.getSession(false); 
		if(session!=null) {
			session.invalidate();
		}
		 return mapping.findForward("success");
	 }
	 
	 
	    	

}
