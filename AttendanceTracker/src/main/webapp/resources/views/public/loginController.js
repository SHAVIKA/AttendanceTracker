var loginapp = angular.module('loginApp', [ 'ngRoute' ]);

loginapp.config(function($routeProvider) {
	$routeProvider.when('/login', {
		controller : 'ctrlLogin',
		templateUrl : '/AttendanceTracker/resources/views/public/login_template.html'
	}).when('/forgetpassword', {
		controller : 'ctrlforgotpassword',
		templateUrl : '/AttendanceTracker/resources/views/public/forgot_password.html'
	}).when('/registeruser', {
		controller : 'ctrlregisteruser',
		templateUrl : '/AttendanceTracker/resources/views/public/register_user.html'
	}).otherwise({
		redirectTo : '/login'
	});
});

loginapp.controller('ctrlLogin', function($scope, $location) {
	console.log("=================> calling ctrlLogin...");
});

loginapp.controller('ctrlforgotpassword', function($scope, $location) {
	console.log("=================> calling ctrlforgotpassword...");
	$scope.loginFailMsg = true;
	$scope.loginSuccessMsg = true;
});

loginapp.controller('ctrlregisteruser', function($scope, $location) {
	console.log("=================> calling ctrlregisteruser...");
	$scope.loginFailMsg = true;
	$scope.loginSuccessMsg = true;
});

loginapp.controller('loginTemplate', function($scope, $log, $location) {
	var url = "" + $location.$$absUrl;
	$scope.loginFailMsg = true;
	$scope.loginSuccessMsg = true;
	console.log("=================> calling loginTemplate...URL=>" + url);
	if (url.indexOf("error") >= 0) {
		$scope.loginFailMsg = false;
	}else if (url.indexOf("logout") >= 0) {
		$scope.loginSuccessMsg = false;
	}
});