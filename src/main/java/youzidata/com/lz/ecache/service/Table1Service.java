package youzidata.com.lz.ecache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youzidata.com.lz.ecache.dao.Table1Dao;

@Service
public class Table1Service {

    @Autowired
    private Table1Dao table1Dao;

    public Object selectAll(){
        return table1Dao.selectAll();
    }
}
