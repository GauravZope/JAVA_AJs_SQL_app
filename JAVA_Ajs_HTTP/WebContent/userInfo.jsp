
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script LANGUAGE="JavaScript" TYPE="text/javascript" src="/JAVA_Ajs_HTTP/js/angular.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
var myHTTPAJsApp = angular.module("myHTTPAJsApp", [])
						.controller("myEmployeeCtrl", function($scope,$http) {
							$scope.getDataFromServer = function() {
								$http({
									method: 'GET',
									url : 'employeeDetailsAJs'
								}).success(function(data, status, headers, config) {
									var data1 = data;
									console.log(data1)
									$scope.person = data1;
								}).error(function(data, status, headers, config) {
									// called asynchronously if an error occurs
									// or server returns response with an error status.
								});
							};
						});
						
</script>
<title>Welcome Page</title>
</head>
<body data-ng-app="myHTTPAJsApp">
<div data-ng-controller="myEmployeeCtrl">
<button data-ng-click="getDataFromServer()">Click Me!!!</button><br>
<h3>Total number of records are {{ person.length }}</h3>
<div ng-repeat="emp in person">
[{{$index + 1}}]
First Name : {{emp.firstName }}<br>
Last Name: {{ emp.lastName }}<br>
User Name: {{ emp.windowsAdsUserId }}<br>
Mobile Number: {{ emp.mobileNo }}<br><br>
</div>
</div>
</body>
</html>