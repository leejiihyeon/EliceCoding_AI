package objectdetection;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectDetectionController {

	@Autowired
	@Qualifier("objectdetectionservice")
	ObjectDetectionService service;
	
	@RequestMapping("/objectdetectioninput")
	public ModelAndView objectdetectioninput() {
		File f = new File("C:\\Users\\student\\Desktop\\ai_images");
		String [] filelist = f.list();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("objectdetectioninput");
		mv.addObject("filelist", filelist);
		return mv;
		
	}
	
	@RequestMapping("/objectdetectionsult")
	public ModelAndView objectdetectionsult(String image) {//${param.image}
		String json = service.test(image);//id secretkey, url - json
		ModelAndView mv = new ModelAndView();
		mv.setViewName("objectdetectionresult");
		mv.addObject("objectdetectionresult", json);
		return mv;		
	}
	
	
	
}
