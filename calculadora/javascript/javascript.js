//Declaramos variables
var operandoa;
var operandob;
var operacion;
function init(){
  //variables
  var resultado = document.getElementById('resultado');
  var reset = document.getElementById('reset');
  var suma = document.getElementById('suma');
  var resta = document.getElementById('resta');
  var multiplicacion = document.getElementById('multiplicacion');
  var division = document.getElementById('division');
  var igual = document.getElementById('igual');
  var uno = document.getElementById('uno');
  var dos = document.getElementById('dos');
  var tres = document.getElementById('tres');
  var cuatro = document.getElementById('cuatro');
  var cinco = document.getElementById('cinco');
  var seis = document.getElementById('seis');
  var siete = document.getElementById('siete');
  var ocho = document.getElementById('ocho');
  var nueve = document.getElementById('nueve');
  var cero = document.getElementById('cero');
}

  uno.onclick = function(e){
      resultado.textContent = resultado.textContent  + "1";
    var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  dos.onclick = function(e){
      resultado.textContent = resultado.textContent  + "2";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  tres.onclick = function(e){
      resultado.textContent = resultado.textContent  + "3";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  cuatro.onclick = function(e){
      resultado.textContent = resultado.textContent  + "4";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  cinco.onclick = function(e){
      resultado.textContent = resultado.textContent  + "5";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  seis.onclick = function(e){
      resultado.textContent = resultado.textContent  + "6";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  siete.onclick = function(e){
      resultado.textContent = resultado.textContent  + "7";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  ocho.onclick = function(e){
      resultado.textContent = resultado.textContent  + "8";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  nueve.onclick = function(e){
      resultado.textContent = resultado.textContent  + "9";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  cero.onclick = function(e){
      resultado.textContent = resultado.textContent  + "0";
      var sonidoClick = document.getElementById('click');
    sonidoClick.play();
  }
  reset.onclick = function(e){
    var sonidoClick = document.getElementById('operatorios');
    sonidoClick.play();
      resetear();
  }
  suma.onclick = function(e){
      operandoa = resultado.textContent;
      var sonidoClick = document.getElementById('operatorios');
    sonidoClick.play();
      operacion = "+";
      limpiar();
  }
  resta.onclick = function(e){
      operandoa = resultado.textContent;
      var sonidoClick = document.getElementById('operatorios');
    sonidoClick.play();
      operacion = "-";
      limpiar();
  }
  multiplicacion.onclick = function(e){
      operandoa = resultado.textContent;
      var sonidoClick = document.getElementById('operatorios');
    sonidoClick.play();
      operacion = "*";
      limpiar();
  }
  division.onclick = function(e){
      operandoa = resultado.textContent;
      var sonidoClick = document.getElementById('operatorios');
    sonidoClick.play();
      operacion = "/";
      limpiar();
  }
  igual.onclick = function(e){
      operandob = resultado.textContent;
      var sonidoClick = document.getElementById('total');
    sonidoClick.play();
      resolver();
  }
  function limpiar(){
  resultado.textContent = "";
}
function resetear(){
  resultado.textContent = "";
  operandoa = 0;
  operandob = 0;
  operacion = "";
}
function resolver(){
  var res = 0;
  switch(operacion){
    case "+":
      res = parseFloat(operandoa) + parseFloat(operandob);
      break;
    case "-":
        res = parseFloat(operandoa) - parseFloat(operandob);
        break;
    case "*":
      res = parseFloat(operandoa) * parseFloat(operandob);
      break;
    case "/":
      res = parseFloat(operandoa) / parseFloat(operandob);
      break;
  }
  resetear();
  resultado.textContent = res;
}

