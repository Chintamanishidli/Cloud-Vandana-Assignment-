function reverseString() {
    const inputElement = document.getElementById("input");
    const reversedElement = document.getElementById("reversedOutput");

    const inputString = inputElement.value;
    const reversedString = reverse(inputString);

    reversedElement.textContent = reversedString;
}

function reverse(inputString) {
    return inputString.split('').reverse().join('');
}