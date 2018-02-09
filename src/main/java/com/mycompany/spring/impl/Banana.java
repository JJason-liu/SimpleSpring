/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.impl;

import com.mycompany.spring.Ifruit;

/**
 *
 * @author Administrator
 */
public class Banana implements Ifruit {

    private String name;

    @Override
    public String getNmae() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
