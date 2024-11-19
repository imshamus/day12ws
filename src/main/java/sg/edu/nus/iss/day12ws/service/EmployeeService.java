package sg.edu.nus.iss.day12ws.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day12ws.model.Employee;

@Service
public class EmployeeService 
{
    public List<Employee> getEmployees()
    {

        List<Employee> employees = new ArrayList<>();

        // if packaged as a JAR, consider using
        // BufferedReader br = new BufferedReader(
        // new InputStreamReader(getClass().getResourceAsStream("/static/texts/employee.txt")));

        // SDF way
        // Path p = Paths.get("src\\main\\resources\\static\\texts\\employee.txt"); // Input file
        // try (BufferedReader br = new BufferedReader(new FileReader(p.toFile()))) 
    
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/static/texts/employee.txt"))))
        {
            String line;

            while ((line = br.readLine()) != null) 
            {
                if (line.startsWith("firstName"))
                {
                continue; // skip headers
                }

                String[] tempList = line.split(",");

                String firstName = tempList[0];
                String lastName = tempList[1];
                int age = Integer.parseInt(tempList[2]);
                int salary = Integer.parseInt(tempList[3]);

                Employee e = new Employee(firstName, lastName, age, salary);
                employees.add(e);
            }
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        } 

        return employees;
        
    }
}
