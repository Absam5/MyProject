
      angular.module('distributionServices', ['openlmis', 'ui.bootstrap.modal', 'ui.bootstrap.dialog']).config(['$routeProvider', function ($routeProvider) {
        $routeProvider.
          when('/home', {controller:distributionServicesController, templateUrl:'partials/list.html'}).
          when('/list', {controller:distributionServicesController, templateUrl:'partials/create.html'}).
          otherwise({redirectTo:'/home'});
      }]);