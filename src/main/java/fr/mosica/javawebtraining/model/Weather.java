/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.mosica.javawebtraining.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author florent
 */
// To ignore any unknown properties in JSON input without exception:
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private String name;

    public Weather() {

    }

    public Weather(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
