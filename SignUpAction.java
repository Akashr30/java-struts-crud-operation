package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts.dao.SignUpDao;
import com.struts.form.SignUpForm;

public class SignUpAction extends Action {
	private final static String SUCCESS = "success";

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		SignUpForm signUpForm = (SignUpForm) form;
		
		String username = signUpForm.getUsername();
		String email_id = signUpForm.getEmail_id();
		String password = signUpForm.getPassword();
		
		SignUpDao signUpDao = new SignUpDao() ;
		signUpDao.insert(username,email_id,password);
		
		return mapping.findForward("success");
	}

}
