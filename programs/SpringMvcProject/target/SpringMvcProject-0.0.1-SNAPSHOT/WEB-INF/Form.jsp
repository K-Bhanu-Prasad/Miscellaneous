<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <center>
  <h1>Employee Form</h1>
  <form:errors path="employee.*" />
  <form action="employeeDetailsWithModel" method="post">
  <table>
    <tr>
      <td>Employee name: </td> <td><input type="text" name="name" /></td>
    </tr>
    <tr>
      <td>Employee Id:  </td> <td><input type="text" name="id"/></td>
    </tr>
    <tr>
      <td>Mobile number: </td> <td><input type="text" name="mobileNumber"/></td>
    </tr>
    <tr>
      <td>DOB (yyyy*mm*dd):</td> <td><input type="text" name="dob"/></td>
    </tr>
    <tr>
      <td>Skill set: </td> <td><select name="employeeSkills" multiple>
                        <option value="Java Core">Java Core</option>
                        <option value="Spring Core">Spring Core</option>
                        <option value="Sencha">Sencha</option>
                        <option value="Dojo">Dojo</option>
                     </select></td>
    </tr>
  
  </table>
  
  <table>
    <tr><td>Address:</td></tr>
    <tr><td>country:</td><td><input type="text" name="address.country"/></td></tr>
    <tr><td>state: </td><td><input type="text" name="address.state"/></td></tr>
    <tr><td>city: </td><td><input type="text" name="address.city"/></td></tr>
    <tr><td>pincode: </td><td><input type="text" name="address.pincode"/></td></tr>
    
    
  </table>
    <input type="submit"/>
  </form>
  </center>
</body>
</html>