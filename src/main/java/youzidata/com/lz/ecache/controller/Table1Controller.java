package youzidata.com.lz.ecache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import youzidata.com.lz.ecache.service.Table1Service;

@RestController
public class Table1Controller {

    @Autowired
    private Table1Service table1Service;

    @GetMapping("/select")
    @Cacheable("hello")
    public String select(){
        return table1Service.selectAll().toString();
    }

    @GetMapping("/selectById")
    public String selectById(int id){
        return table1Service.selectById(id).toString();
    }
}
