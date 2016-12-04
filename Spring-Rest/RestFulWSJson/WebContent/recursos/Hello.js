$("#fetchContacts").bind("click", function() {

            $.get("http://192.168.1.100:8083/RestFulWSJson/countries", function(data) {

                $.each(data, function(i, contact) {

                    $(".data-contacts-js").append(
                        "<tr><td>" + contact.id + "</td>" +
                        "<td>" + contact.countryName + "</td>" +
                        "</tr>");
                });

            });
        });