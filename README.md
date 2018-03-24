# UT13 Acceso a ficheros
Este ejercicio parte del anterior, solo que los datos los recoge de un archivo CSV llamado contactos.csv 
#
Estos datos que están en el siguiente orden [Nombre,Apellidos,DNI,Edad,Calle,CodigoPostal,Provincia],se encuentran separado por una "," y así los incluye en el ArrayList de la clase Persona para poder hacer trabajar los métodos de busqueda, insertar, ordenar, etc..
#
Otra opción de escritura utiliza lo definido en en el ArrayList y sobrescribe en el archivo contactos.csv
#
Actualización : Se corrige el método de búsqueda de nombre, ahora incluye también los nombres que estén repetidos con un condiconal equals
# Actualización 22 de marzo : Se utiliza la clase lista como un objeto, prescindiendo de los métodos estáticos. Se incluye un comprobador de DNI existente para no incluir dos números iguales.
