const nombre = "carlos"
const apellido = "Azaustre"
console.log(´${ nombre } ${ apellido }´)

function Component({ backgroundColor }){
    return (<div className={backgroundColor}> </div>)
}


// FUNCION DE FLECHA
const x = () => {
    return ""
}

// LISTAS
function ListaTareas(){
    return(
        <ul>
            {listado.map(item => 
                <li>{item.nombre}</li>
            )}
        </ul>
    )
}

// DESTRUCTURING
const cuadrado ={
    x : 10,
    y : 10
}

function calcularAreas(cuadrado){
    const {x,y} = cuadrado
    return cuadrado.x * cuadrado.y;
    return x * y;
}


//PARAMETROS POR DEFECTO

function suma (x = 0 , y = 0){
    //si no le paso nada, toma el valor de 0, avitando errores
}

//PAREMTROS RES
const array = [1,2,3,4,5,6];
const otroArray = [7,8,9,0]
const combinacion = [...array, ...otroArray]//tambien sirve para juntar los atributos de objetos, sirvve en los componentes al ponerlos como props

//operaciones ternarias
let modelo = coche.model ? coche.model : 'X';//despues de ? es verdader0o, despues de : es falso

//metodos de array
find
some
every
includes
map
filter
reduce

//

a == a ==null ? 0 : a

//optional chaning
user?.city?.zipcode//con esto verifico que un objeto tenga esos atributos, en lugar de corroborar induvidualmente



