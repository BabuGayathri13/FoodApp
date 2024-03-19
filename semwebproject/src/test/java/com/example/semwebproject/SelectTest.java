package com.example.semwebproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SelectTest {

    @Test
    public void testGetAllItems() throws SQLException {
        final SelectStub stub = new SelectStub();
        final ArrayList<JdbcJava> items = stub.getAllItems();
        assertEquals(2, items.size());
        assertEquals("1", items.get(0).getMenuId());
        assertEquals("Cuisine1", items.get(0).getCuisine());
        assertEquals("MenuName1", items.get(0).getMenuName());
        assertEquals("Ingredients1", items.get(0).getIngredients());
        assertEquals("Method1", items.get(0).getMethod());
        assertEquals("2", items.get(1).getMenuId());
        assertEquals("Cuisine2", items.get(1).getCuisine());
        assertEquals("MenuName2", items.get(1).getMenuName());
        assertEquals("Ingredients2", items.get(1).getIngredients());
        assertEquals("Method2", items.get(1).getMethod());
    }

    class SelectStub extends Select {
        protected ResultSet getResultSet() throws SQLException {
            ResultSet resultSet = Mockito.mock(ResultSet.class);
            when(resultSet.next()).thenReturn(true).thenReturn(true).thenReturn(false); // Simulate 2 rows
            when(resultSet.getString(1)).thenReturn("1").thenReturn("2"); // Return menuIds "1" and "2"
            when(resultSet.getString(2)).thenReturn("Cuisine1").thenReturn("Cuisine2"); // Return cuisines "Cuisine1" and "Cuisine2"
            when(resultSet.getString(3)).thenReturn("MenuName1").thenReturn("MenuName2"); // Return menu names "MenuName1" and "MenuName2"
            when(resultSet.getString(4)).thenReturn("Ingredients1").thenReturn("Ingredients2"); // Return ingredients "Ingredients1" and "Ingredients2"
            when(resultSet.getString(5)).thenReturn("Method1").thenReturn("Method2"); // Return methods "Method1" and "Method2"
            return resultSet;
        }
    }
}