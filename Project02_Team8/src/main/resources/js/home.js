var usernameText;
var passwordText;

function test() {
    alert("this is a test");
}

function login() {
    //TEMP---------------------------------------------
    window.location.href = "landing_page.html";

    //th.location.href = "landing_page.html";
    return;
    //-------------------------------------------------

    updateText();
    let isValid = validateCredentials();
    if (isValid) {
        alert("LOGGIN IN: username: " + usernameText + " | password: " + passwordText);
        return;
    }
    alert("Invalid Credentials");
}

function signup() {
    updateText();
    let isValid = validateCredentials();
    if (isValid) {
        alert("SIGNING UP: username: " + usernameText + " | password: " + passwordText);
        return;
    }
    alert("Invalid Credentials");
}

function updateText() {
    usernameText = document.getElementById("name").value;
    passwordText = document.getElementById("password").value;
}

function validateCredentials() {
    if (!usernameText || !passwordText) {
        console.log("Empty field")
        return false;
    }
    console.log("Valid input")
    return true;
}