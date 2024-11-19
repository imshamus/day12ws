package sg.edu.nus.iss.day12ws.controller;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class RandomController 
{
    // Show blank form
    @GetMapping(path = "")
    public String randomEntry()
    {
        return "form"; // returns random.html
    }

    @GetMapping(path = "/generated")
    public String randomGenerator(@RequestParam("number") int number, Model model)
    {
        Set<Integer> randomNumbers = new LinkedHashSet<>();
        Random rand = new Random();

        while (randomNumbers.size() < number)
        {
            randomNumbers.add(rand.nextInt(1,21)); // 1 is inclusive, 21 is exclusive
        }

        // Pass numbers to the model
        model.addAttribute("numbers", randomNumbers);
        return "results";
        
    }
}
