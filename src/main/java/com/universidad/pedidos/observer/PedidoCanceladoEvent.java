package com.universidad.pedidos.observer;
import org.springframework.context.ApplicationEvent;

import com.universidad.pedidos.modelo.Pedido;
public class PedidoCanceladoEvent extends ApplicationEvent {
 private final Pedido pedido;
 public PedidoCanceladoEvent(Object source, Pedido pedido) {
 super(source);
 this.pedido = pedido;
 }
 public Pedido getPedido() { return pedido; }
}