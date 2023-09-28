// A. Take a sentence as an input and reverse every word in that sentence.
// a. Example - This is a sunny day > shiT si a ynnus yad.
function reverseWordsInSentense(sentense) {
	const words = sentense.split(" ");
	const reverseWords = words.map((word) => reverseWord(word));
	const newSentence = reverseWords.join(" ");

	return newSentence;
}
function reverseWord(word) {
	return word.split("").reverse().join("");
}

const sentense = "This is a sunny day";
console.log(reverseWordsInSentense(sentense));
