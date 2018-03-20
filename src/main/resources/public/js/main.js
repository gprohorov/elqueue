
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




});

