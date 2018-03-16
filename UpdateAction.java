package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts.dao.UpdateDao;
import com.struts.form.UpdateForm;

public class UpdateAction extends Action{
	public ActionForward execute (ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
						throws Exception {
			UpdateForm updateForm = (UpdateForm) form;
				String username = updateForm.getUsername();
				String email_id = updateForm.getEmail_id();
				String password = updateForm.getPassword();
				
				UpdateDao dao = new UpdateDao();
				dao.updateDao(username,email_id,password);
				
		return mapping.findForward("success");
	}

}
