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
	
	@RequestMapping("/add-form")
	public ModelAndView showAddForm() {
		return new ModelAndView("add-form");
	}
	@RequestMapping("/add-result")
	public ModelAndView showAddResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		int result = num1+num2;
		ModelAndView mav = new ModelAndView("add-result");
		mav.addObject("num1", num1);
		mav.addObject("num2",num2);
		mav.addObject("result",result);
		return mav;
	}
	
	@RequestMapping("/div-form")
	public ModelAndView showDivForm() {
		return new ModelAndView("div-form");
	}
	@RequestMapping("/div-result")
	public ModelAndView showDivResult(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
		double result = num1/num2;
		int remainder = (int) (num1%num2);
		ModelAndView mav = new ModelAndView("div-result");
		mav.addObject("num1", num1);
		mav.addObject("num2",num2);
		mav.addObject("result",result);
		mav.addObject("remainder",remainder);
		return mav;
	}
	
	@RequestMapping("/repeat-form")
	public ModelAndView showRepForm() {
		return new ModelAndView("repeat-form");
	}
	@RequestMapping("/repeat-result")
	public ModelAndView showRepResult(@RequestParam("word") String word, @RequestParam("num") int num) {
		
		ModelAndView mav = new ModelAndView("repeat-result");
	
		String result = "";
		for (int i=0;i<num;i++) {
			result += word+" ";
		}
		
		mav.addObject("result",result);
		return mav;
	}
}
