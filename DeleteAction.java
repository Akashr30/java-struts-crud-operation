package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts.dao.DeleteDao;
import com.struts.form.DeleteForm;

public class DeleteAction extends Action {
	public ActionForward execute (ActionMapping mapping, ActionForm form, HttpServletRequest request,
									HttpServletResponse response) throws Exception {
		
		DeleteForm deleteForm = (DeleteForm) form;
		String password = deleteForm.getPassword();
		
		DeleteDao deleteDao= new DeleteDao();
		deleteDao.deleteAccWithPassword(password);
		
		return mapping.findForward("success");
	}

}
