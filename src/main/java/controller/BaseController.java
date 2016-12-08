package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pojo.AppStaticData;
import repository.AppStaticDataRepository;

@Controller
public class BaseController {

	@Autowired
	private AppStaticDataRepository test;
	
	Logger logger = Logger.getLogger(BaseController.class);
	
	@RequestMapping(value="/base", method = RequestMethod.GET)
	public ModelAndView baseWeb(HttpServletRequest request, 
								HttpServletResponse response, 
								ModelAndView modelAndView){
		modelAndView.setViewName("base-web");
		Iterable<AppStaticData> list = test.findAll();
		modelAndView.addObject("test", new Gson().toJson(list));
		return modelAndView;
	}
}
