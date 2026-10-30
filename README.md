Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código completo de **Simulación de Cuenta de Fidelidad y Canje de Puntos (Encapsulamiento y Lógica de Negocio en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🎁 Simulación de Cuenta de Fidelidad y Canje de Puntos (Encapsulamiento y Reglas de Negocio en Java)

Este proyecto es una aplicación en Java que modela un sistema de membresía y fidelización de clientes, permitiendo acumular puntos en función de los montos de compra y canjear premios bajo estrictas validaciones de saldo disponible. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la ejecución de algoritmos de cálculo matemático y transaccional en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`CuentaFidelidad`**: Modela la cuenta del socio y protege la integridad de su identificación, categoría de membresía y saldo de puntos acumulados.
* **Atributos privados (`private`)**: `numeroSocio`, `nivelMembresia` y `puntosAcumulados`, impidiendo modificaciones directas o manipulación arbitraria desde el exterior.
* **Constructor**: Inicializa la cuenta asignando el número de socio, el nivel de membresía (ej. "oro") y estableciendo el saldo inicial de puntos en cero.
* **Métodos operativos de negocio**:
* `acumularPuntos(double montoCompra)`: Valida que el monto de la compra sea positivo, calcula la proporción de puntos obtenidos (ej. 1 punto por cada 100 unidades monetarias) y los suma al acumulado actual, informando el estado por consola.
* `canjearPremio(int puntosRequeridos)`: Verifica que la cantidad de puntos solicitados sea positiva y que el usuario posea un saldo igual o superior al requerido. Si se aprueba, descuenta los puntos y retorna `true`; de lo contrario, rechaza la operación.
* `mostrarEstado()`: Imprime de forma consolidada los datos principales de la cuenta (número de socio, nivel y puntos vigentes).




* **`Main`**: Punto de entrada del programa. Instancia una cuenta de fidelización, simula operaciones sucesivas de acumulación por compras, realiza intentos de canje de premios exitosos y fallidos por falta de saldo, y muestra el reporte final del estado de la cuenta por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Cálculo Proporcional de Puntos:** El método de acumulación transforma el dinero gastado en puntos mediante una división entera controlada (`montoCompra / 100`), garantizando que solo montos válidos generen beneficios.
2. **Validación de Saldo para Canjes:** El método `canjearPremio` evalúa de forma estricta que existan suficientes puntos disponibles antes de autorizar la entrega del premio, previniendo saldos negativos.
3. **Encapsulamiento de Datos Sensibles:** Oculta los contadores y las variables de membresía, asegurando que cualquier variación en los puntos pase exclusivamente a través de los métodos transaccionales del objeto.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Puntos acumulado: 52 puntos.
Puntos acumulado: 74 puntos.
Premios canjeados correctamente.
Puntos requeridos insuficiente.
--- Información ---
Numero de socio: 1234
Nivel membresia: oro
Puntos acumulados: 24

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado:** Ocultamiento de la información interna del socio para proteger la coherencia de los puntos acumulados frente a modificaciones directas.
* **Lógica de Dominio Orientada a Objetos:** Las reglas de negocio de fidelización residen por completo dentro de la entidad correspondiente (`CuentaFidelidad`), fomentando la alta cohesión.
* **Diseño Modular:** Clara separación entre la lógica del modelo de puntos (`CuentaFidelidad`) y el flujo de ejecución de pruebas del usuario (`Main`).
