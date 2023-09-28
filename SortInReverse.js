// Perform sorting of an array in descending order.
function sort(arr) {
	const n = arr.length;

	for (let i = 0; i < n - 1; i++) {
		for (let j = 0; j < n - i; j++) {
			if (arr[j] < arr[j + 1]) {
				const temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	return arr;
}

const arr = [5, 2, 9, 1, 5, 6];
console.log(sort(arr));
