package WIHAN.WIHAN.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WIHANController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello"; // 뷰 이름 반환 (예: hello.html)
    }
}