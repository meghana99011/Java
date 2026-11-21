



package org.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    EntityManager em;

    @RequestMapping("/createpage")
    public ModelAndView createPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("create.jsp");
        return mv;
    }

    @RequestMapping("/save")
    public ModelAndView saveEmployee(@RequestParam String name, @RequestParam String email,
                                     @RequestParam long phone, @RequestParam String department,
                                     @RequestParam String position, @RequestParam double salary,
                                     @RequestParam String address, @RequestParam String dateOfJoining) {

        Employee e = new Employee();
        e.setName(name);
        e.setEmail(email);
        e.setPhone(phone);
        e.setDepartment(department);
        e.setPosition(position);
        e.setSalary(salary);
        e.setAddress(address);
        e.setDateOfJoining(dateOfJoining);

        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();

        Query q = em.createQuery("from Employee");
        List<Employee> employees = q.getResultList();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("allemployees.jsp");
        mv.addObject("msg", "Employee Created Successfully...");
        mv.addObject("employees", employees);
        return mv;
    }

    @RequestMapping("/allemployees")
    public ModelAndView findAllEmployees() {
        Query q = em.createQuery("from Employee");
        List<Employee> employees = q.getResultList();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("allemployees.jsp");
        mv.addObject("employees", employees);
        return mv;
    }

    @RequestMapping("/search")
    public ModelAndView search(@RequestParam String sq) {
        Query q = em.createQuery("from Employee");
        List<Employee> el = q.getResultList();

        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (Employee e : el) {
            if ((e.getId() + "").equalsIgnoreCase(sq) || (e.getName() + "").equalsIgnoreCase(sq) ||
                    (e.getEmail() + "").equalsIgnoreCase(sq) || (e.getPhone() + "").equalsIgnoreCase(sq) ||
                    (e.getDepartment() + "").equalsIgnoreCase(sq) || (e.getPosition() + "").equalsIgnoreCase(sq) ||
                    (e.getSalary() + "").equalsIgnoreCase(sq) || (e.getAddress() + "").equalsIgnoreCase(sq) ||
                    (e.getDateOfJoining() + "").equalsIgnoreCase(sq)) {
                employees.add(e);
            }
        }

        ModelAndView mv = new ModelAndView();
        mv.setViewName("allemployees.jsp");
        mv.addObject("employees", employees);
        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView deleteEmployeeById(@RequestParam int id) {
        Employee e = em.find(Employee.class, id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("allemployees.jsp");

        if (e != null) {
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();

            Query q = em.createQuery("from Employee");
            List<Employee> employees = q.getResultList();
            mv.addObject("employees", employees);
            mv.addObject("msg", "Employee Deleted Successfully");
        } else {
            Query q = em.createQuery("from Employee");
            List<Employee> employees = q.getResultList();
            mv.addObject("employees", employees);
            mv.addObject("msg", "Unable to Delete the Employee");
        }
        return mv;
    }

    @RequestMapping("/updatepage")
    public ModelAndView updatePage(@RequestParam int id) {
        Employee e = em.find(Employee.class, id);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("update.jsp");
        mv.addObject("e", e);
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView updateEmployeeById(
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam long phone,
            @RequestParam String department,
            @RequestParam String position,
            @RequestParam double salary,
            @RequestParam String address,
            @RequestParam String dateOfJoining) {

        Employee e = em.find(Employee.class, id);
        e.setName(name);
        e.setEmail(email);
        e.setPhone(phone);
        e.setDepartment(department);
        e.setPosition(position);
        e.setSalary(salary);
        e.setAddress(address);
        e.setDateOfJoining(dateOfJoining);

        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();

        Query q = em.createQuery("from Employee");
        List<Employee> employees = q.getResultList();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("allemployees.jsp");
        mv.addObject("employees", employees);
        mv.addObject("msg", "Employee Updated Successfully");
        return mv;
    }
}
