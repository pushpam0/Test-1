var array=[0,1,2,3,4,5,6,7,7,8,9,10];
var dup;
for(var i=0;i<array.length;i++){
	dup=array[i];
	if(dup==array[i+1])
		break;
}
console.log(dup);