package com.techno.controllerlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techno.dto.Mall;
import com.techno.dto.Shops;
import com.techno.service.ServiceLayer;

@RestController
public class ControllerLayer {

	@Autowired 
	private ServiceLayer service;

	@PostMapping(path = "/insert", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })

	public Mall insertshop(@RequestBody Shops shop) {
		Mall shoppingmall = new Mall();
		if (service.insertshop(shop)) {
			shoppingmall.setStatuscode(200);
			shoppingmall.setMessage("Details entered");
			shoppingmall.setDescription("successfully entered u r details");
			shoppingmall.setShop(shop);
		} else {
			shoppingmall.setStatuscode(400);
			shoppingmall.setMessage("details not entered");
			shoppingmall.setDescription("The details which you have entered is not succesfully added");
		}
		return shoppingmall;

	}
	
	@PutMapping(path = "/update", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	
	public Mall updateShop(@RequestBody Shops shop) {
		Mall shoppingmall = new Mall();
		if(service.updateshop(shop)){
			shoppingmall.setStatuscode(200);
			shoppingmall.setMessage("updated");
			shoppingmall.setDescription("Details which you have changed successfully updated");
		}else {
			shoppingmall.setStatuscode(400);
			shoppingmall.setMessage("Not updated");
			shoppingmall.setDescription("Deatils are not updated successfully");

		}return shoppingmall;
	}
	
	@GetMapping(path ="/get/{shopid}",produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	
	public Mall retrieve(@PathVariable("shopid")int shopid) {
		Mall shoppingmall = new Mall();
		Shops myshop = service.retrieveshop(shopid);
		if(myshop!=null) {
			shoppingmall.setStatuscode(200);
			shoppingmall.setMessage("Details which are you entered");
			shoppingmall.setDescription("successfully u get u r details");
			shoppingmall.setShop(myshop);
			
		}else {
			shoppingmall.setStatuscode(400);
			shoppingmall.setMessage("not successfully fetched");
			shoppingmall.setDescription("You have not entered correct way");
		
		}return shoppingmall;
	}
	@DeleteMapping(path = "/delete/{shopid}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public Mall deletePlayer(@PathVariable("shopid") int shopid) {
		Mall shoppingmall = new Mall();
		if (service.deleteshop(shopid)) {
			shoppingmall.setStatuscode(200);
			shoppingmall.setMessage("Successfull");
			shoppingmall.setDescription("successfully deleted");
			

		} else {
			shoppingmall.setStatuscode(400);
			shoppingmall.setMessage("Failed");
			shoppingmall.setDescription("Failed to delete");
		}

		return shoppingmall;

}
}
