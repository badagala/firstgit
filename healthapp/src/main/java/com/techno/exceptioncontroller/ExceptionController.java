package com.techno.exceptioncontroller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.techno.customexception.InvalidCredentials;

@ControllerAdvice
	public class ExceptionController {

		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(InvalidCredentials.class)
		public String invalidDetails(InvalidCredentials ip, ModelMap map) {
			map.addAttribute("msg", ip.toString());
			return "error_page";

		}


}
