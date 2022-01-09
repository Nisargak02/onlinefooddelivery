package com.cg.app.service;

import com.cg.app.entity.Login;

public interface ILoginService {
	
	public Login signIn(Login login);
	public Login signOut(Login login);
	

}
