// Initial the AngularJS Profolio App.
var profolioApp = angular.module("profolioApp", [])
        // Configure the route provider to respond to our endpoints.
        .config(function ($routeProvider) {
            // Configure a home view => '/'
            $routeProvider.when( '/', {
                templateUrl: 'view/home.html',
                controllerAs: 'vm',
                controller: 'homeCtrl'
            }),
            // Configure a blog view => '/blog'
            $routeProvider.when( '/blog', {
                templateUrl: 'view/blog.html',
                controllerAs: 'vm',
                controller: 'blogCtrl'
            }),
            // Configure a post view => '/blog/{id}'
            $routeProvider.when( '/blog/:id', {
                templateUrl: 'view/post.html',
                controllerAs: 'vm',
                controller: 'blogCtrl'
            }),
            // Configure a users view => '/users'
            $routeProvider.when( '/users', {
                templateUrl: 'view/users.html',
                controllerAs: 'vm',
                controller: 'usersCtrl'
            }),
            // Configure a user view => '/users/{id}'
            $routeProvider.when( '/users/:id', {
                templateUrl: 'view/user.html',
                controllerAs: 'vm',
                controller: 'usersCtrl'
            }),
            // Configure a project view => '/projects/{id}'
            $routeProvider.when( '/projects/:id', {
                templateUrl: 'view/project.html',
                controllerAs: 'vm',
                controller: 'projectsCtrl'
            }),
            // Configure a project gallery view => '/projects'
            $routeProvider.when( '/projects', {
                templateUrl: 'view/projects.html',
                controllerAs: 'vm',
                controller: 'projectsCtrl'
            })
        });