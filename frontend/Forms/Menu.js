import RegistrationForm from "./LoginForm.js";
import LoginForm from "./RegistrationForm.js";


export default function Menu()
{
    
    // Default View
    const NORSU_LOGO = document.createElement('img');
    NORSU_LOGO.src = '../../assets/norsu-logo.ico';

    const NORSU_HEADER = document.createElement('h1');
    NORSU_HEADER.innerHTML = 'Our Pride, Our Hope, Our Future';

    const HeroContainer = document.createElement('div');
    HeroContainer.className = 'HeroContainer';
    HeroContainer.append(NORSU_LOGO,NORSU_HEADER);

    const MenuContainer = document.createElement('div');
    
    MenuContainer.className = 'MenuContainer'
    MenuContainer.append(
                        HeroContainer,
                        LoginForm()
                        );

    return MenuContainer;
}