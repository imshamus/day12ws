package sg.edu.nus.iss.day12ws.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trial")
public class TrialController 
{
    @GetMapping("")
    public String generateLinks(Model model) {
    // List<Integer> numbers = List.of(5, 10, 15); // Example numbers
    int[] numbers = {5, 10, 15};
    model.addAttribute("numbers", numbers);
    return "trial"; // Thymeleaf template name
}

}
