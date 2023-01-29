#Ejercicios Programación: Semana 13

### Ejercicio 1
Crea una clase “Entidad” con los atributos “vida” , “ataque” y “defensa” de tipo entero y “nombre” tipo cadena de caracter.

### Ejercicio 2
Crea una clase que herede de “Entidad” llamada “Jugador”. Tendrá los
atributos de “experiencia” y “nivel”, de tipo entero, además de los
heredados.

### Ejercicio 3
Crea una clase que herede de “Entidad” llamada “Enemigo”. Tendrá el
atributo “Dificultad” de tipo entero.

### Ejercicio 4
Crea las funciones getter y setter en “Entidad” y las siguientes funciones:
- public int turno(int accion)
- public void info()

### Ejercicio 5
En la clase “Jugador”, sobreescribe el método “turno” de forma que,
dependiendo de la acción se devuelva un valor u otro.
Por ejemplo, si la acción es 0 que devuelva el ataque multiplicado por el
nivel, si es 1, la defensa multiplicada por el nivel, etc. Libre elección.

### Ejercicio 6
En la clase “Enemigo”, sobreescribe el método turno de forma que,
dependiendo de la acción, se devuelva un valor u otro.
Por ejemplo, si la acción es 0, se devuelve el ataque multiplicado por la
dificultad, si es 1, se devuelve la mitad del ataque, etc. Libre elección.

### Ejercicio 7
En la clase “Main”, en el método “main”, instancia un objeto de tipo
“Jugador” y otro de tipo “Enemigo”. Crea un array de tipo “Entidad”, de
tamaño 2 y asigna al índice 0 el objeto creado de “Jugador” y al índice 1 el
objeto creado de “Enemigo”.

### Ejercicio 8
Crea un bucle que recorra dicho array, llamando a la función “turno” de
cada elemento del array. Observa el comportamiento y anota, en un
comentario, un breve análisis de las posibilidades o usos que podría tener
este tipo de construcciones.