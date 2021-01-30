# AREP - Laboratorio 1

# Autor: Guillermo Esteban Bernal Bonilla

## Profesor: Luis Daniel Benavides Navarro AREP-2020-1

## Viernes 29-Enero-2021

## Media y Desviación estandar con MyLinkedList

El objetivo de este proyecto es facilitar el calculo de la media y la desviación estandar de una cantidad n numeros que sean agregados a un LinkedList propio, el cual cuenta con una implementación referente en nodos, esto permite realizar las operaciones basicas de una lista tales como agregar, eliminar y recorrer.

## Arquitectura de MyLinkedList

Este proyecto se construyo utilizando el lenguaje de Java, el editor Apache NetBeans IDE 12.2, y Maven para su ejecución.

## Licencia

La licencia utilizada para este proyecto es GPL-3.0 la cual se encuentra especificada en el siguiente enlace

[Licencia](https://github.com/EstebanK23/AREP-Laboratorio-1/blob/main/LICENSE.txt)

## Diseño

[diagrama](https://user-images.githubusercontent.com/54051399/106339374-6115c380-6264-11eb-9554-b57c92737318.png)

### Descripción del diseño

Este diseño consta de una fachada la cual es la clase principal App, también de 3 clases las cuales serán las encargadas de realizar la implementacion de mi LinkedList y el calculo de la media y desviacion estandar para cada archivo leido, como se muestra la clase Calculator obtendra una LinkedList para realizar los calculos, que a su vez la clase LinkedList estara conectada con la clase Node la cual mostrara los nodos y su funcionamiento para la creación de la LinkedList.

## Uso de Media y Desviación estandar con MyLinkedList

Lo primero que deberas hacer es abrir la terminal de tu ordenador (CMD) y obtener el proyecto que se encuenta en el siguiente enlace:

![Repositorio Media y Desviación estandar con MyLinkedList](https://github.com/EstebanK23/AREP-Laboratorio-1)

Para obtener el proyecto deberas clonarlo desde git, el cual ya debe estar instalado como se menciono anteriormente, para esto se usara el siguiente comando en la terminal.

![image](https://user-images.githubusercontent.com/54051399/106339505-c7024b00-6264-11eb-9279-4bcffc517d41.png)

El paso siguiente es compilar el proyecto haciendo uso del siguiente comando de Maven.

![image](https://user-images.githubusercontent.com/54051399/106339807-b3a3af80-6265-11eb-96c1-f9c550cc3c0e.png)

Al realizar este comando podremos ver los siguente

![image](https://user-images.githubusercontent.com/54051399/106339901-01b8b300-6266-11eb-9017-f034658d5b4d.png)

![image](https://user-images.githubusercontent.com/54051399/106339927-18f7a080-6266-11eb-8693-ab4d55bf20e7.png)

## Ejecución de pruebas

Para dar inicio a la ejecucion de pruebas se utilizara el siguiente comando de Maven.

![image](https://user-images.githubusercontent.com/54051399/106340605-5d843b80-6268-11eb-9dbc-16b17bc88538.png)

Esto nos mostrará la ejecución de pruebas de la calculadora con datos ingresados en el programa

![image](https://user-images.githubusercontent.com/54051399/106340661-89072600-6268-11eb-8949-db2d771d72bc.png)

Y tambien cada una de las funcionalidades implementadas del LinkedList.

![image](https://user-images.githubusercontent.com/54051399/106340694-ae942f80-6268-11eb-9571-e202499e9cb5.png)
