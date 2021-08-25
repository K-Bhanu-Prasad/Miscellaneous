<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <center>
  Hi ${employee.name}!
  <br>
  WELCOME TO YOUR DETAILS
  <br>
  Your id: ${employee.id}
  <br>
  Mobile no: ${employee.mobileNumber }
  <br>
  DOB: ${employee.dob }
  <br>
  Skills Sets: ${employee.employeeSkills }
  <br>
  Address:
  <br>
  country: ${employee.address.country }
  <br>
  state: ${employee.address.state }
  <br>
  city: ${employee.address.city }
  <br>
  pincode: ${employee.address.pincode }
  <br>
  </center>
</body>
</html>