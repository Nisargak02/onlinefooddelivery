package com.cg.app.repository;

import com.cg.app.entity.Login;

public interface ILoginRepository {
	
	public Login signIn(Login login);
	public Login signOut(Login login);
	

}
