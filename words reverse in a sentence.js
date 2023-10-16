// Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad.

function reverseSentence(s){
    const words = s.split(' ');
    const reverseWords = words.map(word => {
        return word.split('').reverse().join('');
    })
    reversedSentence = reverseWords.join(' ');
    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const result = reverseSentence(inputSentence);
console.log(result);