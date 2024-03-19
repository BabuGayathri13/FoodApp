package com.example.semwebproject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FoodAppControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private Select select;

    @Test
    public void getAllItemsUnitTest() throws SQLException {
        when(select.getAllItems()).thenReturn(getItems());
        final List<JdbcJava> list = this.restTemplate.exchange("http://localhost:" + port + "/food/allItems",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<JdbcJava>>(){}).getBody();
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void getIndianItemsUnitTest() throws SQLException {
        when(select.getAllItems()).thenReturn(getItems());
        final List<JdbcJava> list = this.restTemplate.exchange("http://localhost:" + port + "/food/allItems/indian",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<JdbcJava>>(){}).getBody();
        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals("1", list.get(0).getMenuId());
        Assertions.assertEquals("Chicken Biryani", list.get(0).getMenuName());
        Assertions.assertEquals("Indian", list.get(0).getCuisine());
    }

    private ArrayList<JdbcJava> getItems() {
        JdbcJava item1 = new JdbcJava();
        item1.setMenuId("1");
        item1.setCuisine("Indian");
        item1.setMenuName("Chicken Biryani");
        item1.setIngredients("Chicken,etc");
        item1.setMethod("Cook");

        JdbcJava item2 = new JdbcJava();
        item2.setMenuId("2");
        item2.setCuisine("Chinese");
        item2.setMenuName("Chicken Noodles");
        item2.setIngredients("Chicken,noodles");
        item2.setMethod("Cook noodles");

        final ArrayList<JdbcJava> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        return list;
    }
}