package hu.flod.menza.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import hu.flod.menza.model.ProductsModel;

@Service
public class ProductsService {

	@Autowired
	JdbcTemplate template;
	
	public List<ProductsModel> findAllProducts() {
        String sql = "SELECT * FROM Products";
        RowMapper<ProductsModel> rm = new RowMapper<ProductsModel>() {
            @Override
            public ProductsModel mapRow(ResultSet resultSet, int i) throws SQLException {
            	ProductsModel products = new ProductsModel(resultSet.getInt("ID"),
                        resultSet.getString("ProductName"),
                        resultSet.getInt("ProductPrice"));

                return products;
            }
        };

        return template.query(sql, rm);
        
	}
	

}
