var indexapp = angular.module('indexApp', [ 'datatables', 'ngRoute', 'ngResource' ]).constant('API_URL', 'http://localhost:8080/AttendanceTracker').constant(
		'TEMPLATE_URL', '/AttendanceTracker/resources/views/protected');

indexapp.config(function($routeProvider, TEMPLATE_URL) {

	$routeProvider.when('/', {
		controller : 'ctrlDashboard',
		templateUrl : TEMPLATE_URL + '/dashboard/dashboard.html'
	}).when('/dashboard', {
		controller : 'ctrlDashboard',
		templateUrl : TEMPLATE_URL + '/dashboard/dashboard.html'
	}).when('/organizationList', {
		controller : 'ctrlOrganizationList',
		templateUrl : TEMPLATE_URL + '/organization/organizationList.html'
	}).when('/organization/:id', {
		controller : 'ctrlOrganization',
		templateUrl : TEMPLATE_URL + '/organization/organization.html'
	}).when('/employeelist', {
		controller : 'ctrlemployeelist',
		templateUrl : TEMPLATE_URL + '/employee/employeelist.html'
	}).when('/employeedetails/:id', {
		controller : 'ctrlemployeedetails',
		templateUrl : TEMPLATE_URL + '/employee/employeedetails.html'
	});
});

/**
 * @Type : Factory Service
 * @method : CommanService : This will serve the RestFull request for common data list
 * @Service : country() -> Get Country List data,
 * @Service : currency() -> Get Currency List data,
 * @Service : organizationType() -> Get OrganizationType List data,
 * @Service : timezone() -> Get TimeZone List data,
 */
indexapp.factory('CommanService', [ '$resource', '$http', '$q', 'API_URL', function($resource, $http, $q, API_URL) {
	var country = API_URL + '/countryList/';
	var currency = API_URL + '/currencyList/';
	var organizationtype = API_URL + '/organizationTypeList/';
	var timezone = API_URL + '/timeZoneList/';

	return ({
		countryList : countryList,
		currencyList : currencyList,
		organizationTypeList : organizationTypeList,
		timezoneList : timezoneList
	});

	function countryList() {
		return (gethttpRequest(country));
	}

	function currencyList() {
		return (gethttpRequest(currency));
	}

	function organizationTypeList() {
		return (gethttpRequest(organizationtype));
	}

	function timezoneList() {
		return (gethttpRequest(timezone));
	}

	function gethttpRequest(url) {
		return $http.get(url).then(function(response) {
			return response.data;
		}, function(errorResponse) {
			console.error("=================> Common-Rest response [FAIL] / Fetching data error...");
			return $q.reject(errorResponse);
		});
	}

} ]);

indexapp.controller('NavbarController', function($scope, $location) {
	$scope.getClass = function(path) {
		console.log('---> $location.path()================>>>>>>' + $location.path() + ' path===============>' + path);
		if ($location.path().substr(0, path.length) == path) {
			return true;
		} else {
			return false;
		}
	}
});

indexapp.controller('ctrlDashboard', function($scope, $log) {
	// console.log("=================> calling ctrlDashboard through routeProvider...");
});

indexapp.controller('ctrlemployeelist', function($scope, $log) {
	// console.log("=================> calling ctrlemployeelist through routeProvider...");
});

indexapp.controller('ctrlemployeedetails', function($scope, $log) {
	// console.log("=================> calling ctrlemployeedetails through routeProvider...");
});

indexapp.controller('ctrlOrganizationList', function($scope, $log) {
	// console.log("=================> calling ctrlOrganizationList through routeProvider...");
});

indexapp.controller('ctrlOrganization', function($scope, $log) {
	// console.log("=================> calling ctrlOrganization through routeProvider...");
});
