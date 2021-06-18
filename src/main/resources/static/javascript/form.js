window.onload = function() {
    const height = document.getElementById('height');
    const width = document.getElementById('width');
    const color = document.getElementById('color');
    const name = document.getElementById('name');
    const display = document.getElementById('display');

    const inputs = document.getElementsByTagName('input');

    for (let i = 0; i < inputs.length; i++)
    {
        inputs[i].addEventListener('input', updateDisplay);
    }

    function updateDisplay(e)
    {
        display.innerText = name.value;
        display.style.backgroundColor = color.value;
        display.style.width = width.value + 'px';
        display.style.height = height.value + 'px';
    }
};
