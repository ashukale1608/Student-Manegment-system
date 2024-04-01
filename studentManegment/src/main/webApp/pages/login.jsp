<%@ page language="java" contentType="text/html ; charset=UTF-8"
  pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
  "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html ; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <style>
      .file{
        background-color:#17a2b8;
        border-color: #17a2b8;
        color: white;
        height: 32px;
      }
      input#file-upload-button{
        background-color:#17a2b8;
        border-color: #17a2b8;
        color: white;
        height: 32px;        
      }
    </style>
  </head>
<body>
  <div>
    <form action="getAllData">
      <h5>get all data</h5>
      <button class="btn btn-info">getAllData</button>
    </form>
  </div>
  <br><br>
  <div>
    <form method="post" action="/uploadFile" enctype="multipart/form-data">
      <input class="file" type="file" name="file" >
      <input type="submit" value="Upload" class="btn btn-sm btn-info">
  </form>
  </div> 
</body>
</html>