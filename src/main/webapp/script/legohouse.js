/* 
 * BenedikteEva
 * Lego Houses
 */



function myFunction() {
    var x = document.getElementById("myButton1");
    if (x.style.display === "none") {
        x.style.display = "button";
    } else {
        x.style.display = "none";
    }
}

$(document).ready(function(){
    $("form.form-once-only").submit(function () {
        $(this).find(':button1').prop('disabled', true);
    });
}
