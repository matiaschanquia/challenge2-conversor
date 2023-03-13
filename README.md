# Conversor de divisas y medidas
 Challenge 2 del curso ONE (Oracle Next Education) de Oracle y Alura en el que hay que realizar un programa que sea conversor de monedas y también agregar un conversor extra a elección. Se debe utilizar Java. 
 
## Requisitos

Teniendo en cuenta que la moneda de mi país es el peso Argentino...

 - Convertir de la moneda de mi país a Dólar.
 - Convertir de la moneda de mi país a Euros.
 - Convertir de la moneda de mi país a Libras Esterlinas.
 - Convertir de la moneda de mi país a Yen Japonés.
 - Convertir de la moneda de mi país a Won sul-coreano.
 
 También debe poder convertir inversamente.
 
 ## Extra
 
 Como extra al desafio realicé un conversor de medidas.

## Proyecto finalizado

Al iniciar la app esto es lo que se verá:

![Inicio de la app](https://github.com/matiaschanquia/challenge2-conversor/blob/main/readmeAssets/inicio.png)

La app cuenta con dos opciones de conversores: conversor de monedas y conversor de medidas. A continuación, así se verían con cada uno seleccionado:

![Conversor de moneda](https://github.com/matiaschanquia/challenge2-conversor/blob/main/readmeAssets/monedas.png)

![Conversor de medida](https://github.com/matiaschanquia/challenge2-conversor/blob/main/readmeAssets/medidas.png)

Cada conversor cuenta con dos opciones de las que derivan las demas opciones.

Al estar en un conversor, este botón estará marcado con borde celeste.

El conversor de monedas cuenta con la opción de pesos argentinos a otra moneda y de otra moneda a pesos argentinos (las otras monedas serían: dólar, euros, libra esterlina, yen japonés y won sul-coreano).

El conversor de medidas cuenta con la opción de metros a otra medidas y de otra medidas a metros (las otras medidas serían: kilómetro, centímetro, milímetro, yarda y pulgada).

El campo de texto cuenta con las validaciones para que no se puedan ingresar otra cosa que no sean números y un solo punto para la parte decimal.

El programa cuenta con manejo de excepciones para casos en el que no se pueda "parsear" el monto ingresado. En ese caso se mostrará el resultado de "Valor incorrecto".

Agregue un link a mi portfolio haciendo click en mi nombre "Matias Chanquia".

## Instalar

Para probar el programa se debe instalar el ejecutable de Jar.

En el repositorio buscar la sección de releases -> v1.0.1 -> Assets -> Conversor.jar. Así, se instalará el ejecutable.

O haciendo click <a href="https://github.com/matiaschanquia/challenge2-conversor/releases/download/1.0.1/Conversor.jar">aca</a> para descargar directamente.

## Demo

![Demo de la app](https://github.com/matiaschanquia/challenge2-conversor/blob/main/readmeAssets/conversor.gif)

