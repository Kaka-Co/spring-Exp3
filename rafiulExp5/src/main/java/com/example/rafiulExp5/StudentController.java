package com.example.rafiulExp5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    //this Controller class will return the client a bean object  (Student) to the client


    @GetMapping("/student")
    public Student getStudent()
    {



   return new Student("Aisha","Siddika");



    }

          @GetMapping("/studentlist")
          public List<Student> getStudents()
          {
                     List<Student> studentList=new ArrayList<>();
                     studentList.add(new Student("rafiul","Hredoy"));
                     studentList.add(new Student("Sadiul","islam"));
                     studentList.add(new Student("Alauddin","Tuhin"));
                     studentList.add(new Student ("fahim","ansari"));


         return studentList;  }

   //uri template variable
    // with the @PathVariable annotation we bind the request URL template path variable
    // to the method variable
    @GetMapping("/student/{firstname}/{lastname}")
    public Student studentPathVariable(@PathVariable("firstname") String firstName,
                                       @PathVariable("lastname") String lastName)

    {

        return new Student(firstName,lastName);


    }



  // build rest API to handle query   parameters
  // build rest API to handle query   parameters
  //http://localhost:8080/student?firstName=Ramesh&LastName=Fadatare
  @GetMapping("/student/query")
  public Student studentQueryParam(@RequestParam(name="firstName") String firstName, @RequestParam(name="lastName") String lastName)
  {

      return new Student(firstName,lastName);


  }




}
