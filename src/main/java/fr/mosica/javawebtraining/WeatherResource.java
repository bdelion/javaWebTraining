/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.mosica.javawebtraining;

import fr.mosica.javawebtraining.model.Weather;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
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
    public Weather getCurrentWeather(@QueryParam("zip") String zip) throws NamingException {
        Client client = ClientBuilder.newClient();
        // http://api.openweathermap.org/data/2.5/weather?zip=49600,fr&APPID=8c05dfed7d5d0d8ba3a2bc70b83b227f
        
        
        // récupération JNDI -> classique
        Context ctx = new InitialContext();
        String host = (String) ctx.lookup("java:comp/env/openweathermap/weather");
        
        WebTarget target = client
                .target(host)
                .path("data/2.5/weather")
                .queryParam("zip", zip + ",fr")
                .queryParam("appid", "8c05dfed7d5d0d8ba3a2bc70b83b227f");

        

        return target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(Weather.class);

        //[TODEL] return new Weather("Beaupréau");
    }
    /*public Weather getCurrentWeather(@PathParam("cp") String codePostal){
        return null;
    }*/

}
