## Tienda - Patrones de Comportamiento (Observer & Strategy)
Proyecto en Spring Boot 3.2.0 que implementa los patrones Observer y Strategy en un sistema de pedidos.
El sistema notifica eventos a múltiples suscriptores (Observer) y permite seleccionar dinámicamente estrategias de descuento (Strategy).
---
## 📂 Estructura del Proyecto

```text
tienda-comportamiento/
├── pom.xml
└── src/
    ├── main/java/com/universidad/tienda/
    │   ├── observer/
    │   │   ├── Subject.java
    │   │   ├── Observer.java
    │   │   ├── PedidoPublisher.java
    │   │   ├── EmailSubscriber.java
    │   │   ├── SmsSubscriber.java
    │   │   └── PushSubscriber.java
    │   ├── strategy/
    │   │   ├── DescuentoStrategy.java
    │   │   ├── DescuentoFijo.java
    │   │   ├── DescuentoPorcentaje.java
    │   │   └── SinDescuento.java
    │   └── modelo/
    │       └── Pedido.java
    └── test/java/com/universidad/tienda/
        └── StrategyTest.java

```
---

## 🔔 Patrón Observer: Flujo de eventos
El Publisher (PedidoPublisher) publica eventos cuando cambia el estado de un pedido.
Los Subscribers (Email, SMS, Push) se suscriben para recibir notificaciones.
```text
PedidoPublisher -> notifica() -> EmailSubscriber
                               -> SmsSubscriber
                               -> PushSubscriber
```
✅ Ventaja: se pueden añadir nuevos canales de notificación sin modificar el código existente.

---

## 🎯 Patrón Strategy: Selección de descuentos
El Contexto (Pedido) recibe una estrategia de descuento y la aplica dinámicamente.

Estrategias disponibles
SinDescuento: no aplica cambios.

DescuentoFijo: resta un valor fijo.

DescuentoPorcentaje: aplica un porcentaje sobre el total.
✅ Ventaja: se pueden activar distintas políticas de descuento sin modificar la clase Pedido.

---

## 🧪 Ejecución de Pruebas
Ejecutar:
```bash
mvn test
```

<img width="635" height="222" alt="image" src="https://github.com/user-attachments/assets/875acba8-a6fa-4f9f-b886-ed3bae2a2d08" />
