<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Hello World!</title>
</head>
<body style="background-color: aquamarine;">
  <form action="encode" method="post">
    <p>BASE 64 ENCODING</p>
    <p>
        <input name="input1" value=${preinput1}>
        <input type="submit" value="Encode">
    </p>
    <p>Result: </p>
    <p><input name="res1" value=${res1}></p>
  </form>
  <form action="decode" method="post">
    <p>BASE 64 ENCODING</p>
    <p>
        <input name="input2" value=${preinput2}>
        <input type="submit" value="Decode">
    </p>
    <p>Result: </p>
    <p><input name="res2" value=${res2}></p>
  </form>
</body>
