JAVA THREAD SCHEDULER

Agendador de hilo

Es parte de la JVM que decide que hilo debe ejecutarse.

Solo un hilo puede correr a la vez en un solo proceso.

Utiliza programacion preventiva y porcion de tiempo.

En programacion preventiva, la tarea con la prioridad mas alta hasta que entra en un estado dde espera o estado muerto o una tarea con prioridad mas alta entra en existencia. 

En porcion de tiempo, una tarea se ejecuta por una cantidad predefinida de tiempo, luego entra en el grupo de tareas en estado listo para ejecutarse. 

El agendador entonces determina cuales tareas deben ejecutarse a continuacion, basadas en prioridad y otros factores.