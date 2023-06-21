/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.main.repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ksouraj
 */
public abstract class AbstractEntity implements IAbstractClass{
  
     @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Override
    public  void setId(long id){
        this.id = id;
    }

    @Override
    public  Long getId(){
        return  this.id;
    } 
}
