package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 


public interface userrepo extends JpaRepository<user,Integer> {
	//List<user> findAll();
	@Query(value="SELECT * FROM user u where u.d=?1",nativeQuery=true)
	List<user> findbydate(String date);

}
