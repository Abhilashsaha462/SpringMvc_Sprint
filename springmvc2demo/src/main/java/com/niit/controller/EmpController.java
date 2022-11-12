package com.niit.controller;

import com.niit.model.Emp;
import com.niit.repository.EmpRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpController {
    //Referring IOC container. Passing the file name that contains bean definitions.
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    //injecting the bean to the object reference
    Emp emp = context.getBean("emp", Emp.class);
    EmpRepository empRepository = context.getBean("empRepository",EmpRepository.class);

    public EmpController()
    {
        System.out.println("Emp Controller Instantiated ...");
    }

    //Below handler method will be called on the request http://localhost:8080/applicationname/
    @GetMapping(path="/")
    public String getEmpHomePage()
    {
        System.out.println("Taking to home Page");
        //returning view name
        return "index";
    }
    //Below handler method will be called on the request http://localhost:8080/applicationname/show
    @GetMapping(path="/show")
    public String getEmpHomePageBack()
    {
        System.out.println("Taking to home Page back");
        return "index";
    }

    //Below handler method will be called on the request http://localhost:8080/applicationname/saveEmp
    //ModelAttribute-Request will contain emp data in it's request body that will be converted to java object of type emp.
    //ModelMap helps in sending data from controller to view
    @PostMapping("/save_emp")
    public String save_emp(@ModelAttribute("emp") Emp emp, ModelMap model)
    {
        System.out.println("Taking to the save Emp Page");
        System.out.println("Taking to the save Emp Page ...."+emp);
        //calling the method of empRepository
        this.empRepository.addEmps( emp);
        model.addAttribute("empList",this.empRepository.getEmpdata());
        //model.addAttribute("empList", the list of emp);
        //returning view name along with the modelmap which has an attribute newsList
        return "list";
    }


}
