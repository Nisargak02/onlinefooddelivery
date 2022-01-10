package com.cg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.app.entity.Login;

public interface ILoginRepository extends JpaRepository<Login,Integer>{
	
	public Login signIn(Login login);
	public Login signOut(Login login);
	

}
