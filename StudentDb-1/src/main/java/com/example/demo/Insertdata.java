package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.HttpSession;

@Controller
public class Insertdata {
	
	@Autowired
	StudentRep rep;
@RequestMapping("/details")	
String details()
{
	return"details.jsp";
}
@RequestMapping("insert")
String save(Student s)
{
rep.save(s);	
	return "details.jsp";
}
@RequestMapping("savestudent")
String savestudent(HttpSession h,Integer sid)
{
	Student s=rep.findById(sid).orElse(null);
	if(s!=null) {
		h.setAttribute("id", s.getId());
		h.setAttribute("name", s.getSname());
		h.setAttribute("email", s.getEmail());
		h.setAttribute("phno", s.getPhno());
	return"print.jsp";
	}
	h.setAttribute("message", "Data Not Found!!!");
	return"msg.jsp";
}
@RequestMapping("mail")
String delStudent(HttpSession h,String email)
{
	List<Student> s= rep.findByEmail(email);
	System.out.println(s);
//	if(s!=null) {
////		h.setAttribute("id", s.getId());
////		h.setAttribute("name", s.getSname());
////		h.setAttribute("email", s.getEmail());
////		h.setAttribute("phno", s.getPhno());
//		h.setAttribute("details", s);
//	return"printemail.jsp";
//	}
//	h.setAttribute("message", "Data Not Found!!!");
//	return"msg.jsp";
	return"printemail.jsp";

}
}
