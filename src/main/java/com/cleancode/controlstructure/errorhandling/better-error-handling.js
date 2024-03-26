if (!isEmail) {
    const error = new Error('Invalid input');
    error.code = 422;
    throw error;
}