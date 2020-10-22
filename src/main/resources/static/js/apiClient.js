//const apiUrl = "http://localhost:8080/Ciudades/"
const heroku = "https://herreradavid-arsw-t2.herokuapp.com/Ciudades/"
apiClient = (function () {

    return {
        getDatos: function (ciudad, callback) {
            jQuery.ajax({
                url: heroku+ ciudad,
                success: function (result) {
                    callback(result);
                },
                async: true
            });
        }
    }

})();