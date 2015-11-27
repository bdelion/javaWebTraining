/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.mosica.javawebtraining;

import fr.mosica.javawebtraining.model.Weather;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Path("weather")
@Component
public class WeatherResource {
    
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public Weather helloWorld () {
        return new Weather("Niort");
    }
    /*public Weather getCurrentWeather(@PathParam("cp") String codePostal){
        return null;
    }*/

    
}
