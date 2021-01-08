const Connection = require('../../database/backend.mysql');
/**
 * 
 * @param {String} Username 
 * @param {String} Password 
 * @param {String} FullName 
 * @param {String} Address 
 */
module.exports = async( Username, Password, FullName, Address ) => {
    try {
        await Connection(`INSERT INTO student (student_id,student_user_name,student_user_password,student_user_full_name,student_user_address) VALUES (null,'${Username}','${Password}','${FullName}','${Address}');`);
        return true;
    } catch (error) {
        console.trace(error);
    }
}