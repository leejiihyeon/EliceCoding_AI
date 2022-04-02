package ocr;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OCRController {
	@Autowired
	@Qualifier("ocrservice")
	OCRService service;

	@RequestMapping("/ocrinput")
	public ModelAndView ocrinput() {
		//파일리스트 - 뷰(이미지파일만)
		File f = new File("C:\\Users\\student\\Desktop\\ai_images");
		String [] filelist = f.list();
		ModelAndView mv = new ModelAndView();
		mv.addObject("filelist", filelist);
		mv.setViewName("ocrinput");
		return mv;	
	}
	
	@RequestMapping("/ocrresult")
	public ModelAndView ocrresult(String fontfile) {
		String json = service.test(fontfile);
		ModelAndView mv = new ModelAndView();
		mv.addObject("ocrresult", json);
		mv.setViewName("ocrresult");
		return mv;			
	}
	
}
