package sg.edu.nus.iss.day12ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.day12ws.model.Employee;
import sg.edu.nus.iss.day12ws.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public String employeeList(Model model)
    {
        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    
}
