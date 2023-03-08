package com.example.StudentExample.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentExample.Entity.StudentEntity;
import com.example.StudentExample.Service.StudentService;

@RestController
public class StudentController {

@Autowired //extends another class

StudentService stuService;

@PostMapping("/addDetails")

public StudentEntity addInfo(@RequestBody StudentEntity st) {

return stuService.saveDetails(st);

}

@GetMapping("/showDetails")

public List<StudentEntity>fetchDetails()

{

return stuService.getDetails();

}

@PutMapping("/UpdateDetails")

public StudentEntity UpdateInfo(@RequestBody StudentEntity st1)

{

return stuService.UpdateDetails(st1);

}

@DeleteMapping("/Delete/{bookid}")

public String deleteInfo (@PathVariable("bookid")int bookid) {

stuService.deleteDetails(bookid);

return "Deleted details";

}}