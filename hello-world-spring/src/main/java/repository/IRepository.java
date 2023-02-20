/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;

/**
 *
 * @author iapereira
 * @param <Model>
 */
public interface IRepository<Model> {
    public void delete(int id);
    public void update(Model t);
    public List<Model> list();
    
}
