package com.college.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.model.CollegeDetails;
import com.college.repo.Dao;

@Service
public class CollegeService {
	@Autowired
	Dao dao;

	public List<CollegeDetails> getrecord() {
		List<CollegeDetails> l = new ArrayList<CollegeDetails>();
		dao.findAll().forEach(x -> l.add(x));
		return l;

	}

	public void getinsert(CollegeDetails cd) {
		dao.save(cd);

	}

	public void save(CollegeDetails cd) {
		dao.save(cd);

	}

	public void delete(int id) {
		dao.deleteById(id);

	}

	

	public CollegeDetails gid(int id) {
		return dao.findById(id).get();
	}

}
