            $(document).ready(function () {
                jQuery.ajax({
                    url: "http://localhost:8080/SP_7_Exercise_3_AngularJQuery/api/members",
                    type: "GET",
                    contentType: 'application/json; charset=utf-8',
                    success: function (resultData) {
                        var vPool = "";
                        var friendArr;
                        jQuery.each(resultData, function (i, val) {
                            vPool += val.id + " " + val.name + " " + val.age + " " + val.eyeColor + " " + val.email + " " + val.friends + "<br><br>";
                        });

                        //We add vPool HTML content to #myDIV
                        $('#memDiv').html(vPool);
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                    },
                    timeout: 120000
                });
            });