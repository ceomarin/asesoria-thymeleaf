/**
 * 
 */
const boton = document.querySelector('button');
const menu = document.querySelector('ul');
boton.addEventListener('click', clickHandler);
	
function clickHandler() {
  menu.classList.toggle('aparecer');
}