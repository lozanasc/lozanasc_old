import RegistrationForm from "./RegistrationForm.js";
import LoginForm from "./LoginForm.js";


export default function Menu()
{
    
    const NORSU_LOGO = document.createElement('img');
    NORSU_LOGO.src = '../../assets/norsu-logo.ico';

    const NORSU_HEADER = document.createElement('h1');
    NORSU_HEADER.innerHTML = 'Our Pride, Our Hope, Our Future';

    const Hero = document.createElement('div');
    Hero.className = 'Hero';
    Hero.style = 'margin: auto; display: flex; flex-flow: column;';
    Hero.append(NORSU_LOGO, NORSU_HEADER);

    const HeroContainer = document.createElement('div');
    HeroContainer.className = 'HeroContainer';
    HeroContainer.appendChild(Hero);

    const MenuContainer = document.createElement('div');
    MenuContainer.className = 'MenuContainer'
    MenuContainer.append(
                        HeroContainer,
                        LoginForm()
                        );

    return MenuContainer;
}