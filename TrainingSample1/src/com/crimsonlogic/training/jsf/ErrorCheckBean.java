package com.crimsonlogic.training.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ErrorCheckBean {
	public void throwError() throws NullPointerException {
		throw new NullPointerException();
	}
}
