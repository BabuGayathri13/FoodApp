package com.example.semwebproject;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "food")
public class FoodAppController {

    @Autowired
    private Select select;

    @GetMapping("allItems")
    public ArrayList<JdbcJava> getAllItems() throws SQLException {
        return select.getAllItems();
    }

    @GetMapping("allItems/{cuisine}")
    public ArrayList<JdbcJava> getCuisine(@PathVariable("cuisine") final String cuisine) throws SQLException {
        final ArrayList<JdbcJava> allItems = select.getAllItems();
        final ArrayList<JdbcJava> filteredCuisines = new ArrayList<>();
        for (final JdbcJava item : allItems) {
            if(cuisine.equalsIgnoreCase(item.getCuisine())) {
                filteredCuisines.add(item);
            }
        }
        return filteredCuisines;
    }

    @GetMapping("ping")
    public String ping() {
        System.out.println("ping");
        return "pong!";
    }
}
