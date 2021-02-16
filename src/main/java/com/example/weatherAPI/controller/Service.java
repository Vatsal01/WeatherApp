package com.example.weatherAPI.controller;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.weatherAPI.model.DataFromAPI;

public class Service {
	
	private DataFromAPI dataFromApi = new DataFromAPI() ;

	public DataFromAPI getAPI(String city, byte unit) throws 
	IOException, ParseException, java.text.ParseException, NullPointerException
	{
	
		String unitType = "metric";
		if(unit==2)
			unitType="imperial" ;
		
		String api = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&units="+unitType+"&appid=f7ccbb1493d8361d04f0133b2c6e9d68" ;
		
		URL url = new URL(api);
       
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
		conn.setRequestMethod("GET"); //GET request for requesting data
		
		conn.setReadTimeout(4000);
		
		conn.setReadTimeout(4000);
		 
        conn.connect();

        String line="";
        
        int responseCode = conn.getResponseCode();
        
        //To check the http response for our request, if 200 then success and further execution of program
        
        if (responseCode != 200)
            throw new RuntimeException(("HttpResponse :" + responseCode));
        
        else {
        	
            Scanner sc = new Scanner(url.openStream());

            while (sc.hasNext()) 
            {
                line += sc.nextLine();
            }
            
            sc.close();
            
            JSONParser parse = new JSONParser();
            
            JSONObject jobj = (JSONObject) parse.parse(line);    //Parsing the String and creating an object to access data
            
            JSONObject obj2 = (JSONObject) jobj.get("main");  // creating object of "main" to access data present in form of key value pair.
     
			JSONArray weathArr =(JSONArray) jobj.get("weather");  //Creating array for "weather" there can be multiple elements for this depending of the live weather of the city
			 
           
			
			//Try-Catch to handle Type cast exception for  current, max and min temperature.
			  
		
			  try {
				  
				  Double temp = (Double)obj2 .get("temp");
				  
				  dataFromApi.setTemp(temp);
			  }
			  
			  catch (Exception e) {
				
				  Long temp = (Long)obj2 .get("temp"); 
				  
				  dataFromApi.setTemp(temp);
			  }
			  
			  try {
				   
				  Double maxTemp = (Double)obj2.get("temp_max");  
                  
				  dataFromApi.setTmax(maxTemp);
				  
              } 
			  catch (Exception e) {
                  
                  
                  long maxTemp = (Long)obj2.get("temp_max");
               
                  dataFromApi.setTmax(maxTemp);
                                  
              }
			  
			  try {
				 
				  Double minTemp = (Double) obj2 .get("temp_min");
			      
				  dataFromApi.setTmin(minTemp);
				  
			  }
			  
			  catch(Exception e){
				   
				  long minTemp = (Long) obj2 .get("temp_min");
				   
				  dataFromApi.setTmin(minTemp);
				  
			  }
			  
			  
			  Double fTemp = (Double) obj2 .get("feels_like"); 
			  
			  Long press = (Long) obj2 .get("pressure");
			  
			  Long hum = (Long) obj2 .get("humidity");
		      
			  String weatherType = "null" ; //Default message for weather description
		      
			  String iconID ="01d";   //Default value for icon
			  
			  
			  for (int i = 0; i < weathArr.size(); i++)
			  {
	                JSONObject jsobj2 = (JSONObject) weathArr.get(i);
	                
	                weatherType=(String) jsobj2.get("description");
	                
	                iconID= (String) jsobj2.get("icon");
			  }
		      	
		      
		    
			//Storing the data into the variables of DataFromAPI class
			  
			  dataFromApi.setCweather(weatherType); 
			
			  dataFromApi.setFlike(fTemp);
			  
			  dataFromApi.setPressure(press); 
			  
			  dataFromApi.setHumidity(hum);
			  
			  dataFromApi.setIconID(iconID); 
			  
			  
				
        }
        return dataFromApi ;
	}
		

}

