package cn.smbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController{
	@RequestMapping("/index")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String success(@RequestParam(value="userCode")String userCode,Model model){
		model.addAttribute("userCode", userCode);
		return "success";
	}
}
