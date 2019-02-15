package lab21.Lab21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lab21Controller {

	@RequestMapping("/")
	public ModelAndView madLib() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	
	@RequestMapping("/mileage-form")
	public ModelAndView mileForm() {
		ModelAndView mav = new ModelAndView("mileage-form");
		//do stuff here
		return mav;
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView mileRes(@RequestParam("mpg") int mpg,@RequestParam("gallons") int gallons) {
		int result = gallons*mpg;
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("result",result);
		
		return mav;
	}
}
