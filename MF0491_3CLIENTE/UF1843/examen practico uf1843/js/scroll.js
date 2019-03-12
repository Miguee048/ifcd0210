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

function accesibilidad(){
	var body = document.getElementById('colorac');
	var boton = document.getElementById('access');
	boton.onclick = function(){
		body.style.backgroundColor = 'red' ;
	}
}
$(document).ready(function(){
	$('.icono').click(function(){
		$('body, html').animate({
			scrollTop:'0px'
		});

	});
});

var noticias = document.getElementById('noticias');
noticias.onclick = function(){
	scroll(0,1800);
}
var foro = document.getElementById('foro');
foro.onclick = function(){
	scroll(0,2200);
}
