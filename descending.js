function arrSort(arr) { 
	arr.sort((a,b)=>a-b); 
	arr.reverse(); 
	return arr; 
} 
var input = prompt("Please enter comma-separated values for the array:");
var userInputArray = input.split(',');
console.log(arrSort(userInputArray));
