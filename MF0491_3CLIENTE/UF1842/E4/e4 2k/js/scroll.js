var inicio = document.getElementById("inicio");
	inicio.onclick = function(){
	inicio.animate({scrollTop:0},1000);
}

var torneos = document.getElementById('torneos');
torneos.onclick = function(){
	scroll(0,815);
}


var premios = document.getElementById('premios');
premios.onclick = function(){
	scroll(0,1400);
}