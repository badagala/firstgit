package com.te.firstcontroller;


//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.dtolayer.Users;
import com.te.servicelayer.ServiceLayer;

@Controller
public class FirstController {
	  
	@Autowired
	private  ServiceLayer serve;
//	@Autowired
//	private DAOLayer dao;
	
	
	//@ResponseBody
	@GetMapping("/login")
	public String firstform(ModelMap map) {
		
		return "loginform";
		
	}
	
//	@GetMapping("/ravi")
//	public String secondform(ModelMap map,HttpServletRequest req) {
//		
//		String name=(String) req.getParameter("name");
//		String mobileno = (String) req.getParameter("mobileno");
//		String area = (String) req.getParameter("area");
//		
//		map.addAttribute("name",name);
//		map.addAttribute("mobileno", mobileno);
//		map.addAttribute("area", area);
//		
//		
//		return "innerform";
//		
//	}
	
	@GetMapping("/ravi")
	public String secondform(ModelMap map, Users user) {
		if(serve.getobject(user)) {
		map.addAttribute("user",user);
		map.addAttribute("message","details entered successfully");
	}
		return "thirdform";	
}
	
	@GetMapping("/data")
	public String getform(ModelMap map) {

		return "login";
	}
	
//	@GetMapping("/file"){
	
//	public String getuserdetails(ModelMap map,String name) {
//		Users fetch =dao.getuser(name);
//		map.addAttribute("getting", fetch);
//		//map.addAttribute("message","The values which u have entered");
//		return "type";
//	}


    @PostMapping("/retrieve")
    public String getuserdetails(ModelMap map, String name) {
    	Users retrieve = serve.fetchthedata(name);
    	map.addAttribute("getting", retrieve);
    	return "type";
    	
    }
    
    @GetMapping("/update")
    public String updateform(ModelMap map) {
    	
    	return "updateConfirmation";
    	
    }

	@PostMapping("/updateTraine")
	public String updateTraine(ModelMap map, String name, String mobileno) {
		if (serve.updateTrainee(mobileno,mobileno)) {
			map.addAttribute("msg", "Sucessfully updated the details");
		} else {

			map.addAttribute("msg", "Failed to update the details");
		}

		return "updatedpage";
	}

	@GetMapping("/deleteTrainee")
	public String deleteTrainee(ModelMap map, String name) {
		if (serve.deletetrainee(name)) {
			map.addAttribute("msg", "Sucessfully deleted the trainee");
		} else {

			map.addAttribute("msg", "Failed to delete the trainee ");
		}

		return "deleteTraineeInfo";
}
}
