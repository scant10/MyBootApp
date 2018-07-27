package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MyData;


@Repository
public interface MyDataRepository  extends JpaRepository<MyData, Long> {
	
	public Optional<MyData> findById(Long name);
}
