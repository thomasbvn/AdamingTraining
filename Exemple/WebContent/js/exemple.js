/**
 *  index
 */
const AGE_MAJORITE=18;
function majeur(age)
{
return age>=AGE_MAJORITE;
}
var age=5;
console.log("Est majeur ? 5");
console.log(majeur(age));
function sommePrem(n){
	 /*if (n=0){
		return 0;
	}
	else{
		return n+sommePrem(n-1);
}  -->
	}*/
	S=0;
	for (var i=1;i<n+1;i++){
		S+=i;
		}
	return S;
	}
var ent=5;
console.log(sommePrem(ent));