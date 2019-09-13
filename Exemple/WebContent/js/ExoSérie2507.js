/**
 * exercices Yahya google forms : chaines caractère
 */
var chaines='Ajeh';
function toutEnMinuscules(chaine){
	var bool=true;
	var long=chaine.length;
	var i;
	while ((i<long) && (bool))
	{
		bool=(a<=chaine[i] && z>=chaine[i]);
		i++;}
	return bool;
}


function toutEnMinuscules2(chaine){
	return chaine==chaine.toLowerCase();
}
toutEnMinuscules2("aaaaffgtr");
/*
true
*/

toutEnMinuscules2("aaHaffgtr");


console.log(toutEnMinuscules(chaines));
/*
Exception: SyntaxError: expected expression, got ')'
@Scratchpad/1:27
*/
/*
Exception: SyntaxError: expected expression, got ')'
@Scratchpad/1:27
*/