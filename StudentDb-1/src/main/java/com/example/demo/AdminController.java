package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
@RequestMapping("/user")
String save()
{
	return "form.jsp";
}
@RequestMapping("check")
String check( String email,String pass)
{if(email.equals("user123@gmail.com")&& pass.equals("User123"))
	return "details.jsp";
return "error.jsp";
}
}
