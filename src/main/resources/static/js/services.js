var nombreApp="/springmvc/";

var app = angular.module('ItemsApp', [ "ngResource" ]);

app.controller('ItemController', [ '$scope', '$http',

    function($scope, $http) {
        $scope.getItems = function() {
            $http.get(nombreApp+'items').success(function(data) {
                $scope.Items = data;
            });
        }

        $scope.addItem = function() {
            $http.post(nombreApp+'items',
                {
                    itemId : $scope.itemId,
                    itemDesc : $scope.itemDesc,
                    image : $scope.image
                }
            ).success(function(data) {
                $scope.msg = 'Items creado correctamente';
                $scope.getItems();
            }).error(function(data) {
                $scope.msg = 'Se ha producido un error';
            });
        }
    } ]);