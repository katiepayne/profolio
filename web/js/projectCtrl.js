// Create a controller for the profolioApp, using the app reference
// 'profolioApp' injecting $scope and the $http service into this controller.
var projectCtrl = profolioApp.controller("projectCtrl", function($scope, $http) {
    // Assign the scope to a named 'vm' short for view-model
    // ...by popular convention.
    var vm = $scope;
    
    // Set the posts property on the scope.
    vm.projects = [];
    
    // Now populate the property asynchronously.
    $http.get("project/all").then(function (response) {
        // Once the server responds, update the 'projects' collection in scope.
        vm.projects = response.data || [];
    });
});