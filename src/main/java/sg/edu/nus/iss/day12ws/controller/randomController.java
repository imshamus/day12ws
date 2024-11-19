package sg.edu.nus.iss.day12ws.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/randomEntry")
public class randomController 
{
    @GetMapping(path = "")
    public String randomEntry()
    {
        return "randomEntry"; // returns random.html
    }

    @GetMapping(path = "/generate")
    public String randomGenerator(@RequestParam("Number") int number, Model model)
    {
        Random rand = new Random();
        int randInt = rand.nextInt(1,31); // 1 is inclusive, 31 is exclusive

        model.addAttribute("randomNumber", randInt);
        return "randomGenerated";
        
    }
}
