function submitQuiz() {
    console.log('submitted');

// obter pontuação de cada resposta

    function respPont (qName) {
        var radiosNo = document.getElementsByName(qName);

        for (var i = 0, length = radiosNo.length; i < length; i++) {
               if (radiosNo[i].checked) {
        // fazer algo com radiosNo
                var answerValue = Number(radiosNo[i].value);
            }
        }
        // mudar NaNs para zero
        if (isNaN(answerValue)) {
            answerValue = 0;
        }
        return answerValue;
    }

// calcular pontuação com a função respPont
    var calcScore = (respPont('q1') + respPont('q2') + respPont('q3') + respPont('q4')  + respPont('q5')
    + respPont('q6') + respPont('q7') + respPont('q8') + respPont('q9') + respPont('q10'));
    console.log("CalcScore: " + calcScore); // funciona!

// função para retornar a resposta correta
    function respCorreta (pergCertaNo, qNumber) {
        console.log("qNumber: " + qNumber);  // logs 1,2,3,4, etc 
        return ("A resposta correta para a pergunta #" + qNumber + ": &nbsp;<strong>" +
            (document.getElementById(pergCertaNo).innerHTML) + "</strong>");
        }

// imprimir respostas corretas somente se incorretas (chama a função respCorreta)
    if (respPont('q1') === 0) {
        document.getElementById('respCorreta1').innerHTML = respCorreta('pergCerta1', 1);
    }
    if (respPont('q2') === 0) {
        document.getElementById('respCorreta2').innerHTML = respCorreta('pergCerta2', 2);
    }
    if (respPont('q3') === 0) {
        document.getElementById('respCorreta3').innerHTML = respCorreta('pergCerta3', 3);
    }
    if (respPont('q4') === 0) {
        document.getElementById('respCorreta4').innerHTML = respCorreta('pergCerta4', 4);
    }
    if (respPont('q5') === 0) {
        document.getElementById('respCorreta5').innerHTML = respCorreta('pergCerta5', 5);
    }
    if (respPont('q6') === 0) {
        document.getElementById('respCorreta6').innerHTML = respCorreta('pergCerta5', 6);
    }
    if (respPont('q7') === 0) {
        document.getElementById('respCorreta7').innerHTML = respCorreta('pergCerta7', 7);
    }
    if (respPont('q8') === 0) {
        document.getElementById('respCorreta8').innerHTML = respCorreta('pergCerta8', 8);
    }
    if (respPont('q9') === 0) {
        document.getElementById('respCorreta9').innerHTML = respCorreta('pergCerta9', 9);
    }
    if (respPont('q10') === 0) {
        document.getElementById('respCorreta10').innerHTML = respCorreta('pergCerta10', 10);
    }

// calcular pontuação possível
    var questionCountArray = document.getElementsByClassName('questao');

    var questionCounter = 0;
    for (var i = 0, length = questionCountArray.length; i < length; i++) {
        questionCounter++;
    }

// mostrar pontuação como "pontuação / pontuação possível"
    var showScore = "Seus acertos: " + calcScore +"/" + questionCounter;
// se 10/10, "Perfeito!"
    if (calcScore === questionCounter) {
        showScore = showScore + "&nbsp; <strong>Pontuação de Craque!</strong>"
    };
    document.getElementById('userScore').innerHTML = showScore;
}

$(document).ready(function() {

$('#submitButton').click(function() {
    $(this).addClass('hide');
});

});