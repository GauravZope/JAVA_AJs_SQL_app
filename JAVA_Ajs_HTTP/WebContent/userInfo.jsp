
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script LANGUAGE="JavaScript" TYPE="text/javascript" src="/JAVA_Ajs_HTTP/js/angular.min.js"></script>
	<script LANGUAGE="JavaScript" TYPE="text/javascript" src="/JAVA_Ajs_HTTP/js/employeeDetailsModuleJS.js"></script>
	<link rel=stylesheet href="/JAVA_Ajs_HTTP/css/commonCSS.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome Page</title>
</head>
<body data-ng-app="myHTTPAJsApp">
	<div data-ng-controller="myEmployeeCtrl">
		<button data-ng-click="getDataFromServer()">Click Me!!!</button>
		<br>
		<h3>Total number of records are {{ person.length }}</h3>

		<table>
			<thead>
				<th>Index</th>
				<th>Employee Code</th>
				<th>First Name</th>
				<th>Middle Name</th>
				<th>Last Name</th>
				<th>Mobile Number</th>
				<th>Email Id</th>					
				<th>User Login Id</th>
				<th>Gender</th>
				<th>Staus</th>	
				<th>Date Of Birth</th>
			</thead>
			<tbody>
				<tr ng-repeat="emp in person">
					<td>{{$index + 1}}</td>
					<td>{{emp.employeeCode }}</td>
					<td>{{emp.firstName }}</td>
					<td>{{emp.middleName }}</td>
					<td>{{emp.lastName }}</td>
					<td>{{emp.mobileNo }}</td>
					<td>{{emp.emailId }}</td>
					<td>{{emp.windowsAdsUserId }}</td>
					<td>{{emp.gender }}</td>
					<td>{{emp.statusId }}</td>
					<td>{{emp.dateOfBirth }}</td>
				</tr>
			</tbody>	
		</table>
	</div>

</body>
</html>