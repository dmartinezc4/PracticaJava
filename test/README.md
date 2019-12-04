# Test
Esta carpeta contiene los test de las clases utilizadas anteriormente

## Cobertura de Testeo
Por ahora todos los metodos de los test funcionan sin dar error a la hora de run exceptuando los comentados (actualmente 2 el getValue de Film y Book; pero haciendolo fuera de los tests el mismo objeto me da lo que pongo a la hora de hacer assertEquals).
El test de ClockFactory (del patron factory method); resume los tests de tanto Clock12H como Clock24.
Product es la unica interfaz que puedo testear pues no se como testear los System.out.println().
