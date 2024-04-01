package studentManegment.example.withh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import studentManegment.example.withh2.dov.StudentRepo;
import studentManegment.example.withh2.model.Student;

@Controller
public class StudentController {

    @Autowired
    StudentRepo webRepo;

    @RequestMapping("/login")
    public String home(){
        System.out.println("in get all data");
        return "login"; 
    }

    @RequestMapping("/getAllData")
    public ModelAndView getAllData() {
        ModelAndView mv = new ModelAndView("showAllData");
        List<Student> webApiList = webRepo.findAll();
        // System.out.println(webApiList);
        mv.addObject("webApiList", webApiList); // Use a proper attribute name
        return mv;
    }
    @PostMapping("/addData")
    public ResponseEntity<Object> addData(@RequestBody Student webApi){
        if(webApi != null){
            webRepo.save(webApi);
            return new ResponseEntity<>(webApi , HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Failed" , HttpStatus.NOT_FOUND);
        }
       
    }

    @GetMapping("/getData")
    public ResponseEntity<Object> getData(){
        String webList = webRepo.findAll().toString();
        if(!webList.isEmpty()){
            return new ResponseEntity<>(webList , HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Data Is Empty" ,  HttpStatus.NOT_FOUND);
        }
    }    

    @DeleteMapping("/deleteDataById/{id}")
    public ResponseEntity<?> deleteDataById(@PathVariable int id){
        try{
            webRepo.deleteById(id);
            return new ResponseEntity<>("data deleted succdefuly" , HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>("failed" ,HttpStatus.NOT_FOUND);
        }
    }
}
