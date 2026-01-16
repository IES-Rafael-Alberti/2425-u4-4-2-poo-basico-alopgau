
# Práctica 4.1: Programación Orientada a Objetos en Kotlin

## Identificación de la Actividad

- **ID de la Actividad:** 4.1  
- **Módulo:** PROG (Programación)  
- **Unidad de Trabajo:** Unidad 4: Programación Orientada a Objetos  
- **Fecha de Creación:** 15/1/25
- **Fecha de Entrega:** 16/1/25
- **Alumno(s):**  
  - **Nombre y Apellidos:** [Nombre y Apellidos del alumno]  
  - **Correo electrónico:** alopgau418@g.educaand.es  
  - **Iniciales del Alumno/Grupo:** ALG

## Descripción de la Actividad

Esta práctica consiste en la implementación de varios programas en Kotlin que demuestran los conceptos fundamentales de la Programación Orientada a Objetos (POO). Se han desarrollado diferentes clases que representan entidades del mundo real como cuentas bancarias, estudiantes, libros, productos y vehículos, cada una con sus propiedades y comportamientos específicos.

Los objetivos principales son:
- Implementar clases con constructores, propiedades y métodos
- Manejar excepciones con bloques try-catch
- Utilizar inicializadores (`init`) y validaciones (`require`)
- Implementar getters y setters personalizados
- Crear constructores secundarios
- Demostrar encapsulación y abstracción

## Instrucciones de Compilación y Ejecución

### Requisitos Previos
- Kotlin 1.8+ o superior
- IntelliJ IDEA o cualquier IDE que soporte Kotlin
- Kotlin compiler (kotlinc)

### Compilación y Ejecución Individual
Cada programa se puede compilar y ejecutar por separado:

```bash
# Compilar y ejecutar el programa de Cuenta Bancaria
kotlinc Banco.kt CuentaBancaria.kt -include-runtime -d Banco.jar
java -jar Banco.jar

# Compilar y ejecutar el programa de Estudiantes
kotlinc Estudiante.kt EstudianteMain.kt -include-runtime -d Estudiante.jar
java -jar Estudiante.jar

# Compilar y ejecutar el programa de Libros
kotlinc Libro.kt LibroMain.kt -include-runtime -d Libro.jar
java -jar Libro.jar

# Compilar y ejecutar el programa de Productos
kotlinc Producto.kt ProductoMain.kt -include-runtime -d Producto.jar
java -jar Producto.jar

# Compilar y ejecutar el programa de Vehículos
kotlinc Vehiculo.kt Viaje.kt -include-runtime -d Viaje.jar
java -jar Viaje.jar
```

### Ejecución desde IDE
1. Abrir el proyecto en IntelliJ IDEA
2. Ejecutar cada archivo `Main.kt` individualmente haciendo clic derecho y seleccionando "Run"

## Desarrollo de la Actividad

### Descripción del Desarrollo
Se han implementado 5 ejercicios independientes que abordan diferentes aspectos de la POO:

1. **Cuenta Bancaria**: Gestión de saldo con manejo de excepciones
2. **Estudiante**: Validación de notas y propiedades personalizadas
3. **Libro**: Constructores primarios y secundarios
4. **Producto**: Gestión de inventario con métodos de venta y reabastecimiento
5. **Vehículo**: Registro de kilometraje y detalles del vehículo

Cada ejercicio sigue el principio de encapsulación, manteniendo las propiedades privadas y proporcionando métodos públicos para interactuar con los objetos.

### Código Fuente

#### Ejercicio 1: Cuenta Bancaria
- **Clase principal:** [CuentaBancaria.kt](CuentaBancaria.kt)
- **Programa principal:** [Banco.kt](Banco.kt)

#### Ejercicio 2: Estudiante
- **Clase principal:** [Estudiante.kt](Estudiante.kt)
- **Programa principal:** [EstudianteMain.kt](EstudianteMain.kt)

#### Ejercicio 3: Libro
- **Clase principal:** [Libro.kt](Libro.kt)
- **Programa principal:** [LibroMain.kt](LibroMain.kt)

#### Ejercicio 4: Producto
- **Clase principal:** [Producto.kt](Producto.kt)
- **Programa principal:** [ProductoMain.kt](ProductoMain.kt)

#### Ejercicio 5: Vehículo
- **Clase principal:** [Vehiculo.kt](Vehiculo.kt)
- **Programa principal:** [Viaje.kt](Viaje.kt)

### Ejemplos de Ejecución

#### Ejercicio 1: Cuenta Bancaria
```
Entrada: Crear cuenta para Antonio, ingresar 100, retirar 50, intentar retirar 500
Salida Esperada:
Saldo después de la operación: 100.0
Saldo después de la operación: 50.0
Operación inválida
```

#### Ejercicio 2: Estudiante
```
Entrada: Crear estudiantes con notas válidas e inválidas
Salida Esperada:
Nota inválida
Nota inválida
Estudiante: Carlos, Nota: 8.0
Estudiante: Pepe, Nota: 2.0
```

#### Ejercicio 3: Libro
```
Entrada: Crear libros con diferentes constructores
Salida Esperada:
Libro: El Quijote por Cervantes, Páginas: 450, Leido: false
Libro: Caperucita por Anónimo, Páginas: 90, Leido: true
Libro: hola por adios, Páginas: 100, Leido: false
```

#### Ejercicio 4: Producto
```
Entrada: Crear productos y realizar operaciones de venta y reabastecimiento
Salida Esperada:
Producto: Ruedas, Precio: 90.0€, Stock: 6
Producto: Airbags, Precio: 50.0€, Stock: 7
Producto: Parabrisas, Precio: 250.0€, Stock: 6
Producto: Ruedas, Precio: 90.0€, Stock: 26
```

#### Ejercicio 5: Vehículo
```
Entrada: Registrar viaje de 50km a un Toyota Yaris
Salida Esperada:
Toyota Yaris con 50.0 kilómetros
```

### Resultados de Pruebas
Todos los programas se han ejecutado correctamente y producen los resultados esperados:
- ✅ La cuenta bancaria maneja correctamente los fondos insuficientes
- ✅ El estudiante valida las notas dentro del rango 0-10
- ✅ Los libros se crean correctamente con ambos constructores
- ✅ Los productos gestionan adecuadamente el stock
- ✅ El vehículo registra correctamente los kilómetros

## Documentación Adicional

- **Manual de Usuario:** No aplica para esta práctica
- **Autorización de Permisos:** El profesor tiene permisos de lectura en el repositorio

## Conclusiones

Esta práctica ha permitido aplicar los conceptos fundamentales de la Programación Orientada a Objetos en Kotlin de manera práctica. Se han implementado:

1. **Encapsulación** mediante el uso de propiedades privadas
2. **Abstracción** a través de la definición de interfaces claras para cada clase
3. **Manejo de excepciones** para validar entradas y operaciones
4. **Constructores múltiples** para diferentes casos de uso
5. **Validaciones en tiempo de inicialización** usando `init` y `require`

Los principales aprendizajes incluyen:
- La importancia de validar datos en los setters y constructores
- Cómo manejar excepciones de manera controlada
- La flexibilidad de los constructores en Kotlin
- Cómo diseñar clases cohesivas con responsabilidades bien definidas

## Referencias y Fuentes

- Documentación oficial de Kotlin: https://kotlinlang.org/docs/
- Guía de estilo de Kotlin: https://kotlinlang.org/docs/coding-conventions.html
- Material de clase de la Unidad 4: Programación Orientada a Objetos

### Notas Adicionales:

1. **Nombres de Archivos y Repositorios:** Los archivos siguen la nomenclatura adecuada para Kotlin
2. **Permisos:** El repositorio está configurado con permisos de lectura para el profesor
3. **Formato:** Este README cumple con los requisitos de documentación
4. **Compilación y Ejecución:** Se incluyen instrucciones claras para compilar y ejecutar cada programa
```