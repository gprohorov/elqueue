
var app = angular.module("elqueue", []);

app.controller("AppCtrl", function($scope, $http){


    $scope.events = [];
     $http.get('/api/event').then(function (response){
        $scope.events=response.data;
        console.log(response);
    });


    $scope.patients = [];
     $http.get('/api/patients/today').then(function (response){
        $scope.patients=response.data;
        console.log(response);
    });

    $scope.persons = [];
     $http.get('/api/persons').then(function (response){
        $scope.persons=response.data;
        console.log(response);
    });




});

