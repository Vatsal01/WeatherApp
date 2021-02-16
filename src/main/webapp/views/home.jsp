<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<title>WeatherApp</title>

     <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"></script>
     <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
     <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
     <link href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">  
     <link href="https://fonts.googleapis.com/css?family=Montserrat:900|Work+Sans:300" rel="stylesheet"> 
     <link href="https://fonts.googleapis.com/css?family=Quicksand:300,500" rel="stylesheet">
      <link rel="stylesheet" type="text/css" href="views/p1.css">      
     
</head>

<body>

<div align="center" class="container">

<h1 class="display-4 p-2">F-Secure</h1>

<h1 class="display-6 p-4">Weather Station</h1>

<form action="subDetails">
<br>

Unit : &nbsp <input type="radio" name="unit" value="1" checked=true required/> Celsius
  <input type="radio" name="unit" value="2" /> Fahrenheit <br>
  <br>
  <br>
  
<h3 class="display-6 p-2"> Please Enter City Name</h3><br>


    <input type="text" id="city" name="city" required /> <br>
 
  <br>
  <br>
  
    <input type="submit" value="Submit" class="registerbtn" /><br>
  
  <br>
  <br>
  <br>
  <br>
</form>

</div>

<div class="bottom">
 <footer class="bg-dark align-top " >
  <div class="d-flex justify-content-between" >
    <div class="p-2 text-white">F-Secure</div>
    <div class="p-2 text-white"> Trainee Software Engineer</div>
    <div class="p-2 text-white">Vatsal Singh <br>
    </div>
      </div>
        
 </footer>
</div>

    
</body>
</html>