package com.ias.dbtest.controller;

import com.ias.dbtest.dto.AjaxDTO;

import com.ias.dbtest.service.DataService;
import lombok.RequiredArgsConstructor;
//import org.json.JSONObject;


import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class DataController {
    private final DataService dataService;

//    @PostMapping("/data")
//    public @ResponseBody AjaxDTO data(@RequestBody AjaxDTO ajaxDTO){
//        System.out.println("ajaxDTO = "+ajaxDTO);
//        return ajaxDTO;
//    }
//    @GetMapping("/data")
    //@RequestMapping(value="/data", method=RequestMethod.POST)
    @PostMapping("/data")
    public @ResponseBody AjaxDTO data(@RequestBody String jsonStr){
        //AjaxDTO ajaxDTO = new AjaxDTO(jsonObject);
//        JSONObject jsonObject = JSONObject.from

        JSONObject jsonObject = new JSONObject(jsonStr);

        AjaxDTO ajaxDTO = new AjaxDTO(jsonObject);

        for(String li : ajaxDTO.getMd_list()){
            System.out.println(li);
        }
        //System.out.println(jsonStr);

        System.out.println("-------");

        return ajaxDTO;
    }
    @GetMapping("/")
    public String initial_page(Model model){

        String[] module = {"Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
                "Gearbox Oil", "Generator", "Lub.Oil","Cabinet C.Water1", "Cabinet C.Water2",
                "Convertor1","Convertor2","Main Shaft", "Motor1", "Motor2",
                "VSD M1 Status","VSD M2 Status","Cooling","Eng. and Gen.","Exhaust",
                "Lub. and Gear","VSD M1","VSD M2","Gen. Status","BUS Status",
                "MP Status","Generator Bus","MP Power","Common","Gen Alarm",
                "Blackout","Emergency Stop","Bus Alarm"};

        Arrays.asList(module);

        model.addAttribute("module_list",module);
        return "initialPage";
    }
}

