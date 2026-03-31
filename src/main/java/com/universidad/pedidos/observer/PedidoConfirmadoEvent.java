package com.universidad.pedidos.observer;
import org.springframework.context.ApplicationEvent;

import com.universidad.pedidos.modelo.Pedido;
public class PedidoConfirmadoEvent extends ApplicationEvent {
 private final Pedido pedido;
 public PedidoConfirmadoEvent(Object source, Pedido pedido) {
 super(source);
 this.pedido = pedido;
 }
 public Pedido getPedido() { return pedido; }
}
