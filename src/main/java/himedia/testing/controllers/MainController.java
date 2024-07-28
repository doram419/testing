package himedia.testing.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@GetMapping({"/"})
	public String main() {
		return "/WEB-INF/views/test.jsp";
	}
	
	@GetMapping({"/list"})
	public String list() {
		return "/WEB-INF/views/list.jsp";
	}

	@PostMapping("/create")
    public ModelAndView createFromCanvases(@RequestParam("canvasFiles") List<MultipartFile> files) {
        ModelAndView modelAndView = new ModelAndView("result");  // "result"는 뷰 이름입니다.

        // 파일 처리 로직
        for (MultipartFile file : files) {
            // 각 파일 처리
            // 예: 파일 저장, 데이터베이스 업데이트 등
        }

        // 처리 결과를 모델에 추가
        modelAndView.addObject("message", "캔버스 처리 완료");
        modelAndView.addObject("fileCount", files.size());

        return modelAndView;
    }
	
	@PostMapping({"/result"})
	public String result() {
		return "/WEB-INF/views/result.jsp";
	}
}
