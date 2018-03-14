
var app = angular.module("elqueue", []);

app.controller("AppCtrl", function($scope, $http){


    $scope.events = [];
     $http.get('/api/events').then(function (response){
        $scope.events=response.data;
        console.log(response);
    });




});

