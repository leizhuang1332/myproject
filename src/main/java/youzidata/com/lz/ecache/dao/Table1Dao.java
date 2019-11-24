package youzidata.com.lz.ecache.dao;

import org.springframework.stereotype.Repository;
import youzidata.com.lz.ecache.entity.Table1Entity;

import java.util.List;

@Repository
public interface Table1Dao {
    List<Table1Entity> selectAll();

    Table1Entity selectById(int id);
}
