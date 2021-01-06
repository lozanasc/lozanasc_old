import RegistrationForm from "./LoginForm.js";
import LoginForm from "./RegistrationForm.js";


export default function Menu()
{
    
    // Default View
    

    const MenuContainer = document.createElement('div');
    // This code really do be smelly why are we tryin to render this using DOM
    MenuContainer.className = 'MenuContainer'
    MenuContainer.append();

    return MenuContainer;
}