function setData() {
    const form = document.getElementsByName('form1')
    const userName = document.getElementsByName('username')


    form.addEventListener('submit', function (e) {
        e.preventDefault();
        const userNameValue = userName.value;
        console.log(userNameValue)
        localStorage.setItem('user-name', userNameValue);


        window.location.href = "quiz.html";
    });
}

function getData(){
    const userName =localStorage.getItem('user-name');

    document.getElementById('user-name').textContent =userName;

}