/**
 * Compter le nombre d'occurences d'une lettre dans une phrase
 */

function compte(lettre,phrase){
	var len=phrase.length;
	var count=0;
	for (i=0;i<len;i++){
		if (lettre==phrase[i]){
			count++;
		}
	}
	return count;
}
var lettre=window.prompt("saississez votre caractère");
var phrase=window.prompt("saisissez votre chaine de caractère");
console.log(compte(lettre,phrase));