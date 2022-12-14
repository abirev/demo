package com.college.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.CollegeDetails;
import com.college.service.CollegeService;


@RestController
public class CollegeController {
@Autowired
	CollegeService cos;
@GetMapping("/cog")
private List<CollegeDetails>getRecord()
{
	return cos.getrecord();
}

@PostMapping("/cogg")
private void insert(@RequestBody CollegeDetails cd)
{
	cos.getinsert(cd);
}

@PutMapping("/cogg")
private void update(@RequestBody CollegeDetails cd)
{
	cos.save(cd);
}
@DeleteMapping("/cog/{id}")
private String deleteId(@PathVariable("id")int id )
{
	cos.delete(id);
	return"delete";
}
@GetMapping("/cog/{id}")
private CollegeDetails gId(@PathVariable("id")int id) 
{
	return cos.gid(id);
}
}

  