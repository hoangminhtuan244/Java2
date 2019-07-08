/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt189;

/**
 *
 * @author Administrator
 */
public class Cate {
    int id;
    String cateName;

    public Cate() {
    }

    public Cate(int id, String cateName) {
        this.id = id;
        this.cateName = cateName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
    
    
}
