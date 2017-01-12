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