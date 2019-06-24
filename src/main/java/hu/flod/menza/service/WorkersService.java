package hu.flod.menza.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import hu.flod.menza.model.WorkersModel;

@Service
public class WorkersService {

	@Autowired
	JdbcTemplate template;
	
	public List<WorkersModel> findAllWorkers() {
        String sql = "SELECT * FROM Workers";
        RowMapper<WorkersModel> rm = new RowMapper<WorkersModel>() {
            @Override
            public WorkersModel mapRow(ResultSet resultSet, int i) throws SQLException {
            	WorkersModel worker = new WorkersModel(
            			resultSet.getInt("ID"),
            			resultSet.getString("WorkerName")
            			);

                return worker;
            }
        };
        return template.query(sql, rm);
        
	}

}
