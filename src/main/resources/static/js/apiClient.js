const apiUrl = "http://localhost:8080/Ciudades/"
apiClient = (function () {

    return {
        getDatos: function (ciudad, callback) {
            jQuery.ajax({
                url: apiUrl+ ciudad,
                success: function (result) {
                    callback(result);
                },
                async: true
            });
        }
    }

})();