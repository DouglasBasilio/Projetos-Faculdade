window.onload = function(){
	var nome ='Douglas Basilio dos Santos'
	addNomeId('name',nome);
};

var addNomeId = function (id,nome){
	var obj = window.document.getElementById(id);
	obj.innerText=nome;
}