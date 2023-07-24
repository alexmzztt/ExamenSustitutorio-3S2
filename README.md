# ExamenSustitutorio-3S2

## Pregunta 1

Requisito 1: colocación de piezas

Se definen los limites y lo que constituye una colocacion no valida de una pieza. Se puede
colocar una pieza en cualquier espacio vacío de un tablero de 3×3.

Dividiremos el requisito en 3 pruebas.

Prueba limites del tablero I

Cuando una pieza se coloca en cualquier lugar fuera del eje x, se lanza RuntimeException, en esta prueba,
estamos definiendo que se espera RuntimeException cuando se invoca el método ticTacToe.jugar(5, 2).

Ejecutamos esta prueba 3 veces, la primera vez, debería fallar porque el método jugar no existe. Una vez que se agrega,
debería fallar porque no se lanza RuntimeException. La tercera vez, debería tener éxito porque el
código que corresponde a esta prueba está completamente implementado.

Primera vez falla porque el metodo jugar no existe:

![](assets/8.jpg)

![](assets/9.jpg)

Ahora para la segunda vez debe fallar porque no se lanza RuntimeException:

![](assets/10.jpg)

![](assets/11.jpg)

Para la tercera vez debe tener exito, ya que en esta parte se ha implementado el codigo 
correspondiente a la prueba:

![](assets/12.jpg)

Ejecutamos la prueba y pasa correctamente:

![](assets/13.jpg)

Prueba limites del tablero II

Ahora debemos validar el eje y

Primero hacemos la prueba donde falla:

![](assets/14.jpg)

Luego implementamos la validacion para y:

![](assets/15.jpg)

Ejecutamos la prueba y vemos que pasa correctamente:

![](assets/16.jpg)


## Pregunta 2

### Explica los resultados del archivo .json

En los resultados tenemos informacion sobre astronautas en el espacio, se tiene un campo "message" 
que indica el resultado del servicio web, que en este caso es "success" lo que significa que la 
solicitud fue exitosa y los datos se obtuvieron de forma correcta. Luego tenemos "people" que es un campo 
que contiene un arreglo de objetos JSON, cada objeto representa un astronauta en el espacio y cada 
objeto contiene dos campos, name que es el nombre del astronauta y craft que es el nombre de la nave 
en la que se encuentra el astronauta. Por ultimo tenemos "number" que indica el numero total de astronautas 
que se encuentran en el espacio, en este caso es 10, por lo que habrian 10 astronautas en el espacio.

Creamos las clases basicas

Clase Assignment, que representa el nombre del astronauta y la estacion espacial:

![](assets/1.jpg)

Clase AstroResponse, que nos va a mostrar el numero de personas en el espacio, un mensaje de exito 
y el arreglo o lista de personas de las asignaciones:

![](assets/2.jpg)

Ahora usaremos el patron de diseño Gateway para acceder al servicio web RESTful.

Crearemos la interfaz Gateway:

![](assets/3.jpg)

Y tambien creamos la clase AstroGateway usando la API HttpClient

![](assets/4.jpg)

Tambien debemos definir la clase AstroService, la cual tiene como funcion convertir los registros 
devueltos por el gateway en un mapa de java.

Se explica su funcionamiento en los comentarios de codigo que se muestran a continuacion:

![](assets/5.jpg)

Teniendo todo esto configuramos el main:

![](assets/6.jpg)

Imprime la cantidad de astronautas por nave y tambien el formato JSON con los datos para verificar:

![](assets/7.jpg)
















