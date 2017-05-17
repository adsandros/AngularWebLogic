var nombreApp="/springmvc/";

var app = angular.module('films', [ "ngResource" ]);

app.controller('ItemController', [ '$scope', '$http',

    function($scope, $http) {
        $scope.getFilms = function() {
            $http.get(nombreApp+'items').success(function(data) {
                $scope.films = data;
            });
        }

        $scope.addFilm = function() {
            $http.post(nombreApp+'items',
                {
                    itemId : $scope.itemId,
                    itemDesc : $scope.itemDesc,
                    image : $scope.image
                }
            ).success(function(data) {
                $scope.msg = 'Items creado correctamente Ok';
                $scope.getFilms();
            }).error(function(data) {
                $scope.msg = 'Se ha producido un error';
            });
        }
    } ]);