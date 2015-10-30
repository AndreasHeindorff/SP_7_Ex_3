                        var app = angular.module('MemberApp', []);
                app.controller('MemCtrl', ['$scope', '$http', function ($scope, $http) {
                        $http.get('http://localhost:8080/SP_7_Exercise_3_AngularJQuery/api/members').then(function (res) {
                            $scope.members = res.data;
                        });

                    }]);