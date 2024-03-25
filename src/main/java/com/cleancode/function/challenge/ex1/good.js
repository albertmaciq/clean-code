function createUser(email, password) {
    validateInput(email, password);
    saveUserToDB(email, password);
}

function validateInput(email, password) {
    if (!userDataIsValid(email, password)) {
        throw new Error('Invalid input!');
    }
}

function userDataIsValid(email, password) {
    return emailIsValid(email) && passwordIsValid(password);
}

function emailIsValid(email) {
    return email && email.includes('@');
}

function passwordIsValid(password) {
    return password && password.trim() !== '';
}

function saveUserToDB(email, password) {
    const user = {
        email: email,
        password: password,
    };
    database.insert(user);
}