# SOLID
integrantes: Mateo González y Joao Muñoz.

Repositorio github para los principios SOLID; Conceptos SOLID que se violan en el codigo proporcionado por el profesor.

1.Single Responsibility Principle

Se viola el principio de SRP en tres archivos, EmployeeManager, EmployeeOperations y ReportGenerator; El mas obvio es ReportGenerator, donde encontramos que el report Manager se encarga de dos cosas, generar un reporte en Excel ó un reporte en PDF.

![image](https://github.com/user-attachments/assets/d07ba0ab-c570-4930-bc37-be49f0a9c95e)

El segundo no tan obvio, es el EmployeeManager y EmployeeOperations, donde vemos que violan mas de una regla SOLID, pero en este caso especifico, nos centramos en que los dos se encargan de las operaciones del usuario, sin embargo hacen demas, como lo es calcular el salario del empleado. Como EmployeeManager implementa a EmployeeOperations, tienen las mismas funciones.

![image](https://github.com/user-attachments/assets/192e8c5e-bcb8-4de5-9c94-ce1e3ce39b0d)

2. Open to expansion Closed to modification Principle

El ReportGenerator no cumple con este principio, vemos que al manejar los reportes el mismo sin ninguna otra ayuda, pude surgir la pregunta. Y si ahora quiero manejar reportes en Word? o. y si solo quiero manejar reportes en Excel y no PDF? entonces nos damos cuenta que esta clase esta predispuesta tanto a expansion como a modificación.

![image](https://github.com/user-attachments/assets/a5d78909-a221-43c9-9e08-8462cd4ac092)

3. Liskov substitution Principle

Aqui encontramos a la clase PartTimeEmployee, si la miramos de cerca, se extiende de otra clase padre llamada Employee, sin embargo se comporta diferente en el aspecto que sobreescribe el metodo de getName() para que no se pueda usar, y por ende, rompiendo la ley de Liskov pues esta claramente nos dice que Padres deberian ser intercambiables con Hijos.

![image](https://github.com/user-attachments/assets/c3076615-7033-4125-ae55-0a1c6001e851)

4. Interface Segregation Principle

En este principio, se nos dice que una interfaz no tiene que tener tantos metodos, entre otras cosas, resaltamos lo de pocos metodos, siendo mejor varias interfaces especificas que pocas generales. Por eso la interfaz EmployeeOperations no cumple con este principio, ya que hace más de lo que deberia.

![image](https://github.com/user-attachments/assets/c3057be4-fb6f-4ab1-832f-52a9ed0d0a5c)

5. Dependency Inversion Principle

Para este principio, nos dice que las clases deberian depender de abstracciones o interfaces, no de otras clases. Muy claro se muestra como la clase ParttimeEmployee rompe este principio, porque depende no de una interfaz o abstraccion, si no de la clase Employee.

![image](https://github.com/user-attachments/assets/fa2219f2-9f24-4557-81e2-dce7a2c273fe)

Extends

![image](https://github.com/user-attachments/assets/e6a16637-f8ad-4aa0-a767-fcc8c9667f5e)

Con esto terminando el analisis del codigo y procediendo a aplicar los principios hablados para arreglar en codigo.
