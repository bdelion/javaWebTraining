/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.mosica.javawebtraining.model;

/**
 *
 * @author florent
 */
public class Weather {

    private String localite;

    public Weather(String name) {
        this.localite = name;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }
}
