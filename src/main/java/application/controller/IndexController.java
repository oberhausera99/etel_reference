package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	  @GetMapping("/index")
	  public String getIndex(){
	    return "index.html";
	 }
	  
	
	
	  
	  @GetMapping("/kapcsolat")
	  public String getKapcsolat(){
	    return "kapcsolat";
	 }
}

