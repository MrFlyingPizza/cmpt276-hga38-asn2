window.onload = function() {

    let random_name = "rectangle";
    $.ajax({
        url: 'https://randomuser.me/api/',
        dataType: 'json',
        success: function(data) {
            const name = data.results[0].name;
            random_name = name.first + ' ' + name.last;
        },
        async: false
    });

    const height = document.getElementById('height');
    const width = document.getElementById('width');
    const color = document.getElementById('color');
    const name = document.getElementById('name');
    const display = document.getElementById('display');

    const inputs = document.getElementsByTagName('input');

    for (let i = 0; i < inputs.length; i++)
    {
        inputs[i].addEventListener('input', updateDisplay);
        if (inputs[i].type === 'color') {
            inputs[i].value = '#' + Math.round(Math.random() * 0xFFFFFF).toString(16).padStart(6, '0');
        }

        if (inputs[i].type === 'number') {
            inputs[i].value = Math.round(Math.random() * 1000).toString();
        }

        if (inputs[i].id === 'name') {
            inputs[i].value = random_name;
        }
    }

    function updateDisplay(e)
    {
        display.innerText = name.value;
        display.style.backgroundColor = color.value;
        display.style.width = width.value + 'px';
        display.style.height = height.value + 'px';
    }
};
