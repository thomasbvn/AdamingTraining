/**
 * script transformant série 2507, exo4 //  but : 1ère en maj, et suivantes du mot en min (si pas déjà mis )
 */
var x="hKJJbé";
function firstMaj(mot){
	//var long=mot.length();
	return mot[0].toUpperCase()+mot.substring(1).toLowerCase();
}
	/*var i;
	for (i=1;i<long;i++){
		firs+=mot[i].toLowerCase();
	}
	return firs;*/
console.log(firstMaj(x));