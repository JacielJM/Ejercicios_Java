let num1 = 12;
num2 = 24;
num3 = 25;
num4 = 92;
num5 = 91;

const resultado1 =
	(num1 < num2 || num2 < num3) && !(num1 != num2) && num5 != num3;
console.log(`La comparación 1 da ${resultado1}`); // false

const resultado2 =
	(num5 > num2 && num4 < num3) || !(num1 == num2) || num3 != num3;
console.log(`La comparación 2 da ${resultado2}`); // true
