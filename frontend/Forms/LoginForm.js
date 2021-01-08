/*
 ? Para asa ni?
 * We're gonna render the forms ya'll see at the side from the design dynamically using javascript
 ? Nganong dle mugamit ug .html pages? or nganong dle usahon ra?
 * Scale, para mas sayon mu add ug delete ug feature or changes sa code
*/
import Input from '../components/Input.js';
import Button from '../components/Button.js';

const LoginForm = () => {

    const LoginHeader = document.createElement('h1');
    LoginHeader.innerHTML = 'LOGIN';

    const Username = Input('Enter your username', 'text');
    const Password = Input('Enter your password', 'password');

    // ! Massive Smelly code **USE ONLY FOR TESTING
    const LoginButton = Button('Sign in',(e)=>{
        e.preventDefault();
        fetch('http://localhost:7001/TestPayload', {method: 'GET'})
        .then(load => {
            load.json()
            .then(({username: Name, password: Pass}) => {
                if(Username.value == Name && Password.value == Pass)
                    alert('Login successful!');
                else
                    alert('Login unsuccessful!');
            })
            .catch(err => console.trace(err));
        })
        .catch(error => console.trace(error));
    },'click');

    const SignUp = document.createElement('p');
    SignUp.innerHTML = `Don't have an account yet?`;
    SignUp.addEventListener('click', e => {LoginContainer.remove()});

    const InputContainer = document.createElement('div');
    InputContainer.className = 'InputContainer';
    InputContainer.append
    (
        LoginHeader, 
        Username, 
        Password,
        LoginButton,
        SignUp
    );

    const LoginContainer = document.createElement('div');
    LoginContainer.className = 'Form Login';
    LoginContainer.append(InputContainer);

    return LoginContainer;
}

export default LoginForm;