package pose;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PoseController {

	@Autowired
	@Qualifier("poseservice")
	PoseService service;
	
	@RequestMapping("/poseinput")
	public ModelAndView poseinput() {
		File f = new File("C://Users//ASUS//OneDrive//바탕 화면//STUDY//ai_images//ai_images");
		String [] filelist = f.list();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("poseinput");
		mv.addObject("filelist", filelist);
		return mv;
		
		
	}
	
	@RequestMapping("/poseresult")
	public ModelAndView poseresult(String image) { //${param.image}
		String json = service.test(image); //id secetkey, url - json
		ModelAndView mv = new ModelAndView();
		mv.setViewName("objectdetectioninput");
		mv.addObject("objectdetectioninput", json);
		return mv;
	}
	
	
	
}
