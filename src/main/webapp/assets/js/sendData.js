function send(){
    var formData = document.getElementById("formData");
    var object = {};
    var jsonarr = [];
    var j=1;
    for(var i=0;i<formData.length;i=i+2){
        object = {
            Element: {
                id:j,
                type:"text",
                name:formData.elements[i].value,
            }
        };
        jsonarr.push(object);
        j = j+1;
    }
    var json = JSON.stringify(jsonarr);
    console.log(json);
}