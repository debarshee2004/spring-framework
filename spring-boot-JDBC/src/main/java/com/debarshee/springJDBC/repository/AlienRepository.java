package com.debarshee.springJDBC.repository;

import com.debarshee.springJDBC.model.AlienModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepository {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void create (AlienModel alien) {
        String sql = "INSERT INTO Alien (id, name, tech) VALUES (?,?,?)";

        int rows = template.update(
                sql, alien.getId(), alien.getName(), alien.getTech()
        );

        System.out.println(rows + " row/s affected");
    }

    public List<AlienModel> findAll() {
        String sql = "SELECT * FROM Alien";

        RowMapper<AlienModel> mapper = new RowMapper<AlienModel>() {
            @Override
            public AlienModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                AlienModel alienModel = new AlienModel();

                alienModel.setId(rs.getInt(1));
                alienModel.setName(rs.getString(2));
                alienModel.setTech(rs.getString(3));

                return alienModel;
            }
        };

        List<AlienModel> aliensQuery = template.query(sql, mapper);

        return aliensQuery;
    }
}
