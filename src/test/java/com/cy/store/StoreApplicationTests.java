package com.cy.store;

import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class StoreApplicationTests {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

    }

    @Test
    public void findByUsername() {
        String username = "gwj";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }

    @Test
    public void getConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
