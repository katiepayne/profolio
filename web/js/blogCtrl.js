// Create a controller for the profolioApp, using the app reference
// 'profolioApp' injecting $scope and the $http service into this controller.
var postsCtrl = profolioApp.controller("blogCtrl", function($scope, $http) {
    // Assign the scope to a named 'vm' short for view-model
    // ...by popular convention.
    var vm = $scope;
    
    // Expose view data.
    vm.title = "Recent Posts";
    
    // Set the posts property on the scope.
    vm.posts = [];
    
    // Now populate the property asynchronously.
    $http.get("blog/recent").then(function (response) {
        // Once the server responds, update the 'posts' collection in scope.
        vm.posts = response.data || [];
    });
});