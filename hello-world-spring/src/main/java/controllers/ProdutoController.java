/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iapereira
 */
@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController { 
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @GetMapping("/hello")  
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        String sql = "select count(*) from cliente;";  
        System.out.println("Linhas:"+jdbcTemplate.queryForObject(sql, Integer.class));
        return String.format("Hello %s!", name);
    }
    @GetMapping("/teste")
    public ModelAndView teste(Map<String, Object> model) {
        model.put("mensagem", "ola");
        return new ModelAndView("teste", model);
    }    
}