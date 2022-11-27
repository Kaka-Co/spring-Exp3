package com.example.rafiulExp5;
// the below class is a controller , as far we know the controller is a part of mvc
// architecture, controller receives a  the request from a client and check the api
// then the controller send the api to the service layer to obtain the required services.


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//the above HelloWorldControl class is now a restController class
public class HelloWorldControl {


    // below we shall write api . the following api will return json format data to the client
// below will be using @restcontroller annotation instead of @controller+@responsebody
  //  get
    //post
    // put
    //delete


    // in order to make this method a rest api we have to use

   //this rest api will handle http get request
    @GetMapping("/hello-world")// this hello-world is the url for the rest api "helloWorld"(it is a method as well)
    public String helloWorld()
    {

        return "Hello world";

    }



}
