/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunos
 */
public class Banco {
    private String Nome;
    private List<Cliente> clientes;
    
    public Banco() {
    	clientes = new ArrayList<Cliente>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public Cliente getCliente(Cliente cliente) {
        boolean clienteExiste = this.clientes.contains(cliente);
        return clienteExiste? cliente : null;
       
    }
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public String getNome() {
        return Nome;
    }
}
