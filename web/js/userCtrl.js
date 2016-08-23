// Create a controller for the profolioApp, using the app reference
// 'profolioApp' injecting $scope and the $http service into this controller.
var userCtrl = profolioApp.controller("userCtrl", function($scope, $http) {
    // Assign the scope to a named 'vm' short for view-model
    // ...by popular convention.
    var vm = $scope;
    
    // Set the posts property on the scope.
    vm.users = [];
    
    // Now populate the property asynchronously.
    $http.get("user/all").then(function (response) {
        // Once the server responds, update the 'users' collection in scope.
        vm.users = response.data || [];
    });
});