package com.ias.dbtest.controller;

import com.ias.dbtest.domain.M01_CoolingWater;
import com.ias.dbtest.domain.TempData;
import com.ias.dbtest.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class DataController {
    private final DataService dataService;

//    @GetMapping("/")
//    public String data(Model model){
//        List<TempData> data = dataService.findTempData();
//        for(TempData temp :data){
//            System.out.println("id: "+temp.getId());
//        }
//        model.addAttribute("data",data);
//        return "dataList";
//    }
    @GetMapping("/data")
    public String data(@RequestBody Jamong jamong){
        return jamong.getName() + jamong.getAge();
    }
    @GetMapping("/")
    public String initial_page(Model model){
        //List<M01_CoolingWater> data = dataService.findM01();
//        for(M01_CoolingWater temp :data){
//            System.out.println("id: "+temp.getId());
//        }
        String[] module = {"Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
                "Gearbox Oil", "Generator", "Lub.Oil","Cabinet C.Water1", "Cabinet C.Water2",
                "Convertor1","Convertor2","Main Shaft", "Motor1", "Motor2",
                "VSD M1 Status","VSD M2 Status","Cooling","Eng. and Gen.","Exhaust",
                "Lub. and Gear","VSD M1","VSD M2","Gen. Status","BUS Status",
                "MP Status","Generator Bus","MP Power","Common","Gen Alarm",
                "Blackout","Emergency Stop","Bus Alarm"};
        List<String> list = new ArrayList<String>();
        Arrays.asList(module);

        model.addAttribute("module_list",module);
        return "initialPage";
    }
}

