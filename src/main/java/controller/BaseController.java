package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

	@RequestMapping(value="/base", method = RequestMethod.GET)
	public ModelAndView baseWeb(HttpServletRequest request, 
								HttpServletResponse response, 
								ModelAndView modelAndView){
		modelAndView.setViewName("base-web");
		return modelAndView;
	}
}
