package com.example.Springbootv2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Hellocontroller {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		System.out.println("hello");
	return 
			"<body style=\"background-color:yellow;\"></body>"
			+"<a href=\"http://tm.xcelvations.com/\"> link</a>"+"<img src=\"Screenshot from 2019-09-04 15-44-40.png\">"
			+"<h1 style=\"color:blue;\">hi this is <b>sai ganesh</b></h1>"+"NewFile"
			+"<h2 style=\"color:red\">welcome</h2> "
			 +"<img src=\"screen.png\" alt=\"Mountain\">"+"NewFile";
	
	   
	} 
	@GetMapping("/mss")
	public String html() {
		return "bg";
		
	} 
	@PostMapping("/msss")
	public String resposne() {
		return "pavan";
		
	}
	@GetMapping("/students")
	public String getStudents(Model model) {
		model.addAttribute("msg", "Student List");
		String[] str = {"vinay","ramu","Srikanth" };
		int[] id = {123,124,125};
		model.addAttribute("students", str);

 model.addAttribute("studentsid",id);
 
         return "students";
    }
	
	
	}

