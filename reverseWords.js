// A. Take a sentence as an input and reverse every word in that sentence.
// a. Example - This is a sunny day > shiT si a ynnus yad.
function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = [];

    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        let reversedWord = '';

        for (let j = word.length - 1; j >= 0; j--) {
            reversedWord += word[j];
        }

        reversedWords.push(reversedWord);
    }

    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const sentense = "This is a sunny day";
console.log(reverseWordsInSentense(sentense));
