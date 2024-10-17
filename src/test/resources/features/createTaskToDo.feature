Feature: WhenDo

  Scenario Outline: Create un conjunto de tareas en WhenDo

    Given Tomas tiene acceso a whenDoApp
    When el crea una nueva tarea con titulo <titulo> y descripcion <descripcion>
    Then el espera que la tarea <titulo> haya sido creada

    Examples:
      | titulo  | descripcion  |
      | titulo1 | descripcion1 |
      | titulo2 | descripcion2 |

