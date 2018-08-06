package com.telusko.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.telusko.demo.model.Login;

public interface LoginRepo extends CrudRepository<Login, Integer>{
	
	@Query(value = "select * from Login where username like %:name%",nativeQuery = true)
	public List<Login> findByWildCard(@Param("name") String wildcard);

}
