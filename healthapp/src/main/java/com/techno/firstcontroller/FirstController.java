package com.techno.firstcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.techno.customexception.InvalidCredentials;
import com.techno.dto.Doctors;
import com.techno.dto.Patients;
import com.techno.servicelayer.ServiceLayer;

@Controller
public class FirstController {
	
       @Autowired
		private ServiceLayer ser;

		@GetMapping("/homePage")
		public String getHomePage() {

			return "home";
		}

		@GetMapping("/loginPage")
		public String getLoginPage() {

			return "login";
		}

		@GetMapping("/signupPage")
		public String getsignupPage() {

			return "signup";
		}

		@GetMapping("/signupForDoc")
		public String getSignupForDoc() {

			return "docSignUp";
		}

		@GetMapping("/signupForPat")
		public String getSignupForPat() {

			return "patSignUp";
		}

		@PostMapping("/docSign")
		public String signUpDoc(Doctors doc, ModelMap map) {
			if (ser.signUpDoc(doc)) {
				map.addAttribute("msg", "Sucessfully registered");
				map.addAttribute("doc", doc);
			} else {
				map.addAttribute("msg", "Failed to registered");
			}

			return "docCon";
		}

		@PostMapping("/patSign")
		public String signUpPat(Patients pat, ModelMap map) {
			if (ser.signUpPat(pat)) {
				map.addAttribute("msg", "Sucessfully registered");
				map.addAttribute("pat", pat);
			} else {
				map.addAttribute("msg", "Failed to registered");
			}

			return "patCon";
		}

		@PostMapping("/logout")
		public String logout() {

			return "home";
		}

		@PostMapping("/loginForPat")
		public String loginForPat(int aadharNumber, String password, ModelMap map)  {

			if (ser.loginForPat(aadharNumber, password)) {
				map.addAttribute("msg", "Login sucessful");

			} else {

				/* throw new InvalidCredentials(); */
			}
			return "loginConPat";

		}

		@PostMapping("/loginForDoc")
		public String loginForDoc(int id, String password, ModelMap map) throws InvalidCredentials {

			if (ser.loginForDoc(id, password)) {
				map.addAttribute("msg", "Login sucessful");

			} else {

				 throw new InvalidCredentials(); 
			}
			return "loginCon";

		}

		@GetMapping("/listDoctors")
		public String getAllDoctors(ModelMap map) {
			List<Doctors> doc = ser.getAllDoctors();
			/*
			 * for (Doctors docs : doc) { System.out.println(doc); }
			 */
			map.addAttribute("doc", doc);
			return "doctors";
		}

		@GetMapping("/appcon")
		public String appointmentConfirmation(ModelMap map) {
			map.addAttribute("msg", "Your appointment is confirmed");
//	     map.addAttribute(getHomePage(), map);
			return "appCon";
		}

		@PostMapping("/patlist")
		public String getAllPatients(ModelMap map) {
			List<Patients> pat = ser.getAllPatients();
			for (Patients p : pat) {
				System.out.println(p.getAadharNumber());
			}
			map.addAttribute("pat", pat);
			return "patients";
		}

		@GetMapping("/conapp")
		public String confirmationAppointment() {

			return "conapp";
		}

		@GetMapping("/updatedocform")
		public String updateDocForm() {

			return "updateDoc";
		}

		@GetMapping("/updatepatform")
		public String updatePatForm() {

			return "updatePat";
		}

		@PostMapping("/updateDoc")
		public String updateDoc(Doctors doc, ModelMap map) {

			if (ser.updateDoc(doc)) {
				map.addAttribute("msg", "Your details are updated");
			} else {
				map.addAttribute("msg", "Failed to update the details");
			}
			return "updatedoccon";
		}

		@PostMapping("/updatePat")
		public String updatePat(Patients pat, ModelMap map) {

			if (ser.updatePat(pat)) {
				map.addAttribute("msg", "Your details are updated");
			} else {
				map.addAttribute("msg", "Failed to update the details");
			}
			return "updatepatcon";
		}

	}

