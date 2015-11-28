(function($){
    
    //
    function onSubmitForm($event) {
//[TODEL]        console.log("coucou");
        console.log(">>> onSubmitForm");

        // annuler l'�v�nement : "submit"
        $event.preventDefault();

        $.ajax({
            method: "GET", // by default
            url: "rest/weather",
            dataType: "json",
            data: {
                zip: $("#cp").val()
            }
        }).done(function (data) {
            console.log(data);
            $(".ecran").toggleClass("hide");
            // valorisation du HTML
            $("#data-name").text(data.name);
        });
    }

    // gestion du clique pour r�-afficher l'�cran
    function onClickRetour() {
        $(".ecran").toggleClass("hide");
    }

    $("#formulaire-meteo").on("submit", onSubmitForm);
    $("#retour").on("click", onClickRetour);
}($));