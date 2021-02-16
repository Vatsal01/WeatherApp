<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<title>WeatherApp</title>

<link href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet"> 

<link href="https://fonts.googleapis.com/css?family=Quicksand:500" rel="stylesheet"> 

<link rel="stylesheet" type="text/css" href="views/p2.css">

</head>

<body>

<div align="center">
<h1 class="display-1 p-2"> ${data.city}</h1><br>
<br>
<h4 class="display-4 p-4">${data.temp} ${data.unit} <img src=${data.icon} style="vertical-align:middle"></h4>

<h3 class="display-4 p-4">${data.desc} </h3>

<h3 class="display-5 p-4">Feels Like : ${data.feelLike} ${data.unit}</h3>

<h3 class="display-5 p-4"> Max  : ${data.max} ${data.unit}</h3>

<h3 class="display-5 p-4"> Min  : ${data.min} ${data.unit}</h3>

<h3 class="display-5 p-4"> Pressure : ${data.press} hPa</h3>

<h3 class="display-5 p-4"> Humidity: ${data.hum} %</h3>


<br>
<br>
<br>


</div>

<div class="fixed-bottom">
 <footer class="bg-dark align-top " >
  <div class="d-flex justify-content-between" >
    <div class="p-2 text-white">F-Secure</div>
    <div class="p-2 text-white"> Trainee Software Engineer </div>
    <div class="p-2 text-white">Vatsal Singh <br>
    </div>
      </div>
        
 </footer>
</div>
</body>
</html>