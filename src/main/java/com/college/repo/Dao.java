package com.college.repo;

import org.springframework.data.repository.CrudRepository;

import com.college.model.CollegeDetails;

public interface Dao  extends CrudRepository<CollegeDetails, Integer>{

}
