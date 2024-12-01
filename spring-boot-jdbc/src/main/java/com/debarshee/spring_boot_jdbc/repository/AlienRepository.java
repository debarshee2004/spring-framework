package com.debarshee.spring_boot_jdbc.repository;

import com.debarshee.spring_boot_jdbc.model.AlienModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Repository class for performing database operations on the Alien entity.
 * Uses Spring's JdbcTemplate for executing SQL queries.
 */
@Repository
public class AlienRepository {

    // JdbcTemplate for executing SQL queries
    private JdbcTemplate template;

    /**
     * Getter for the JdbcTemplate.
     *
     * @return the JdbcTemplate instance.
     */
    public JdbcTemplate getTemplate() {
        return template;
    }

    /**
     * Setter for the JdbcTemplate, injected via Spring's @Autowired.
     *
     * @param template the JdbcTemplate instance to set.
     */
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    /**
     * Inserts a new Alien record into the database.
     *
     * @param alien the AlienModel object containing the data to insert.
     */
    public void create(AlienModel alien) {
        String sql = "INSERT INTO Alien (id, name, tech) VALUES (?,?,?)";

        // Executes the SQL update query and returns the number of rows affected
        int rows = template.update(
                sql, alien.getId(), alien.getName(), alien.getTech()
        );

        System.out.println(rows + " row/s affected");
    }

    /**
     * Retrieves all Alien records from the database.
     *
     * @return a list of AlienModel objects representing the records in the Alien table.
     */
    public List<AlienModel> findAll() {
        String sql = "SELECT * FROM Alien";

        // RowMapper to map each row of the result set to an AlienModel object
        RowMapper<AlienModel> mapper = new RowMapper<AlienModel>() {
            @Override
            public AlienModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                AlienModel alienModel = new AlienModel();

                // Setting properties of AlienModel from the result set
                alienModel.setId(rs.getInt(1)); // Column 1: id
                alienModel.setName(rs.getString(2)); // Column 2: name
                alienModel.setTech(rs.getString(3)); // Column 3: tech

                return alienModel;
            }
        };

        // Executes the SQL query and maps the result set using the RowMapper
        List<AlienModel> aliensQuery = template.query(sql, mapper);

        return aliensQuery;
    }
}
