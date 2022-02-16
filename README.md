# SOFKA-U cantera nivel 2

## semana 2 - taller 2

[![N|Solid](https://bochackathon.com/wp-content/uploads/2019/07/java.png)](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/ing-italog?tab=repositories)

Esta  aplicación da solución al taller de modelamiento de datos en Java, el programa se ejecuta desde la clase `Main` la cual esta alojada en la carpeta `src`, este software se mantiene ejecutado hasta que el usuario decida finalizar su ejecutación a través de un comando o terminar por fuerza.

> Version java 15 
> Text File Encoding UTF-8
> Desarrollado en eclipse
> Version: 1.0.0 2022-02-16

### Ejecución

Para una correcta ejecución se recomienda abrir desde  el IDE [Eclipse](https://www.eclipse.org/downloads/), ya que este IDE cuenta con una instalación automatica de las librerias necesarias al momento de importa el código, también puedes seguir las siguientes instrucciones para un correcto funcionanmiento.

- Descagar el archivo .ZIP y descomprimirlo en una carpeta de fácil acceso.
- En eclipse seleccionar `File`, seguido seleccionar `Open Projects from File System`
- Seleccionar `Import source:` marcar `Directory...`
- Buscar la carpeta descomprimida y marcar `Select Folder`
- Dar enter en `Import`
- Eclipse automaticamente instalara las librerias necesarias para una correcta ejecución.

En caso de no poder ejercutar el proyecto correctamente, también recomienda crear un proyecto nuevo y anexar la carpeta `src`.

### Carpetas

- [src] - Contiene los paquetes `Controllers`, `views`, `entity`, `exercise` y subcarpetas adentro de `exercise`.
- [Controllers]  - Contiene la clase principal la cual es la encarga de ejecutar el programa y llamar a la clase de servicio.
- [views] - Contiene una clase con métodos capaces de mostrar diferentes mensajes por consola.
- [entity] - Contiene las clases de `Planet`, `Vehicles` y clases que heredan de Vehicles.
- [exercise] - Contiene las subcarpetas de los ejercicios 1, 2, 3, 4, 5 y 6, cada subcarpeta tiene las clases que dan respuesta a cada uno de los ejercicios planteados.

### Detalle de las SubCarpetas EXERCISE

- [exercise_1] - Contiene dos clases `SystemSolar` y `CalculationForceGravitaroy`, son las clases encargadas de calcular las fuerza gravitatoria entre los planetas de la vía lactea, los datos adentro de esta clase no son fieles a la realidad.

- [exercise_2] - Contiene un documento .TXT llamado `response_exercise2.txt` el cual da respuesta al ejercicio # 2., este documento se ejecuta cuando el usuario en el menú principal elige la opción # 2.

- [exercise_3] - Contiene la clase `MakeArrayNumber` sirve para crear una lista de número aleatorios, al usuario se le solicitara que ingrese un número entero entre 1 y 100 para crear un arreglo del mismo tamaño del valor ingreso, este arreglo se poblara con números aleatorios, una vez realizada esta operación el usuario podra elegir entre ordenar los números en forma ascendentes o descedente.

- [exercise_4] - Contiene las clases `CreatedFerry` y `ObjectCreator`, la clases CreatedFerry instancia a la clase ObjectCreator la cual es la encarga de crear un vehiculo de tipo ferry, la clases CreatedFerry mostrara al usuario las opciones disponibles, como es el listar los ferrys, crear otro ferry, volver al menú principal o terminar la ejecución del programa.

- [exercise_5] - Contiene las clases `CreatedVehicles` y `ObjectCreator` la cual es la encarga de crear 5 tipos de vehiculos como una bicicleta, un Carro, un Camion, una lancha y una motocicleta, estos objetos se guardan en un arreglo con capacidad máxima de 10 vehiculos, el usuario puede elegir si deseas continuar agregando mas vehiculos, listar los vehiculos, volver al menú principal o terminar la ejecución del programa

- [exercise_6] - Contiene la clase `CreatedVector` la cual es la encargada de crear un vector con números que el usuario ingrese por teclado, una vez el usuario ingrese un número ya existente en el vector, la clase guarda el arreglo en un fichero(.TXT), adentro de la misma subcarpeta con un identificador único, seguido a la persistencia del documento se abre el fichero para revelar la información al usuario, el usuario puede crear hasta 2000 ficheros diferentes.


@Author [Italo Alberto Guevara Villamil - alberto.villamil.1997@gmail.com]