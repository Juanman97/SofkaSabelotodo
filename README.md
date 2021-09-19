# Sabelotodo

## Descripción

Sabelotodo es un programa de preguntas y respuestas, en donde cada categoría representa un nivel de dificultad diferente y se abordan en orden de dificultad ascendente. Cada una de estas categorías tiene 5 preguntas con 4 opciones de respuesta de opción única, y para cada categoría se seleccionará una de las 5 preguntas de manera aleatoria. Cada pregunta buena suma 100 puntos, cada pregunta mala resta 100 puntos, y rendirse antes de contestar termina el juego sin penalización de puntos.

## Instrucciones

1. En primer lugar, descargar la carpeta *Sabelotodo* en donde se encuentra todo el proyecto.
2. Cargar el proyecto
3. Ubicar el script de creación de la base de datos en MySQL, para lo cual se debe entrar en la ruta *Sabelotodo/src/Utils/*, abrir el archivo *Script_DB_creation.sql* y ejecutarlo para crear las tablas y las preguntas y respuestas.
4. Ahora dentro del proyecto, asegurarse que en *Libraries* se encuentre cargado el archivo *mysql-connector-java-8.0.26.jar* para la conección con la base de datos. Si esto no es así, cargarlo de la carpeta del proyecto, ubicado en la ruta *Sabelotodo/lib/*.
5. Abrir la interfaz *Properties* ubicada en el package *Utils*, e ingresar los datos de acceso para la instancia local *username*, *password* y *url*.
6. Finalmente, en el package *sabelotodo* se encuentra *Sabelotodo.java*, el cual es el archivo *main* del proyecto, el cual se debe ejecutar.

## Detalles

### Estructura del proyecto
El proyecto de java está estructurado utilizando MVC, distribuido en diferentes paquetes de la siguiente forma:
* El paquete *Access* contiene los archivos necesarios para conectar java con la base de datos.
* El paquete *Utils* contiene archivos útiles para el proyecto, como la conección con la base de datos.
* El paquete *Model* contiene los objetos relacionados a las tablas de la base de datos *Questions*, *Answers* y *Points*.
* El paquete *View* contiene los objetos relacionados a cada una de las vistas que contiene el proyecto: *HomeScreen*, *Game*, *Rules* y *Scores*.
* El paquete *sabelotodo* contiene el archivo main desde donde se lanza la vista principal.

### Funcionamiento del código
El órden lógico de ejecución del código inicia en la conección con la base de datos, usando las credenciales del archivo *Properties*. Luego se utilizan los modelos para diseñar objetos que contengan la información de cada una de las tablas de acuerdo a su estructura en la base de datos. Para obtener dicha información y construir los objetos, se crean los DAO (*DataBase Object*) de cada tabla, en donde están las rutinas para ejecutar un script de *CRUD* en la base de datos según se requiera, y obtener los resultados (preguntas, respuestas, tabla de puntuaciones) en forma de un objeto de modelo, un *ArrayList* de un objeto de modelo, un *string*, o para agregar entradas a la base de datos (agregar entradas a la tabla de puntuaciones). Finalmente estos DAO son utilizados en cada una de las vistas (controlador), para mostrar información o agregar datos ingresados por el usuario en la base de datos.

### Funcionamiento de la aplicación
La págna principal contiene un botón para ver la tabla de puntuaciones histórica, un botón para ver las reglas de juego, un campo para ingresar el nombre (si no se ingresa se usará como default *Jugador*, y un botón para empezar el juego.
Al iniciar el juego, se inicia en el *Nivel 1*, la categoría más fácil. De momento sólo hay 5 preguntas por categoría, así que aleatoriamente se selecciona una de las 5 preguntas y se enseña en la pantalla junto con sus 4 opciones de respuesta y un botón para seleccionar la que se crea que es la correcta. Se mostrará un aviso indicando si es correcta o no, para el primer caso sumando 100 puntos a la puntuación total y avanzando al siguiente nivel seleccionando nuevamente una pregunta aleatoria de dicho nivel, y para el segundo caso restando 100 puntos a la puntuación total y terminando la partida. Además, hay un botón para rendirse, en donde se mostrará un aviso diciendo que el juego terminó y la respectiva puntuación. En la parte superior derecha se indica los puntos acumulados hasta el momento y en la parte superior izquierda el nivel actual. El juego termina al fallar una pregunta, al rendirse o al completar correctamente los 5 niveles, y posterior a esto, se agrega el puntaje al registro y se muestra la ventana de puntuaciones con un botón para regresar al menú principal y empezar un nuevo juego si se quiere.
